package calculator;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner sc;
        int operation;
        boolean isWrongOperation = false;

        sc = new Scanner(System.in);

        do {
            System.out.println("Input the type of operation:");
            System.out.println("\t1 - for Calculator");
            System.out.println("\t2 - for Searcher");
            operation = sc.nextInt();

            switch (operation) {
                case 1:
                    Calculator calc = new Calculator();
                    calc.start();
                    break;
                case 2:
                    Searcher searcher = new Searcher();
                    searcher.start();
                    break;
                default:
                    System.out.println("Wrong operation. Try again.");
                    isWrongOperation = true;
            }
        } while (isWrongOperation);

    }
}
