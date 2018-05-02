public class Uppercase {

    private static final char[] UPPERCASE = new char[]{'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
    /**
     * @param character: a character
     * @return: a character
     */
    public char lowercaseToUppercase(char character) {
        // write your code here
        return solution1(character);
    }

    private char solution1(char ch) {
        int ascii = (int) ch;
        if (ascii < 97 || 122 < ascii) {
            return ch;
        }
        return (char) (ascii - 32);
    }

    private char solution2(char ch) {
        int ascii = (int) ch;
        if (ascii < 97 || 122 < ascii) {
            return ch;
        }
        return UPPERCASE[(ascii - 97)];
    }
}
