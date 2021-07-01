package jis8.java.homework.hw2;

public class NumberService {
    int start;
    int finish;
    public static int result;
    public static int i;

    public int rangeSum(int start, int finish) {
        if (start > finish) {
            while (start >= finish) {
                result = start + result;
                start = start - 1;
            }
        } else {
            while (start <= finish) {
                result = start + result;
                start = start + 1;
            }
        }
        return result;
    }

    public int rangeEvenCount(int start, int finish) {
        if (start > finish) {
            while (start >= finish) {
                if (start % 2 == 0) {
                    i++;
                }
                start = start - 1;
            }
        } else {
            while (start <= finish) {
                if (start % 2 == 0) {
                    i++;
                }
                start = start + 1;

            }

        }
        return i;
    }
}
