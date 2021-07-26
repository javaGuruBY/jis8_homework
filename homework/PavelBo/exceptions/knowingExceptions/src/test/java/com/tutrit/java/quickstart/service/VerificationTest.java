package com.tutrit.java.quickstart.service;

import com.tutrit.java.quickstart.exceptions.ArrayLastValueZeroException;
import com.tutrit.java.quickstart.exceptions.ArrayLastValueZeroRuntimeException;
import com.tutrit.java.quickstart.exceptions.ArrayOddValueException;
import com.tutrit.java.quickstart.exceptions.ArrayOddValueRuntimeException;
import org.junit.Before;
import org.junit.Test;

public class VerificationTest {

    Verification verification;

    @Before
    public void setup() {
        verification = new Verification();
    }

    @Test
    public void arrayIndexOutOfBoundBorderValue() {
        verification.arrayIndexOutOfBound(2);
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void arrayIndexOutOfBoundBorderLineValue() {
        verification.arrayIndexOutOfBound(3);
    }

    @Test(expected = NullPointerException.class)
    public void nullPointerTest() {
        verification.nullPointer();
    }

    @Test(expected = ArrayLastValueZeroException.class)
    public void riskyZero() throws ArrayLastValueZeroException {
        verification.riskyLastValueZero(new int[]{2, 4, 6, 9, 4, 0});
    }

    @Test(expected = ArrayOddValueException.class)
    public void safetyOddValue() throws ArrayOddValueException {
        verification.safetyOddValue(new int[]{2, 4, 6, 9, 4, 0});
    }

    @Test(expected = NullPointerException.class)
    public void riskyNullPointer() {
        String value = null;
       verification.riskyNullPointer(value);
    }

    @Test(expected = ArrayLastValueZeroRuntimeException.class)
    public void riskyLastValueZeroRuntime() {
        verification.riskyLastValueZeroRuntime(new int[]{2, 4, 6, 9, 4, 0});
    }

    @Test(expected = ArrayOddValueRuntimeException.class)
    public void safetyOddValueRuntime() {
        verification.safetyOddValueRuntime(new int[]{2, 4, 6, 9, 4, 0});
    }
}