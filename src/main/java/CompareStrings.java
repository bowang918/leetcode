public class CompareStrings {
    /**
     * @param A: A string
     * @param B: A string
     * @return: if string A contains all of the characters in B return true else return false
     */
    public boolean compareStrings(String A, String B) {
        // write your code here
        if (A == null || B == null || (A = A.trim()).length() < 1 || (B = B.trim()).length() < 1)
            return false;

        int[] features = new int[26];

        for (char c : A.toCharArray()) {
            //make sure it's uppercase
            if (65 <= c && c <= 90)
                features[c - 65] = 1;
        }

        for (char c : B.toCharArray()) {
            if (65 <= c && c <= 90 && features[c - 65] == 0) return false;
        }

        return true;

    }
}
