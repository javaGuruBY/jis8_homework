package com.tutrit.java.quickstart.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class TextService {

    public static final String BY_SENTENCES = "\\.";
    public static final String BY_PUNCTUATION = "(\\p{Punct})|(\\p{Blank})|(-)";

    public List<String> splitBySentences(String text) {
        String[] textArray = text.split(BY_SENTENCES);
        return Arrays.asList(textArray);
    }

    public int wordsCount(String text, String regExSplit) {
        String[] textArray = text.split(regExSplit);
        return Arrays.asList(textArray).size();
    }

    public int punctuationCount(String text) {
        var punctuations = 0;

        for (var i = 0; i < text.length(); i++) {
            if (text.charAt(i) == '.') {
                punctuations++;
            } else if (text.charAt(i) == '!') {
                punctuations++;
            } else if (text.charAt(i) == ',') {
                punctuations++;
            } else if (text.charAt(i) == '?') {
                punctuations++;
            } else if (text.charAt(i) == '-')
                punctuations++;
        }
        return punctuations;

    }

    public String mostRepeatableWord(String text) {
        Map<String, Integer> words = new HashMap<>();
        for (String word : text.toLowerCase().split(" ")) {
            words.merge(word, 1, Integer::sum);
        }
        return Collections.max(words.entrySet(), Map.Entry.comparingByValue()).getKey();

    }

    public int punctuationsCountByTokenizer(String text) {
        List<String> tokens = new ArrayList<>();
        var tokenizer = new StringTokenizer(text, ",.!?-");
        while (tokenizer.hasMoreElements()) {
            tokens.add(tokenizer.nextToken());
        }
        if (tokens.size() - 1 == 0) {
            return 0;
        }
        return tokens.size();
    }
}
