package github.kaydunovdenis;

import org.junit.Test;

public class ShoppingListApplicationTest {
    @Test
    public void testMain() {
        //TODO это нужно будет узнать: как делать как тетировать логер?
      /*  final TestAppender appender = new TestAppender();
        final Logger logger = Logger.getRootLogger();
        logger.addAppender(appender);
        try {
            Logger.getLogger(ShoppingListApplicationTest.class).info("Test");
        }
        finally {
            logger.removeAppender(appender);
        }

        final List<LoggingEvent> log = appender.getLog();
        final LoggingEvent firstLogEntry = log.get(0);
        assertThat(firstLogEntry.getLevel(), is(Level.INFO));
        assertThat((String) firstLogEntry.getMessage(), is("Test"));
        assertThat(firstLogEntry.getLoggerName(), is("MyTest"));
    }*/
    }
}
/*
class TestAppender extends AppenderSkeleton {
    private final List<LoggingEvent> log = new ArrayList<LoggingEvent>();

    @Override
    public boolean requiresLayout() {
        return false;
    }

    @Override
    protected void append(final LoggingEvent loggingEvent) {
        log.add(loggingEvent);
    }

    @Override
    public void close() {
    }

    public List<LoggingEvent> getLog() {
        return new ArrayList<LoggingEvent>(log);
    }
}*/
/*
package github.kaydunovdenis;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InOrder;
import org.mockito.Mockito;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.mockito.Matchers.any;
import static org.mockito.Matchers.anyString;
import static org.mockito.Matchers.anyVararg;
import static org.powermock.api.mockito.PowerMockito.mock;

@RunWith(PowerMockRunner.class)
// информируем PowerMock что придется вносить изменения в класс LoggerFactory
@PrepareForTest({LoggerFactory.class})
public class ShoppingListApplicationTest {
*/
/*        @Mock
        Appender mockAppender;*//*


    // наш фейковый логгер
    private static Logger logger = mock(Logger.class);

    // перееопределяем работу метода LoggerFactory.getLogger - теперь при вызове всегда вернет наш логгер
    static {
        PowerMockito.spy(LoggerFactory.class);
        try {
            PowerMockito.doReturn(logger).when(LoggerFactory.class, "getLogger",
                    any());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    @Test
    public void doLoggingTest() {
        ShoppingListApplication classWithSlf4JLogger = new ShoppingListApplication();
        classWithSlf4JLogger.main(new String[]{});

        //протестируем вызовы нашего логгера.
        // ради разнообразия - убедимся заодно в том, что методы логгера вызывались не просто
        // с верными параметрами но и в нужном порядке
        InOrder inOrd = Mockito.inOrder(logger);
        inOrd.verify(logger).info(" - метод doSomethingWithInt вызван с параметром i = {}",1);
        inOrd.verify(logger).info(" - параметр i больше нуля");
        Mockito.verify(logger, Mockito.times(1)).info(anyString());

        */
/*//*
/ Получаем логгер для нашего класса
        Logger logger = Logger.getLogger(ShoppingListApplication.class);
        // Передаем логгеру mock-аппендер
        logger.addAppender(mockAppender);

        // вызываем тестируемый метод
        ShoppingListApplication shoppingListApplication = new ShoppingListApplication();
        shoppingListApplication.main(new String[]{});

        // 'перехватчик' передаваемых в mock параметров
        ArgumentCaptor<LoggingEvent> eventArgumentCaptor = ArgumentCaptor.forClass(LoggingEvent.class);

        //проверяем, что аппендер вызывался один раза
        Mockito.verify(mockAppender, Mockito.times(1)).doAppend(eventArgumentCaptor.capture());
        //проверяем с какими параметрами вызывался аппендер
        Assert.assertEquals("INFO  main: Welcome to ShoppingList", eventArgumentCaptor.getAllValues()
                .get(0).getMessage());

        //проверяем с какими параметрами вызывался аппендер (уровень логирования)
        Assert.assertEquals(Level.INFO, eventArgumentCaptor.getAllValues().get(0).getLevel());*//*

    }
}*/
