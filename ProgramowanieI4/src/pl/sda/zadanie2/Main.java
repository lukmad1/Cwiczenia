package pl.sda.zadanie2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[]{-5, 4, 10, 20, -8, -20, 5, -20, 123, -4321, 7, 10};
        numbers = deleteNegativeNumbers(numbers);
        System.out.println(Arrays.toString(numbers));
    }


    public static int[] deleteNegativeNumbers(int[] numberArray) {
        int howManyPositive = 0;
        for (int i = 0; i < numberArray.length; i++) {
            if (numberArray[i] >= 0) {
                howManyPositive++;
            }
        }
        int[] noNegativeNumbersArray = new int[howManyPositive];

        for (int i = 0, j = 0; i < numberArray.length; i++) {
            if (numberArray[i] >= 0) {
                noNegativeNumbersArray[j] = numberArray[i];
                j++;
            }
        }
        return noNegativeNumbersArray;
    }
}
