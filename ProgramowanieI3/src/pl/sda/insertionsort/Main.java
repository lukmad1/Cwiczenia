package pl.sda.insertionsort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[]{3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48};


        for (int i = 1; i < numbers.length; i++) {
            int arrayValueAtI = numbers[i];
            int iValueIndex = i;
            for (int j = i; j >= 0; j--) {
                if (arrayValueAtI < numbers[j]) {
                    swap(numbers, iValueIndex, j);
                    iValueIndex = j;
                }
            }
        }

        System.out.println(Arrays.toString(numbers));


    }


    public static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}
