package pl.sda.zadanie3;

public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[]{-5, 4, 10, 20, -8, -20, 5, -20, 123, -4321};
        int max = returnMaxValue(numbers);
        System.out.println(max);
    }

    private static int returnMaxValue(int[] numbers) {
        int maxValue = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > maxValue){
                maxValue = numbers[i];
            }
        }
        return maxValue;
    }
}
