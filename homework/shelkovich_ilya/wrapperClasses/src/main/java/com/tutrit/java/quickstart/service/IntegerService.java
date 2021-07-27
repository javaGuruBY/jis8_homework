package com.tutrit.java.quickstart.service;

public class IntegerService {

    public Integer byConstructor(Integer integer){
        return integer;
    }

    public Integer byLiteral(){
        Integer byLiteral = 100;
        return byLiteral;
    }

    public static Integer byValueOf(int i){
        return Integer.valueOf(i);
    }

    public Integer byParseInt(){
        return Integer.parseInt("4");
    }

    public String integerToBinaryString(Integer integer){
        return Integer.toBinaryString(integer);
    }

    public String integerToHexString(Integer integer){
        return Integer.toHexString(integer);
    }

    public String integerToString(Integer integer){
        return Integer.toString(integer);
    }

}
