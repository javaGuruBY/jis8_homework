package com.github.pavelbopavel;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashSet;
import java.util.Set;

public class UniqueWordVocabulary {
    Set<String> words = new HashSet<>();
    Logger log = LoggerFactory.getLogger(UniqueWordVocabulary.class);

    public void addWord(String word) {
        if(!word.equals("")){
            words.add(word);
        }
    }

    public int getWordsCount() {
        return words.size();
    }

    public void printVocabulary() {
        words.forEach(w -> log.info(w));
    }
}
