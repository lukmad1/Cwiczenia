package pl.sda.quicksort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] numbers = new int[]{3, 44, 38, 5, 47, 15, -5, 26, 27, 2, 2, 2, 19, 0, 48};

        System.out.println(Arrays.toString(quickSort(numbers)));
    }

    private static int[] quickSort(int[] array) {
        if (array.length < 2) {
            return array;
        } else {

            int pivotIndex = array.length / 2;
            int lowerNumbersLength = 0;
            int higherNumbersLength = 0;
            int pivotValue = array[pivotIndex];

            for (int i = 0; i < array.length; i++) {
                if (i != pivotIndex) {
                    if (array[i] <= array[pivotIndex]) {
                        lowerNumbersLength++;
                    } else {
                        higherNumbersLength++;
                    }
                }
            }

            int[] lowerNumbers = new int[lowerNumbersLength];
            int[] higherNumbers = new int[higherNumbersLength];

            for (int i = 0, j = 0, k = 0; i < array.length; i++) {
                if (i != pivotIndex) {
                    if (array[i] <= array[pivotIndex]) {
                        lowerNumbers[j] = array[i];
                        j++;
                    } else {
                        higherNumbers[k] = array[i];
                        k++;
                    }
                }
            }

            lowerNumbers = quickSort(lowerNumbers);
            higherNumbers = quickSort(higherNumbers);

            int arrayIndexCounter;
            for (arrayIndexCounter = 0; arrayIndexCounter < lowerNumbers.length; arrayIndexCounter++) {
                array[arrayIndexCounter] = lowerNumbers[arrayIndexCounter];
            }
            array[arrayIndexCounter] = pivotValue;
            arrayIndexCounter++;
            for (int i = 0; i < higherNumbers.length; i++) {
                array[arrayIndexCounter] = higherNumbers[i];
                arrayIndexCounter++;
            }

            return array;
        }
    }
}
