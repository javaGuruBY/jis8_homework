package com.tutrit.java.quickstart.abstractmath;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class OperationExecutorTest {
    OperationExecutor executor;
    MathOperation[] ops;

    @Before
    public void setUp() {
        this.executor = new OperationExecutor();
        this.ops = new MathOperation[]{new AdditionOperation(), new DivisionOperation(), new MultiplicationOperation(),
                new SubtractionOperation()};
    }

    @Test
    public void execute() {
        double a = 8;
        double b = 4;
        executor.execute(ops, a, b);
        Assert.assertNotNull(executor);
    }
}
