package com.tutrit.java.quickstart;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class UniqueWordCounter {

    Logger log = LoggerFactory.getLogger(UniqueWordCounter.class);

    private Map<String, Integer> words = new HashMap<>();

    public Map<String, Integer> getWords() {
        return words;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof UniqueWordCounter)) return false;
        UniqueWordCounter that = (UniqueWordCounter) o;
        return Objects.equals(getWords(), that.getWords());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getWords());
    }

    public void addWord(String word) {
        Integer value = words.get(word);
        if (value != null){
            words.put(word, ++value);
        } else{
            words.put(word, 1);
        }
    }

    public String getMostFrequentWord() {
        int resultInt = 0;
        String resultString = null;
        for(Map.Entry<String, Integer> word : words.entrySet()){
            if (word.getValue() > resultInt){
                resultInt = word.getValue();
                resultString = word.getKey();
            }
        }
        return resultString;
    }

    public void printWordsFrequency() {
        for(Map.Entry<String, Integer> word : words.entrySet()){
            log.info("word = {}, number of repetitions = {}",word.getKey(), word.getValue());
        }
    }
}
