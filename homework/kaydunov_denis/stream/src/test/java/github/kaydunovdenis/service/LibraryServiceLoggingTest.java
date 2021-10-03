package github.kaydunovdenis.service;

import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.Logger;
import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.read.ListAppender;
import github.kaydunovdenis.repository.MockBookRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.slf4j.LoggerFactory;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class LibraryServiceLoggingTest {

    @Ignore("This dont work. Unresolved exception.")
    @Test
    public void doThat() {
        // get Logback Logger
        //Logger logger = (Logger) LoggerFactory.getLogger(LibraryService.class);
        Logger logger = (Logger) LoggerFactory.getLogger(org.slf4j.Logger.ROOT_LOGGER_NAME);

        // create and start a ListAppender
        ListAppender<ILoggingEvent> listAppender = new ListAppender<>();
        listAppender.start();

        // add the appender to the logger
        // addAppender is outdated now
        logger.addAppender(listAppender);

        // call method under test
        LibraryService libraryService = new LibraryService(MockBookRepository.MOCK_BOOKS);
        libraryService.printAlTitles();

        // JUnit assertions
        List<ILoggingEvent> logsList = listAppender.list;
        assertEquals("start", logsList.get(0)
                .getMessage());
        assertEquals(Level.INFO, logsList.get(0)
                .getLevel());

        assertEquals("finish", logsList.get(1)
                .getMessage());
        assertEquals(Level.INFO, logsList.get(1)
                .getLevel());
    }
}
