package com.github.pavelbopavel;

import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashSet;
import java.util.Set;

import static junit.framework.Assert.assertEquals;

public class UniqueWordVocabulary {
    Set<String> words = new HashSet<>();
    Logger log = LoggerFactory.getLogger(UniqueWordVocabulary.class);

    public void addWord(String word) {
        if(word.equals("")){}
        else {
            words.add(word);

        }
    }

    public int getWordsCount() {
        return words.size();
    }

    public void printVocabulary() {
        words.forEach(w -> log.info(w));
    }

    UniqueWordVocabulary uniqueWordVocabulary;
    @Before
    public void setUp() {
        uniqueWordVocabulary = new UniqueWordVocabulary();
        uniqueWordVocabulary.words.add("hello");
        uniqueWordVocabulary.words.add("dog");
        uniqueWordVocabulary.words.add("cat");
    }

    @Test
    public void addWord_Test() {
        uniqueWordVocabulary.addWord("hello");
        assertEquals(3,uniqueWordVocabulary.words.size());
        uniqueWordVocabulary.addWord("");
        assertEquals(3,uniqueWordVocabulary.words.size());
        uniqueWordVocabulary.addWord("bag");
        assertEquals(4,uniqueWordVocabulary.words.size());
    }

    @Test
    public void getWordsCount_Test() {
        assertEquals(3,uniqueWordVocabulary.getWordsCount());

    }

    @Test
    public void printVocabulary_Test() {
        uniqueWordVocabulary.printVocabulary();
    }
}



