package pl.sda.zadania.zadanie9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj 5 liczb");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println(sum);
        float srednia = (float) sum / numbers.length;
        System.out.println("Srednia arytmetyczna to: " + srednia);


    }
}
