package pl.sda.zadania.zadanie13;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numberArray = new int[5];

        for (int i = 0; i < numberArray.length; i++) {
            numberArray[i] = scanner.nextInt();
        }

        removeDuped(numberArray);
    }

    private static void removeDuped(int[] numberArray) {
        for (int i = 0; i < numberArray.length; i++) {
            boolean print = true;
            for (int j = i+1; j < numberArray.length; j++) {
                if (numberArray[i] == numberArray[j]) {
                    print = false;
                    break;
                }
            }
            if (print){
                System.out.println(numberArray[i]);
            }
        }
    }
}
