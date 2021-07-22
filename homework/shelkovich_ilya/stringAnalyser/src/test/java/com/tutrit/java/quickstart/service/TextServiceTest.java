package com.tutrit.java.quickstart.service;

import static com.tutrit.java.quickstart.service.TextService.BY_PUNCTUATION;

import java.util.List;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TextServiceTest {

    TextService textService;

    @Before
    public void setUp() {
        this.textService = new TextService();
    }

    @Test
    public void splitInSentences() {
        String text = "Hello. I'm test.";
        List<String> actual = textService.splitBySentences(text);
        Assert.assertEquals(2, actual.size());
    }

    @Test
    public void wordsCount() {
        String text = "What is your name?";
        int actual = textService.wordsCount(text, BY_PUNCTUATION);
        Assert.assertEquals(4, actual);
    }

    @Test
    public void punctuationsCount() {
        String text = "Woah! Such a rare name. Wait, are you from Mars?";
        Assert.assertEquals(4, textService.punctuationCount(text));

        String textWithNonePunctuation = "Woah Such a rare name";
        Assert.assertEquals(0, textService.punctuationCount(textWithNonePunctuation));

        String textWithOnePunctuation = "Woah!";
        Assert.assertEquals(1, textService.punctuationCount(textWithOnePunctuation));
    }

    @Test
    public void punctuationsCountByTokenizer() {
        String text = "How, are. you! little one,";
        int actual = textService.punctuationsCountByTokenizer(text);
        Assert.assertEquals(4, actual);
    }

    @Test
    public void mostRepeatableWord() {
        String text = "You are, you just brilliant!";
        String expected = "you";
        String word = textService.mostRepeatableWord(text);
        Assert.assertEquals(expected, word);
    }

    @Test
    public void punctuationsCountByTokenizerIfNone() {
        String text = "How are you little one";
        int actual = textService.punctuationsCountByTokenizer(text);
        Assert.assertEquals(0, actual);
    }
}
