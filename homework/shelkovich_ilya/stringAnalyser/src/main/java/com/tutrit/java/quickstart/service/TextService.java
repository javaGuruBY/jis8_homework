package com.tutrit.java.quickstart.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class TextService {

    public static final String bySentences = "\\.";
    public static final String byPunctuations = "(\\p{Punct})|(\\p{Blank})|(-)";


    public List<String> splitBySentences(String text) {
        String[] textArray = text.split(bySentences);
        return Arrays.asList(textArray);
    }

    public int wordsCount(String text, String regExSplit) {
        String[] textArray = text.split(regExSplit);
        return Arrays.asList(textArray).size();
    }

    public int punctuationCount(String text) {
        var punctuations = 0;

        for (int i = 0; i < text.length(); i++) {
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

    public int punctuationsCountByTokenizer(String str) {
        List<String> tokens = new ArrayList<>();
        StringTokenizer tokenizer = new StringTokenizer(str, ",.!?-");
        while (tokenizer.hasMoreElements()) {
            tokens.add(tokenizer.nextToken());
        }
        if (tokens.size() -1 == 0){
            return 0;
        }
        return tokens.size();
    }
}
