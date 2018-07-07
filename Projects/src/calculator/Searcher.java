package calculator;

import java.util.Scanner;

public class Searcher {
    public void start() {
        int amountOfWords;
        Scanner sc;
        String maxWord = "";

        sc = new Scanner(System.in);
        System.out.print("Input the amount of words:\t");
        amountOfWords = sc.nextInt();
        if (amountOfWords == 0) {
            return;
        }

        System.out.println("Input the words:");
        while (amountOfWords-- > 0) {
            String word = sc.next();
            if (word.length() > maxWord.length()) {
                maxWord = word;
            }
        }

        if (!maxWord.equals("")) {
            System.out.println("The longest word is: " + maxWord);
        }
    }

    public void startDeprecated() {
        int amountOfWords;
        Scanner sc;
        String words[];
        int maxLength = 0;
        int indexOfMaxWord = -1;

        sc = new Scanner(System.in);
        System.out.print("Input the amount of words:\t");
        amountOfWords = sc.nextInt();
        words = new String[amountOfWords];
        if (amountOfWords == 0) {
            return;
        }

        System.out.println("Input the words:");
        for(int i = 0; i < amountOfWords; i++) {
            words[i] = sc.next();
            if (words[i].length() > maxLength) {
                maxLength = words[i].length();
                indexOfMaxWord = i;
            }

        }
        if (indexOfMaxWord != -1) {
            System.out.println("The longest word is: " + words[indexOfMaxWord]);
        }
    }
}
