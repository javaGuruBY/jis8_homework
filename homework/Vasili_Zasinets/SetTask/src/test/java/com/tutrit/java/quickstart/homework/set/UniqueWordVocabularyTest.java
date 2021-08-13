package com.tutrit.java.quickstart.homework.set;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class UniqueWordVocabularyTest {

    UniqueWordVocabulary vocabulary;
    UniqueWordVocabulary vocabularyTest;

    @Before
    public void setUp() {
        this.vocabulary = new UniqueWordVocabulary();
        this.vocabularyTest = new UniqueWordVocabulary();
        vocabularyTest.addWord("First");
        vocabularyTest.addWord("Second");
        vocabularyTest.addWord("Uniq");
    }

    @Test
    public void addWord() {
        vocabulary.addWord("First");
        vocabulary.addWord("Second");
        vocabulary.addWord("Uniq");
        vocabulary.addWord("Second");
        vocabulary.addWord("");
        vocabulary.addWord("First");
        Assert.assertEquals(vocabularyTest, vocabulary);
    }

    @Test
    public void getWordsCount() {
        int expectedSize = 3;
        Assert.assertEquals(expectedSize, vocabularyTest.getWordsCount());
    }
}
