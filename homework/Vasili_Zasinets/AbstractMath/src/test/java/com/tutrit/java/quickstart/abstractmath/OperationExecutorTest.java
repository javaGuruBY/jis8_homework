package com.tutrit.java.quickstart.abstractmath;

import org.junit.Assert;
import org.junit.Test;

public class OperationExecutorTest {

    MathOperation[] ops = {new AdditionOperation(), new DivisionOperation(), new MultiplicationOperation(),
            new SubtractionOperation()};

    OperationExecutor executor = new OperationExecutor();

    @Test
    public void Execute() throws DivisionByZeroException {
        double a = 8;
        double b = 4;
        executor.execute(ops, a, b);
        Assert.assertNotNull(executor);
    }

    @Test(expected = DivisionByZeroException.class)
    public void ExecuteException() throws DivisionByZeroException {
        double a = 8;
        double b = 0;
        executor.execute(ops, a, b);
    }
}