package com.tutrit.java.quickstart.exceptions;

public class ArrayLastValueZeroRuntimeException extends ArrayOddValueRuntimeException{
    public ArrayLastValueZeroRuntimeException(){
        super("Нечетное значение в массиве");
    }

}
