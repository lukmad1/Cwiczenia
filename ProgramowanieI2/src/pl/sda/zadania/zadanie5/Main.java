package pl.sda.zadania.zadanie5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj 5 liczb dodatnich");

        for (int i = 0; i < numbers.length; i++) {
            if ((numbers[i] = scanner.nextInt()) <= 0) {
                i--;
            }
        }


        int max = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        System.out.println("Najwieksza liczba to: " + max);

    }
}
