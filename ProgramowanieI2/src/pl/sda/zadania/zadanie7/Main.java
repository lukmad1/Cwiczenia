package pl.sda.zadania.zadanie7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj 5 liczb dodatnich");
        for (int i = 0; i < numbers.length / 2; i++) {
            if ((numbers[i] = scanner.nextInt()) < 0) {
                i--;
            }
        }


        System.out.println("Podaj 5 liczb ujemnych");
        for (int i = numbers.length / 2; i < numbers.length; i++) {
            if ((numbers[i] = scanner.nextInt()) > 0) {
                i--;
            }
        }

        int suma = 0;
        for (int i = 0; i < numbers.length; i++) {
            suma += numbers[i];
        }

        System.out.println("Suma liczb to: " + suma);
    }
}
