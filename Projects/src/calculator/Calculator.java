package calculator;

import java.util.Scanner;

public class Calculator {
    static Scanner sc;

    public void start() {
        sc = new Scanner(System.in);
        float num1;
        float num2;
        String operation;

        System.out.print("Input the first number:\t\t");
        num1 = sc.nextFloat();
        System.out.print("Input the second number:\t");
        num2 = sc.nextFloat();

        System.out.printf("------------------------------" +
                "\nResult: %.4f", calculate(num1, num2));
    }

    private float calculate(float num1, float num2) {
        System.out.print("Input the operation:\t\t");
        String operation = sc.next();

        switch (operation) {
            case "+":
                return num1 + num2;
            case "-":
                return num1 - num2;
            case "*":
                return num1 * num2;
            case "/":
                return num1 / num2;
            default:
                System.out.printf("There are no operation \"%s\". Try another one.\n", operation);
                return calculate(num1, num2);
        }
    }
}
