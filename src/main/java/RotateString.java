public class RotateString {

    /**
     * @param str:    An array of char
     * @param offset: An integer
     * @return: nothing
     */
    public void rotateString(char[] str, int offset) {
        // write your code here
        if (str == null || str.length < 1 || offset < 1) {
            return;
        }

        offset = offset % str.length;

        int length = str.length;

        for (int i = 0; i < offset; i++) {
            char temp = str[length - 1];
            for (int j = length - 1; j > 0; j--) {
                str[j] = str[j - 1];
            }
            str[0] = temp;
        }
    }
}
