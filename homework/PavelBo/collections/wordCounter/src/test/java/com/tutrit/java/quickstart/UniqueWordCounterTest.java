package com.tutrit.java.quickstart;

import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static junit.framework.Assert.*;
import static org.junit.Assert.*;

public class UniqueWordCounterTest {

    UniqueWordCounter uniqueWordCounter;

    @Before
    public void setup(){
        uniqueWordCounter = new UniqueWordCounter();
        uniqueWordCounter.addWord("hello");
        uniqueWordCounter.addWord("dog");
        uniqueWordCounter.addWord("cat");
        uniqueWordCounter.addWord("hello");
        uniqueWordCounter.addWord("hello");
        uniqueWordCounter.addWord("dog");

    }

    @Test
    public void addWord_test(){
        uniqueWordCounter.addWord("hello");
        uniqueWordCounter.addWord("dog");
        uniqueWordCounter.addWord("cat");
        uniqueWordCounter.addWord("hello");
        uniqueWordCounter.addWord("hello");
        uniqueWordCounter.addWord("dog");

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
}