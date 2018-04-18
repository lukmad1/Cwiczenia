package pl.sda.zadania.zadanie6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj 5 liczb");

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }

        System.out.println("Najwieksza liczba to: " + max);
        System.out.println("Najmniejsza liczba to: " + min);
    }

}
