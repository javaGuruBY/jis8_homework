package com.tutrit.java.quickstart.homework.Vasili_Zasinets.hw0713;

public class NumberService {
    int result;
    int i;


    int summForSmall(int start, int finish) {
        result = 0;
        while (start <= finish) {
            result += start;
            start = start + 1;
        }
        return result;
    }

    int summForBig(int start, int finish) {
        result = 0;
        while (start >= finish) {
            result += start;
            start = start - 1;
        }
        return result;
    }

    int selectionForSumm(int start, int finish) {
        if (start > finish) {
            summForBig(start, finish);
        }
        else{
            summForSmall(start, finish);
        }
        return result;
    }

    int selectionForEven(int start, int finish) {
        if (start > finish) {
            evenForBig(start, finish);
        }
        else{
            evenForSmall(start, finish);
        }
        return i;
    }

    int evenForBig(int start, int finish) {
        while (start >= finish) {
            if (start % 2 == 0) {
                i++;
            }
            start = start - 1;

        }
        return i;
    }

    int evenForSmall(int start, int finish) {
        while (start <= finish) {
            if (start % 2 == 0) {
                i++;
            }
            start = start + 1;

        }
        return i;
    }

    public int rangeSum(int start, int finish) {
        selectionForSumm(start, finish);
        return result;
    }

    public int rangeEvenCount(int start, int finish) {
        i = 0;
        selectionForEven(start, finish);
        return i;
    }
}
