package pl.sda.zadania.zadanie12;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numberArray = new int[10];

        for (int i = 0; i < numberArray.length; i++) {
            numberArray[i] = scanner.nextInt();
        }

        numberArray = sortArray(numberArray);

        if (numberArray.length % 2 == 0) {
            float median = (float) (numberArray[numberArray.length / 2] + numberArray[numberArray.length / 2 - 1]) / 2;
            System.out.println("Mediana to: " + median);
        } else {
            System.out.println("Mediana to: " + numberArray[numberArray.length/2 - 1]);
        }


    }

    private static int[] sortArray(int[] numberArray) {
        for (int i = 0; i < numberArray.length; i++) {
            for (int j = 0; j < numberArray.length; j++) {
                int tempNumber = 0;
                if (numberArray[j] > numberArray[i]) {
                    tempNumber = numberArray[j];
                    numberArray[j] = numberArray[i];
                    numberArray[i] = tempNumber;
                }
            }
        }
        return numberArray;
    }
}
