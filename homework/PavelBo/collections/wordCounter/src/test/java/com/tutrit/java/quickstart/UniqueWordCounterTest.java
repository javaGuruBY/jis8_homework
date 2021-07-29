package com.tutrit.java.quickstart;

import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class UniqueWordCounterTest {

    UniqueWordCounter uniqueWordCounter;

    @Before
    public void setup(){
        uniqueWordCounter = new UniqueWordCounter();
        addInitialWords();
    }

    @Test
    public void addWord_test(){
        uniqueWordCounter.addWord("dog");
        Assert.assertEquals(3, uniqueWordCounter.getWords().size());
    }

    @Test
    public void getMostFrequentWord(){
        String result = uniqueWordCounter.getMostFrequentWord();
        assertEquals("hello", result);
    }

    @Test
    public void printWordsFrequencyTest(){
        uniqueWordCounter.printWordsFrequency();
    }

    private void addInitialWords() {
        uniqueWordCounter.addWord("hello");
        uniqueWordCounter.addWord("dog");
        uniqueWordCounter.addWord("cat");
        uniqueWordCounter.addWord("hello");
        uniqueWordCounter.addWord("hello");
        uniqueWordCounter.addWord("dog");
    }
}
