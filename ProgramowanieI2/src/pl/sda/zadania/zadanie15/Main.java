package pl.sda.zadania.zadanie15;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj dlugosc ciagu liczb");
        int howManyNumbers = scanner.nextInt();
        int[] numberArray = new int[howManyNumbers];

        for (int i = 0; i < numberArray.length; i++) {
            numberArray[i] = scanner.nextInt();
        }

//        int maxSum = Integer.MIN_VALUE;
//
//        for (int i = 0; i < numberArray.length; i++) {
//            if (numberArray[i] > maxSum) {
//                maxSum = numberArray[i];
//            }
//        }
//
//        for (int i = 0; i < numberArray.length - 1; i++) {
//            if (numberArray[i] + numberArray[i + 1] > maxSum) {
//                maxSum = numberArray[i] + numberArray[i + 1];
//            }
//        }
//
//        for (int i = 0; i < numberArray.length - 2; i++) {
//            if (numberArray[i] + numberArray[i + 1] + numberArray[i + 2] > maxSum) {
//                maxSum = numberArray[i] + numberArray[i + 1] + numberArray[i + 2];
//            }
//
//        }
//
//        System.out.println(maxSum);

        int maxSum = Integer.MIN_VALUE;
        int maxSumChainStartIndex = 0;
        int maxSumChainLength = 0;
        int tempSum = 0;
        for (int i = 1; i < numberArray.length; i++) { //ilosc sumowanych elementow
            for (int j = 0; j < numberArray.length - i + 1; j++) { //
                if ((tempSum = sumArrayFromIndex(numberArray, j, i)) > maxSum) {
                    maxSum = tempSum;
                    maxSumChainLength = i;
                    maxSumChainStartIndex = j;
                }
            }
        }
        System.out.println(maxSum);
        printArrayChain(numberArray, maxSumChainStartIndex, maxSumChainLength);
    }

    public static int sumArrayFromIndex(int[] array, int startIndex, int sumLenght) {
        int sum = 0;
        for (int i = startIndex; i < startIndex + sumLenght; i++) {
            sum += array[i];
        }
        return sum;
    }

    public static void printArrayChain(int[] array, int startIndex, int sumLenght) {
        System.out.print("[");
        for (int i = startIndex; i < startIndex + sumLenght; i++) {
            if (i == startIndex + sumLenght - 1) {
                System.out.print(array[i] + "]\n");
            }else {
                System.out.print(array[i] + ",");
            }
        }
    }
}
