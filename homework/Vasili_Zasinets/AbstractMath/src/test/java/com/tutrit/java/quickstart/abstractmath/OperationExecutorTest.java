package com.tutrit.java.quickstart.abstractmath;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.Mockito.*;


@RunWith(MockitoJUnitRunner.class)
public class OperationExecutorTest {
    OperationExecutor executor;
    MathOperation[] ops;

    @Before
    public void setUp() {
        executor = mock(OperationExecutor.class);
        ops = new MathOperation[]{new AdditionOperation(), new DivisionOperation(), new MultiplicationOperation(),
                new SubtractionOperation()};
    }

    @Test
    public void execute() {
        double a = 8;
        double b = 4;
        executor.execute(ops, a, b);
        verify(executor, times(1)).execute(ops, a, b);
    }
}
