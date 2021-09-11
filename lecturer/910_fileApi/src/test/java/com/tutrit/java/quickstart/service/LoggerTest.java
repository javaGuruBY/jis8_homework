package com.tutrit.java.quickstart.service;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.Test;

public class LoggerTest {

    @Test
    public void log() throws IOException {
        Logger logger = Logger.getLogger(LoggerTest.class.getName());
        logger.setLevel(Level.INFO);
        logger.log(Level.SEVERE, logger.getLevel().toString());
        logger.warning("warning message");
        logger.info("info message");

        logger.setLevel(Level.WARNING);
        logger.log(Level.ALL, logger.getLevel().toString());
        logger.warning("warning message");
        logger.info("info message");

        Logger fileLog = Logger.getLogger("logfile");
        FileHandler fileHandler = new FileHandler("./javaUtilLogger.log", true);
        fileLog.addHandler(fileHandler);
        fileLog.setLevel(Level.INFO);
        fileLog.info("this logs to a file");
    }

    @Test
    public void log4g() {
        org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger("log4g");
        log.error("This is error", new Exception());
        log.info("All fine {}", "Max");
        log.debug("All fine {}", "Max");
    }
}
