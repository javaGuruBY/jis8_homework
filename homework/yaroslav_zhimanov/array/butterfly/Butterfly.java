package array;

public class Butterfly {

    public static void main(String[] args) {
        int arr[][] = new int[7][7];
        int a, b;


        for (a = 0; a < arr.length / 2 + 1; a++) {
            for (b = 0; b < arr[a].length; b++) {
                if ((b < a) || (b >= (arr[a].length - a)))
                    arr[a][b] = 0;
                else
                    arr[a][b] = 1;
            }

        }


        for (a = arr.length - 1; a >= arr.length / 2 + 1; a--) {
            for (b = 0; b < arr[a].length; b++) {
                if ((b < (arr[a].length - 1 - a)) || (b > a))
                    arr[a][b] = 0;
                else
                    arr[a][b] = 1;
            }
        }
        for (a = 0; a < arr.length; a++) {
            for (b = 0; b < arr[a].length; b++) {
                System.out.print(arr[a][b]);
                //Логгер не до конца понимаю. Разберусь, тогда буду писать логгер.
            }
            System.out.println(" ");
        }
    }

}
