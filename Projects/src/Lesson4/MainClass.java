package Lesson4;


import java.util.Random;

public class MainClass {
    public static void main(String[] args) {
        final int NUMBER_AMOUNT = 20;
        int numbers[] = new int[NUMBER_AMOUNT];
        int indexOfMaxNegative = -1;
        int indexOfMinPositive = -1;

        Random rand;
        int maxNegative = -11;
        int minPositive = 10;

        rand = new Random(System.currentTimeMillis());

        System.out.println("Numbers are:");
        for (int i = 0; i < NUMBER_AMOUNT; i++) {
            numbers[i] = -10 + rand.nextInt(20);
            System.out.print(numbers[i] + " ");
            if (numbers[i] < 0 && numbers[i] > maxNegative) {
                maxNegative = numbers[i];
                indexOfMaxNegative = i;
            }
            else if (numbers[i] > 0 && numbers[i] < minPositive) {
                minPositive = numbers[i];
                indexOfMinPositive = i;
            }
        }
        if (indexOfMaxNegative != -1 && indexOfMinPositive != -1) {
            System.out.println("\nMin positive is " + minPositive + ", max negative is " + maxNegative);
            int tmp = numbers[indexOfMaxNegative];
            numbers[indexOfMaxNegative] = numbers[indexOfMinPositive];
            numbers[indexOfMinPositive] = tmp;

            System.out.println("Numbers after swap:");
            for (int i = 0; i < NUMBER_AMOUNT; i++) {
                System.out.print(numbers[i] + " ");
            }
        }
    }
}
