package com.tutrit.java.quickstart.service;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PhraseAnalyserTest {

    PhraseAnalyser phraseAnalyser;

    @Before
    public void setUp() {
        this.phraseAnalyser = new PhraseAnalyser();
    }

    @Test
    public void shouldReturnItIsFineReally() {
        String phrase = "Hello! Whats up my friend";
        Assert.assertEquals("It is fine, really", phraseAnalyser.analyse(phrase));
    }

    @Test
    public void shouldReturnItStandsNoChance() {
        String phrase = "Make you great again";
        Assert.assertEquals("It stands no chance", phraseAnalyser.analyse(phrase));
    }

    @Test
    public void shouldReturnItCouldBeWorse() {
        String phrase = "I am already great again";
        Assert.assertEquals("It could be worse", phraseAnalyser.analyse(phrase));
    }
}
