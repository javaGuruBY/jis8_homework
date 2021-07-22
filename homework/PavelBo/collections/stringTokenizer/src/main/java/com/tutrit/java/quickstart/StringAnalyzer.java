package com.tutrit.java.quickstart;

import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class StringAnalyzer {


    public List<String> splitToSentences(String text){
        return Collections.list(new StringTokenizer(text, ".")).stream()
                .map(token -> (String) token)
                .collect(Collectors.toList());
    }

    public List<String> splitToWords(String text){
        return Collections.list(new StringTokenizer(text, ",. ")).stream()
                .map(token -> (String) token)
                .collect(Collectors.toList());
    }

    public List<String> splitToPunctuationMarks(String text){
        return Collections.list(new StringTokenizer(text, " йцукенгшщзхъфывапролджэячсмитьбюЙЦУКЕНГШЩЗХЪФЫВАПРОЛДЖЭЯЧСМИТЬБЮ")).stream()
                .map(token -> (String) token)
                .collect(Collectors.toList());
    }


    public int contWords(String text){
        return splitToWords(text).size();
    }

    public int contPunctuationMarks(String text){
        return splitToPunctuationMarks(text).size();
    }

    public String mostCommonPunctuationMarks(String text) {
        List<String> punctuationMarksList = splitToPunctuationMarks(text);
        Map<String, Integer> punctuationMarksMap = new HashMap<>();
        listToMap(punctuationMarksList, punctuationMarksMap);
        String result = null;
        int maxValue = 1;
        for (Map.Entry<String, Integer> mostCommonPunctuationMark : punctuationMarksMap.entrySet()) {
            if (mostCommonPunctuationMark.getValue() > maxValue){
                maxValue = mostCommonPunctuationMark.getValue();
                result = mostCommonPunctuationMark.getKey();
            }
        }
        return result;
    }

    private void listToMap(List<String> punctuationMarksList, Map<String, Integer> punctuationMarksMap) {
        for (String punctuationMarks : punctuationMarksList){
            if (punctuationMarksMap.containsKey(punctuationMarks)){
                punctuationMarksMap.entrySet().stream().forEach(punctuationMark -> {
                    if (punctuationMark.getKey().equals(punctuationMarks)) {
                        int value = punctuationMark.getValue() + 1;
                        punctuationMark.setValue(value);
                    }
                });
            } else {
                punctuationMarksMap.put(punctuationMarks, 1);
            }
        }
    }
}
