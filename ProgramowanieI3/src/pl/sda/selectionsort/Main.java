package pl.sda.selectionsort;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] numbers = new int[]{3, 2, 5, 4, 3, 2, 6, 8, 7, 1, 3, 10, 20, 1};


        for (int i = 0; i < numbers.length; i++) {
            int min = numbers[i];
            int minIndex = i;
            for (int j = i; j < numbers.length; j++) {
                if (numbers[j] < min) {
                    min = numbers[j];
                    minIndex = j;
                }
            }
            int temp = numbers[i];
            numbers[i] = min;
            numbers[minIndex] = temp;
        }


        System.out.println(Arrays.toString(numbers));


    }

}
