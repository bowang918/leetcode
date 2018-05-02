public class Sorting {
    /**
     * @param A: an integer array
     * @return: nothing
     */
    public void sortIntegers(int[] A) {
        // write your code here

    }

    public static class SwapSort {
        public static void bubbleSort(int[] A) {
            int length;
            if (A == null || (length = A.length) < 2) return;
            for (int i = 0; i < length; i++) {
                for (int j = i + 1; j < length; j++) {
                    if (A[j] < A[i]) {
                        //swap
                        A[i] ^= A[j];
                        A[j] ^= A[i];
                        A[i] ^= A[j];
                    }
                }
            }
        }

        public static void quickSort(int[] A) {
            int length;
            if (A == null || (length = A.length) < 2) return;
            doQuickSort(A, 0, A.length - 1);
        }

        private static void doQuickSort(int[] A, int left, int right) {
            if (left < right) {
                int pivot = partition(A, left, right);
                doQuickSort(A, left, pivot - 1);
                doQuickSort(A, pivot + 1, right);
            }
        }

        private static int partition(int[] A, int left, int right) {
            int pivot = A[left];
            while (left < right) {
                while (left < right && pivot <= A[right]) {
                    right--;
                }
                A[left] = A[right];

                while (left < right && A[left] < pivot) {
                    left++;
                }
                A[right] = A[left];
            }
            A[left] = pivot;
            return left;
        }
    }

    public static class SelectSort {
        public static void selectSort(int[] A) {
            int length;
            if (A == null || (length = A.length) < 2) return;

            for (int i = 0; i < length; i++) {
                int min = i;
                for (int j = i + 1; j < length; j++) {
                    if (A[j] < A[min]) {
                        min = j;
                    }
                }
                int temp = A[i];
                A[i] = A[min];
                A[min] = temp;
            }
        }

        private static class Heap {
            private int size = 0;
            private int[] data;

            public Heap(int[] data) {
                this.data = data;
                size = data.length;
                heapify();
            }

            private void heapify() {
                for (int i = (size - 1) >> 1; i >= 0; i--) {
                    shiftDown(i);
                }
            }

            private void shiftDown(int i) {
                // 2 * i +1
                int temp = data[i];
                for (; i < (size >> 1); ) {
                    int child = (i << 1) + 1;

                    if (child + 1 < size && data[child + 1] <= data[child]) {
                        child++;
                    }

                    if (temp <= data[child]) {
                        break;
                    }

                    //swap
                    data[i] = data[child];
                    i = child;
                }
                data[i] = temp;
            }

            private void shiftUp(int i) {
                int temp = data[i];
                for (; i > 0; ) {
                    // (i-1) / 2
                    int p = (temp - 1) >> 1;
                    if (temp <= data[i]) {
                        break;
                    }
                    data[i] = data[p];
                    temp = p;
                }
                data[i] = temp;
            }

            private int peek() {
                return size > 0 ? data[0] : -1;
            }

            private int poll() {
                if (size < 1) return -1;
                int result = data[0];
                data[0] = data[--size];
                shiftDown(0);
                return result;
            }
        }

        public static void heapSort(int[] A) {
            int length;
            if (A == null || (length = A.length) < 2) return;

            Heap h = new Heap(A);

            int[] temp = new int[length];
            for (int i = 0; i < length; i++) {
                temp[i] = h.poll();
            }

            for (int i = 0; i < length; i++) {
                A[i] = temp[i];
            }

        }
    }

    public static class InsertSort {
        public static void insertSort(int[] A) {
            int length;
            if (A == null || (length = A.length) < 2) return;

            for (int i = 1; i < length; i++) {
                int temp = A[i], j = i - 1;
                while (j >= 0 && A[j] > temp) {
                    A[j + 1] = A[j];
                    j--;
                }
                A[j + 1] = temp;
            }
        }

        public static void shellSort(int[] A) {
            int length;
            if (A == null || (length = A.length) < 2) return;

            int d = length >> 1;

            for (; d > 0; d = length >> 1) {
                for (int x = 0; x < d; x++) {
                    for (int i = x + d; i < length; i += d) {
                        int temp = A[i], j = i - d;
                        while (j >= 0 && A[j] > temp) {
                            A[j + d] = A[j];
                            j -= d;
                        }
                        A[j + d] = temp;
                    }
                }
            }
        }
    }
}
