package com.tutrit.java.quickstart;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static junit.framework.Assert.assertEquals;


public class StringAnalyzerTest{

    StringAnalyzer stringAnalyzer;
    String textTest;

    @Before
    public void setUp() {
        stringAnalyzer = new StringAnalyzer();
        textTest = "ововено - кпела, еоангль. ыар, жщгж. фкуп. кео. аегл. ыфер/ыкер.";
    }

    @Test
    public void testSplitToSentences() {
        List<String> sentences = stringAnalyzer.splitToSentences(textTest);
        assertEquals(6, sentences.size());
    }

    @Test
    public void testSplitToWords (){
        List<String> words = stringAnalyzer.splitToWords(textTest);
        assertEquals(10, words.size());
    }

    @Test
    public void testCountWords (){
        assertEquals(10, stringAnalyzer.splitToWords(textTest).size());
    }

    @Test
    public void testSplitToPunctuationMarks (){
        assertEquals(10, stringAnalyzer.splitToPunctuationMarks(textTest).size());
    }

    @Test
    public void testCountPunctuationMarks () {
        assertEquals(10, stringAnalyzer.contPunctuationMarks(textTest));
    }

    @Test
    public void testMostCommonPunctuationMarks(){
        assertEquals(".",stringAnalyzer.mostCommonPunctuationMarks(textTest));
    }
}
