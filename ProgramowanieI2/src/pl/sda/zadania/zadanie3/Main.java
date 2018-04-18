package pl.sda.zadania.zadanie3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj liczbe a:");
        int a = scanner.nextInt();

        System.out.println("Podaj liczbe b:");
        int b = scanner.nextInt();

        int power = 1;
        for (int i = 0; i < b; i++) {
            power *= a;
        }

        System.out.println("Wynik potegowania to: " + power);
    }
}
