public class HashCode {
    /**
     * @param key:       A string you should hash
     * @param HASH_SIZE: An integer
     * @return: An integer
     */
    public int hashCode(char[] key, int HASH_SIZE) {
        // write your code here
        int result = 0, length;
        if (key != null && (length = key.length) > 0) {
            for (int i = 0; i < length; i++) {
                result = result * 33 + (int) key[i];
            }
        }
        return result % HASH_SIZE;
    }
}
