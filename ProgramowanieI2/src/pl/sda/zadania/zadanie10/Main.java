package pl.sda.zadania.zadanie10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podawaj liczby dopoki suma bedzie rozna 10!");
        int sum = 0;
        do {
            sum += scanner.nextInt();
            System.out.println("Aktualna suma to: " + sum);
        } while (sum != 10);
    }
}
