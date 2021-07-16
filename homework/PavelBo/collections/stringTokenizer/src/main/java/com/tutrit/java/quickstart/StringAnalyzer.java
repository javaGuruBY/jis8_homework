package com.tutrit.java.quickstart;

import java.util.*;
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
}
