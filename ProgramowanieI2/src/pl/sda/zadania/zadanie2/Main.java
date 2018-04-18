package pl.sda.zadania.zadanie2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ile liczb wczytac?");
        int ile = scanner.nextInt();

        int suma = 0;
        for (int i = 0; i < ile; i++) {
            suma = scanner.nextInt();
        }
        System.out.println("Suam liczb to: " + suma);
    }
}
