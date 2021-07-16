package min_max;


public class MinMax {
    public static void main(String args[]) {
        int array[] = new int[]{702, 547, 662, 932, 203, 312, 818, 29, 642, 925, 348, 256, 895, 851, 96, 450, 135, 533, 849, 736, 218, 350, 693, 462, 14, 181, 463, 81, 501, 94, 480, 662, 217, 550, 262, 561, 796, 79, 907, 607, 484, 720, 597, 337, 889, 255, 847, 598, 401, 323, 1400, 1713, 1959, 1681, 1842, 1090, 1269, 1400, 1331, 1490, 1837, 1108, 1804, 1407, 1804, 1475, 1641, 1949, 1749, 1670, 1138, 1282, 1994, 1084, 1661, 1579, 1685, 1069, 1119, 1066, 1035, 1096, 1725, 1990, 1657, 1390, 1597, 1983, 1224, 1235, 1949, 1801, 1445, 1924, 1658, 1717, 1308, 1108, 1826, 1387};


        int max = getMax(array);
        System.out.println("Максимальное число: " + max);


        int min = getMin(array);
        System.out.println("Минимальное число: " + min);

    }

    public static int getMax(int[] inputArray) {
        int maxValue = inputArray[0];
        for (int i = 1; i < inputArray.length; i++) {
            if (inputArray[i] > maxValue) {
                maxValue = inputArray[i];
            }


        }
        return maxValue;
    }


    public static int getMin(int[] inputArray) {
        int minValue = inputArray[0];
        for (int i = 1; i < inputArray.length; i++) {
            if (inputArray[i] < minValue) {
                minValue = inputArray[i];
            }
        }


        return minValue;
    }
}
