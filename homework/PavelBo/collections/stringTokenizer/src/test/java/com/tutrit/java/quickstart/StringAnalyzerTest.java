package com.tutrit.java.quickstart;

import junit.framework.Assert;
import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

import java.util.List;
import java.util.Set;

public class StringAnalyzerTest extends TestCase {

    StringAnalyzer stringAnalyzer;

    @Before
    public void setUp() {
        stringAnalyzer = new StringAnalyzer();
    }

    @Test
    public void testSplitToSentences() {
        List<String> sentences = stringAnalyzer.splitToSentences(Text.text);
        Assert.assertEquals(17, sentences.size());
    }

    @Test
    public void testSplitToWords (){
        List<String> words = stringAnalyzer.splitToWords(Text.text);
        Assert.assertEquals(221, words.size());
    }

    @Test
    public void testCountWords (){
        Assert.assertEquals(221, stringAnalyzer.splitToWords(Text.text).size());
    }

    @Test
    public void testSplitToPunctuationMarks (){
        List<String> punctuationMarks = stringAnalyzer.splitToPunctuationMarks(Text.text);
        Assert.assertEquals(47, stringAnalyzer.splitToPunctuationMarks(Text.text).size());
    }

    @Test
    public void testCountPunctuationMarks () {
        Assert.assertEquals(47, stringAnalyzer.contPunctuationMarks(Text.text));
    }

    @Test
    public void testMostCommonPunctuationMarks(){
        Assert.assertEquals(",",stringAnalyzer.mostCommonPunctuationMarks(Text.text));
    }
}
