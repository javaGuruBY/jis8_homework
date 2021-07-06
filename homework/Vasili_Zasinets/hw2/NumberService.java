package jis8.java.homework.hw2;

public class NumberService {

     int result;
     int i;


    int sum1(int start, int finish) {
        result = 0;
        while (start <= finish) {
            result += start;
            start = start + 1;
        }
        return result;
    }

    int sum2(int start, int finish) {
        result = 0;
        while (start >= finish) {
            result += start;
            start = start - 1;
        }
        return result;
    }

    int change(int start, int finish) {
        if (start > finish)
            sum2(start, finish);
        else sum1(start, finish);
        return result;
    }

    int change2(int start, int finish) {
        if (start > finish)
            count2(start, finish);
        else count1(start, finish);
        return i;
    }

    int count2(int start, int finish) {
        while (start >= finish) {
            if (start % 2 == 0) {
                i++;
            }
            start = start - 1;

        }
        return i;
    }

    int count1(int start, int finish) {
        while (start <= finish) {
            if (start % 2 == 0) {
                i++;
            }
            start = start + 1;

        }
        return i;
    }


    public int rangeSum(int start, int finish) {
        change(start, finish);
        return result;
    }

    public int rangeEvenCount(int start, int finish) {
        i = 0;
        change2(start, finish);
        return i;
    }
}

