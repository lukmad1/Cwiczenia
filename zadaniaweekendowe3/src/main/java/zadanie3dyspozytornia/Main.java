package zadanie3dyspozytornia;

import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Dyspozytornia dyspozytornia = new Dyspozytornia();


        Scanner scanner = new Scanner(System.in);
        String[] komenda;
        System.out.println("Uzyj help aby wyswietlic dostepne polecenia");
        while (true) {
           try {
               komenda = scanner.nextLine().toLowerCase().split(" ");
               if ("help".equals(komenda[0])) {
                   System.out.println("Dostepne komendy to:\n" +
                           "1.dodaj TYP TRESC\n" +
                           "2.listuj ILE\n" +
                           "3.listuj TYP\n" +
                           "4.quit");
               } else if ("dodaj".equals(komenda[0])) {
                   String tresc = "";
                   for (int i =2; i<komenda.length;i++){
                       tresc += komenda[i]+" ";
                   }
                   switch (komenda[1]) {
                       case "wypadek":
                           dyspozytornia.dodajZgloszenie(tresc, TypZgloszenia.WYPADEK);
                           break;
                       case "karetka":
                           dyspozytornia.dodajZgloszenie(tresc, TypZgloszenia.KARETKA);
                           break;
                       case "policja":
                           dyspozytornia.dodajZgloszenie(tresc, TypZgloszenia.POLICJA);
                           break;
                       case "inne":
                           dyspozytornia.dodajZgloszenie(tresc, TypZgloszenia.INNE);
                           break;
                       case "straz":
                           dyspozytornia.dodajZgloszenie(tresc, TypZgloszenia.STRAZ);
                           break;
                       default:
                           System.out.println("Brak typu zgloszenia!");
                           break;
                   }
               } else if ("listuj".equals(komenda[0]) && komenda[1].length() > 3) {
                   switch (komenda[1]) {
                       case "wypadek":
                           dyspozytornia.zwrocZgloszeniaTypu(TypZgloszenia.WYPADEK).forEach(System.out::println);
                           break;
                       case "karetka":
                           dyspozytornia.zwrocZgloszeniaTypu(TypZgloszenia.KARETKA).forEach(System.out::println);
                           break;
                       case "policja":
                           dyspozytornia.zwrocZgloszeniaTypu(TypZgloszenia.POLICJA).forEach(System.out::println);
                           break;
                       case "inne":
                           dyspozytornia.zwrocZgloszeniaTypu(TypZgloszenia.INNE).forEach(System.out::println);
                           break;
                       case "straz":
                           dyspozytornia.zwrocZgloszeniaTypu(TypZgloszenia.STRAZ).forEach(System.out::println);
                           break;
                       default:
                           System.out.println("Brak typu zgloszenia!");
                           break;
                   }
               } else if ("listuj".equals(komenda[0])) {
                   try {
                       int ile = Integer.parseInt(komenda[1]);
                       dyspozytornia.zwrocNajaktualniejszeZgloszenia(ile).forEach(System.out::println);
                   } catch (NumberFormatException nfe) {
                       System.out.println("Nie podano liczby");
                   }
               } else if ("quit".equals(komenda[0])) {
                   return;
               }
           }catch (ArrayIndexOutOfBoundsException e){
               System.out.println("Nie podales parametrow");
           }

        }
    }
}
