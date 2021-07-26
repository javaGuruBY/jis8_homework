package com.tutrit.java.quickstart.service;

import com.tutrit.java.quickstart.exceptions.ArrayLastValueZeroRuntimeException;
import com.tutrit.java.quickstart.exceptions.ArrayOddValueException;
import com.tutrit.java.quickstart.exceptions.ArrayLastValueZeroException;
import com.tutrit.java.quickstart.exceptions.ArrayOddValueRuntimeException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Verification {
    Logger log = LoggerFactory.getLogger(Verification.class);

    public void arrayIndexOutOfBound(int i){
        int[] values = {10, 20, 30};
        log.info("values[{}] = {}", i, values[i]);
    }

    public void nullPointer(){
        int[] values = null;
        log.info(values.toString());
    }

    public void riskyNullPointer(String value) throws NullPointerException {
        value.split(" ");
    }

    public int riskyLastValueZero(int[] values) throws ArrayLastValueZeroException {
        if (values[values.length - 1] == 0) {
            throw new ArrayLastValueZeroException();
        } else return values[values.length - 1];
    }

    public int safetyOddValue(int[] values) throws ArrayOddValueException {
        try {
            int valueZero = riskyLastValueZero(values);
        } catch (ArrayLastValueZeroException e) {
            log.warn(e.toString());
        }
        for (int value : values){
            if ((value % 2) == 1) {
                throw new ArrayOddValueException("Массив содержит нечетные элементы");
            }
        }
        return values.length;
    }

   public int riskyLastValueZeroRuntime (int[] values) throws ArrayLastValueZeroRuntimeException{
        if (values[values.length - 1] == 0) {
            throw new ArrayLastValueZeroRuntimeException();
        } else return values[values.length - 1];
   }

    public int safetyOddValueRuntime (int[] values) throws ArrayOddValueRuntimeException {
        try {
            int valueZero = riskyLastValueZeroRuntime(values);
        } catch (ArrayOddValueRuntimeException e){
            log.warn(e.toString());
        }
        for (int value : values){
            if ((value % 2) == 1) {
                throw new ArrayOddValueRuntimeException("Массив содержит нечетные элементы");
            }
        }
        return values.length;
    }

    public void riskyHierarhcy() {

    }
}
