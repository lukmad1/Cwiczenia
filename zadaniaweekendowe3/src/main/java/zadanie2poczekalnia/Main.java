package zadanie2poczekalnia;

import zadanie1koszyk.PodatekProduktu;

import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Poczekalnia poczekalnia = new Poczekalnia();

        poczekalnia.dodajKlienta("Andrzej", false);
        TimeUnit.SECONDS.sleep(1);
        poczekalnia.dodajKlienta("Zbyszek", false);
        TimeUnit.SECONDS.sleep(1);
        System.out.println("1.");
        poczekalnia.wypiszKolejnoKlientow();
        poczekalnia.pobierzKlienta();
        System.out.println("2.");
        poczekalnia.wypiszKolejnoKlientow();

        poczekalnia.dodajKlienta("Goska", true);
        TimeUnit.SECONDS.sleep(1);
        poczekalnia.dodajKlienta("Janusz", false);
        poczekalnia.dodajKlienta("Wladek", true);
        TimeUnit.SECONDS.sleep(1);
        poczekalnia.dodajKlienta("Marta", false);
        System.out.println("3.");
        poczekalnia.wypiszKolejnoKlientow();

        poczekalnia.pobierzKlienta();

        System.out.println("4.");
        poczekalnia.wypiszKolejnoKlientow();


    }
}
