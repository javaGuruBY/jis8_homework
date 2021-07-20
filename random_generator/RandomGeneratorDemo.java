package random_generator;

import java.util.Random;

class RandomGeneratorDemo {
    public static void main(String[] args) {

        Random random = new Random();

        Integer a;
        Integer b;
        Integer c;

        for (a = 1; a <= 1; a++) ;
        for (b = 1; b <= 1; b++) ;
        for (c = 1; c <= 1; c++) ;

        Integer randoma = random.nextInt(1000);
        Integer randomb = random.nextInt(1000);
        Integer randomc = random.nextInt(1000);
        Integer summa = randoma + randomb + randomc;

        System.out.println("Случайное число 1: " + randoma);  //знаю про логгер. Дайте так хоть не запутаться)
        System.out.println("Случайное число 2: " + randomb);
        System.out.println("Случайное число 3: " + randomc);
        System.out.println("Сумма всех сгенерированных чисел: " + summa);
    }
}

