package pl.sda.zadania.zadanie14;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ile liczb pierwszych wydrukowac?");
        int howManyPrimeNumbers = scanner.nextInt();

        int lastPrimeNumber = 1;
        for (int i = 0; i < howManyPrimeNumbers; i++) {
            lastPrimeNumber = findNextPrimeNumber(lastPrimeNumber);
            System.out.println(lastPrimeNumber);
        }
    }

    private static int findNextPrimeNumber(int lastPrimeNumber) {

        while (true) {
            lastPrimeNumber++;
            for (int i = 2; true; i++) {
                if (lastPrimeNumber % i == 0 && lastPrimeNumber == i) {
                    return lastPrimeNumber;
                } else if (lastPrimeNumber % i == 0 && lastPrimeNumber != i) {
                    break;
                }
            }
        }
    }
}
