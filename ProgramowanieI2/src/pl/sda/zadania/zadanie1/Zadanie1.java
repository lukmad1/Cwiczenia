package pl.sda.zadania.zadanie1;

import java.util.Scanner;

public class Zadanie1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj 5 liczb");
        int suma = 0;
        for (int i = 0; i < 5; i++) {
            suma += scanner.nextInt();
        }
        System.out.println("Suma to: "+suma);
    }


}
