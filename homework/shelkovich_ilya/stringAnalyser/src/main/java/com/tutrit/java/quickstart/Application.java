package com.tutrit.java.quickstart;

import static com.tutrit.java.quickstart.constants.Text.PHRASE;

import java.util.Arrays;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Application {

    static Logger log = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
        String[] wordsArray = PHRASE.split("\\.");
        List<String> words = Arrays.asList(wordsArray);

        int dots = 0;

        for (String word : words) {
            if (word.equalsIgnoreCase(".")) {
                dots++;
            }
        }
        log.info("total sentences {}", dots);
    }
}

