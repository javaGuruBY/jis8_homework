package com.tutrit.java.quickstart.homework.number;

public class NumberService {
   private int result;
   private int i;

   public int sumStartingFromTheSmallestValue(int start, int finish) {
        result = 0;
        while (start <= finish) {
            result += start;
            start = start + 1;
        }
        return result;
    }

    public int sumStartingFromTheHigherValue(int start, int finish) {
        result = 0;
        while (start >= finish) {
            result += start;
            start = start - 1;
        }
        return result;
    }

    public int selectionOfTheSummationMethod(int start, int finish) {
        if (start > finish) {
            sumStartingFromTheHigherValue(start, finish);
        } else {
            sumStartingFromTheSmallestValue(start, finish);
        }
        return result;
    }

    public int selectionOfTheEvenNumberCounterMethod(int start, int finish) {
        if (start > finish) {
            counterOfEvenNumbersStartingWithHigher(start, finish);
        } else {
            counterOfEvenNumbersStartingWithLowest(start, finish);
        }
        return i;
    }

    public int counterOfEvenNumbersStartingWithHigher(int start, int finish) {
        while (start >= finish) {
            if (start % 2 == 0) {
                i++;
            }
            start = start - 1;
        }
        return i;
    }

    public int counterOfEvenNumbersStartingWithLowest(int start, int finish) {
        while (start <= finish) {
            if (start % 2 == 0) {
                i++;
            }
            start = start + 1;
        }
        return i;
    }

    public int
    summationOfNumbers(int start, int finish) {
        selectionOfTheSummationMethod(start, finish);
        return result;
    }

    public int evenNumberCounter(int start, int finish) {
        i = 0;
        selectionOfTheEvenNumberCounterMethod(start, finish);
        return i;
    }
}

