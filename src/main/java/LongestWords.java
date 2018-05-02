import java.util.*;

public class LongestWords {
    /*
     * @param dictionary: an array of strings
     * @return: an arraylist of strings
     */
    public List<String> longestWords(String[] dictionary) {
        // write your code here
        List<String> result = new LinkedList<>();
        if (dictionary != null && dictionary.length > 0) {
            int max = 0;
            for (String word : dictionary) {
                if (word.length() >= max) {
                    if (word.length() > max) {
                        max = word.length();
                        result.clear();
                    }
                    result.add(word);
                }
            }

        }
        return result;
    }
}
