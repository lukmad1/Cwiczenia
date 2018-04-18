package pl.sda.zadania.zadanie4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj liczbe a");
        int a = scanner.nextInt();
        int factorial = 1;
        for (int i = 1; i <= a; i++) {
            factorial = factorial * i;
        }
        System.out.println("Silnia liczby to: " + factorial);

    }

}
