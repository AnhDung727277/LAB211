package week1;

import java.util.HashMap;
import java.util.Map;

public class CountWC {

    private String input;

    public CountWC(String input) {
        this.input = input;
    }

    Map<String, Integer> countWords() {
        Map<String, Integer> wordcount = new HashMap<>();
        String[] words = input.toLowerCase().split("\\s+");
        for (String word : words) {

            wordcount.put(word, wordcount.getOrDefault(words, 0) + 1);
        }
        return wordcount;

    }

    Map<Character, Integer> countCharacter() {
        Map<Character, Integer> charcount = new HashMap<>();
        char[] charac = input.toLowerCase().toCharArray();
        for (char c : charac) {
            if (c != ' ') {
                charcount.put(c, charcount.getOrDefault(c, 0) + 1);
            }
        }

        return charcount;
    }
}