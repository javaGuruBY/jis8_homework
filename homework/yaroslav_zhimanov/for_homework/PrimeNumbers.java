package for_homework;

public class PrimeNumbers {
    public static void main (String args []){

        int n = 500;
        int i;
        int j;
        int sum =0;
        int sumWithout17and71=0;


        for (i=2; i <n; i++){
            for (j=2; j<i; j++){
                if (i%j==0){
                    break;
                }
            }
            if (i==j){
                sum +=i;
            }
            sumWithout17and71 = sum - (17+71);
        }
        System.out.print(sumWithout17and71);

    }



}

