import com.sun.deploy.util.StringUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class ReverseWords {
    /*
     * @param s: A string
     * @return: A string
     */
    public String reverseWords(String s) {
        // write your code here

        return solution1(s);

    }

    private String solution2(String s) {
        int length;
        if (s == null || (length = (s = s.trim()).length()) < 1) return "";

        if (length < 2) return s.trim();

        String[] words = s.split("\\s+");
        length = words.length;

        StringBuilder sb = new StringBuilder(words[0]);


        for (int i = 1; i < length; i++) {
            sb.insert(0, " ").insert(0, words[i]);
        }

        return sb.toString();
    }

    private String solution1(String s) {
        int length;
        if (s == null || (length = s.length()) < 1) return "";

        if (length < 2) return s.trim();

        return Arrays.stream(s.split("\\s+"))
//                .filter(Objects::nonNull)
//                .map(String::trim)
//                .filter(s1 -> s1.length() > 0)
                .map(String::toCharArray).map(this::rotate).map(String::new).collect(Collectors.joining(" "));
    }

    private char[] rotate(char[] word) {
        int length;
        if (word == null || (length = word.length) < 2) return word;

        for (int i = 0, j = length - 1; i < j; i++, j--) {
            word[i] ^= word[j];
            word[j] ^= word[i];
            word[i] ^= word[j];
        }

        return word;
    }
}
