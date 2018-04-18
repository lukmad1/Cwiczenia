package pl.sda.zadania.zadanie13;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numberArray = new int[5];

        for (int i = 0; i < numberArray.length; i++) {
            numberArray[i] = scanner.nextInt();
        }

        for (int i = 0; i < numberArray.length; i++) {
            boolean print = false;
            for (int j = 0; j < numberArray.length; j++) {
                if (numberArray[i] == numberArray[j] && i != j && i < j) {
                    print = false;
                    break;
                } else {
                    print = true;
                }
            }
            if (print){
                System.out.println(numberArray[i]);
            }
        }
    }
}
