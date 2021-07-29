package com.github.pavelbopavel;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;


class UniqueWordVocabularyTest {

    UniqueWordVocabulary uniqueWordVocabulary;

    @Before
    public void setup() {
        uniqueWordVocabulary = new UniqueWordVocabulary();
        addInitialWords();
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

    private void addInitialWords() {
        uniqueWordVocabulary.words.add("hello");
        uniqueWordVocabulary.words.add("dog");
        uniqueWordVocabulary.words.add("cat");
    }
}
