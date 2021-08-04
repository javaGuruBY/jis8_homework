package com.tutrit.java.quickstart.bean;

public class ChildInteger extends MyIntegerImmutable {

    public ChildInteger(MyIntegerImmutable myIntegerImmutable) {
        super(myIntegerImmutable);
    }

    public ChildInteger(Integer integer, MyInteger myInteger) {
        super(integer, myInteger);
    }

    @Override
    public MyIntegerImmutable increment() {
        return super.increment();
    }
}
