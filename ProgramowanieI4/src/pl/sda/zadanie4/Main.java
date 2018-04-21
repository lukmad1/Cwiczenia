package pl.sda.zadanie4;

public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[]{-5, 4, 10, 20, -8, -20, 5, -20, 123};

        int numbersSum = sumArray(numbers);
        System.out.println(numbersSum);
    }

    private static int sumArray(int[] array) {
        int arraySum = 0;
        for (int i = 0; i < array.length; i++) {
            arraySum += array[i];
        }
        return arraySum;
    }
}
