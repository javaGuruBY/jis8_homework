package com.tutrit.java.quickstart.service;

import static com.tutrit.java.quickstart.service.TextService.*;

import com.tutrit.java.quickstart.constants.Text;
import java.util.LinkedList;
import java.util.List;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TextServiceTest {

    TextService textService;

    @Before
    public void setUp(){
        this.textService = new TextService();
    }

    @Test
    public void splitInSentences(){
        String text = "Hello. I'm test.";
        List<String> actual = textService.splitBySentences(text);
        Assert.assertEquals(2, actual.size());
    }

    @Test
    public void wordsCount(){
        String text = "What is your name?";
        int actual = textService.wordsCount(text, byPunctuations);
        Assert.assertEquals(4, actual);
    }

    @Test
    public void punctuationsCount(){
        String text = "Woah! Such a rare name. Wait, are you from Mars?";
        int actual = textService.punctuationCount(text);
        Assert.assertEquals(4, actual);
    }

    @Test
    public void punctuationsCountIfNone(){
        String text = "Woah Such a rare name";
        int actual = textService.punctuationCount(text);
        Assert.assertEquals(0, actual);
    }

    @Test
    public void punctuationsCountIfOne(){
        String text = "Woah!";
        int actual = textService.punctuationCount(text);
        Assert.assertEquals(1, actual);
    }

    @Test
    public void punctuationsCountByTokenizer(){
        String text = "How, are. you! little one,";
        int actual = textService.punctuationsCountByTokenizer(text);
        Assert.assertEquals(4,actual);
    }

    @Test
    public void punctuationsCountByTokenizerIfNone(){
        String text = "How are you little one";
        int actual = textService.punctuationsCountByTokenizer(text);
        Assert.assertEquals(0,actual);
    }
}
