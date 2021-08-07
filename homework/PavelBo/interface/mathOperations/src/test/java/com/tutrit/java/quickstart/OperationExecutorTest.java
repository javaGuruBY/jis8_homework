package com.tutrit.java.quickstart;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class OperationExecutorTest {

    OperationExecutor operationExecutor;

    @Before
    public void setup() {
        operationExecutor = new OperationExecutor();
    }

    @Test
    public void executeDemo() {
        operationExecutor.execute(initialMathOperationArray(), 4, 2);
    }

    private MathOperation[] initialMathOperationArray() {
        MathOperation[] mathOperations;
        return mathOperations = new MathOperation[]{
                new AdditionOperation(),
                new SubtractionOperation(),
                new MultiplicationOperation(),
                new DivisionOperation()
        };
    }
}
