package com.tutrit.java.quickstart.homework.number;

public class NumberService {

    public int sumStartingFromTheSmallestValue(int start, int finish) {
        int result = 0;
        while (start <= finish) {
            result += start;
            start = start + 1;
        }
        return result;
    }

    public int sumStartingFromTheHigherValue(int start, int finish) {
        int result = 0;
        while (start >= finish) {
            result += start;
            start = start - 1;
        }
        return result;
    }

    public int selectionOfTheSummationMethod(int start, int finish) {
        if (start > finish) {
            return sumStartingFromTheHigherValue(start, finish);
        }
        return sumStartingFromTheSmallestValue(start, finish);
    }

    public int selectionOfTheEvenNumberCounterMethod(int start, int finish) {
        if (start > finish) {
            return counterOfEvenNumbersStartingWithHigher(start, finish);
        }
        return counterOfEvenNumbersStartingWithLowest(start, finish);

    }

    public int counterOfEvenNumbersStartingWithHigher(int start, int finish) {
        int i = 0;
        while (start >= finish) {
            if (start % 2 == 0) {
                i++;
            }
            start = start - 1;
        }
        return i;
    }

    public int counterOfEvenNumbersStartingWithLowest(int start, int finish) {
        int i = 0;
        while (start <= finish) {
            if (start % 2 == 0) {
                i++;
            }
            start = start + 1;
        }
        return i;
    }

    public int summationOfNumbers(int start, int finish) {
        return selectionOfTheSummationMethod(start, finish);
    }

    public int evenNumberCounter(int start, int finish) {
       return selectionOfTheEvenNumberCounterMethod(start, finish);
    }
}

