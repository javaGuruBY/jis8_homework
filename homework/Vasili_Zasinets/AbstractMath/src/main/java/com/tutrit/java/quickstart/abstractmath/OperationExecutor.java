package com.tutrit.java.quickstart.abstractmath;

public class OperationExecutor {

    void execute(MathOperation[] operations, double a, double b) throws DivisionByZeroException {
        for (MathOperation operation : operations) {
            operation.compute(a, b);
        }
    }
}
