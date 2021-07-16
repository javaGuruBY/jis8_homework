package com.github.pavelbopavel;

import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static junit.framework.Assert.*;


class UniqueWordVocabularyTest {

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