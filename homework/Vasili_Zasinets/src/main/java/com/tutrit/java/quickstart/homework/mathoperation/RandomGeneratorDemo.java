package com.tutrit.java.quickstart.homework.mathoperation;

public class RandomGeneratorDemo {

    public float randomGeneratorA() {
        return (float) (Math.random() * 10);
    }

    public float randomGeneratorB() {
        return (float) (Math.random() * 20);
    }

    public float randomGeneratorC() {
        return (float) (Math.random() * 33);
    }

    public float SumRandom() {
        return randomGeneratorA() + randomGeneratorB() + randomGeneratorC();
    }


}
