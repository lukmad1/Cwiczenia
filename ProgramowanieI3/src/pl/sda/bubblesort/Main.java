package pl.sda.bubblesort;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int[] tablica = new int[]{4, 3, 2, 1};
        int[] tablica2 = new int[]{4, 3, 2, 1};


        rosnacoOptymalnie(tablica2);

        System.out.println();
    }


    private static void rosnacoOptymalnie(int[] tablica) {
        for (int i = 0; i < tablica.length; i++) {
            boolean wasSwap = false;
            for (int j = 0; j < tablica.length - 1 -i; j++) {
                if (tablica[j] > tablica[j + 1]) {
                    int temp = tablica[j + 1];
                    tablica[j + 1] = tablica[j];
                    tablica[j] = temp;
                    wasSwap = true;
                }
                if (!wasSwap){
                    break;
                }
                System.out.println(Arrays.toString(tablica));
            }
        }

    }


    private static void drukujTablice(int[] tablica) {
        for (int i = 0; i < tablica.length; i++) {
            System.out.print(tablica[i] + ", ");
        }
        System.out.println("");
    }
}
