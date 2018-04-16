package zadanie1koszyk;

public class Main {
    public static void main(String[] args) {
        Rachunek rachunek = new Rachunek();
        Produkt produkt1 = new Produkt("Jablko",3.20,PodatekProduktu.VAT23);
        Produkt produkt2 = new Produkt("Mleko", 2.50,PodatekProduktu.VAT8);
        Produkt produkt3 = new Produkt("Cos z vat 5", 200,PodatekProduktu.VAT5);

      rachunek.dodajProdukt(produkt3);
      rachunek.dodajProdukt(produkt2);
      rachunek.dodajProdukt(produkt1);

        System.out.println("Rachunek netto: "+rachunek.podsumujRachunekNetto());
        System.out.println("Rachunek brutto: "+rachunek.podsumujRachunekBrutto());
        System.out.println("Podatek na produktach to: "+rachunek.zwrocWartoscPodatku());
        System.out.println("Gdyby podatek byl 8%: "+rachunek.coByByloGdybyPodatekNaWszystkimByl8());
        System.out.println("Gdyby podatek byl 23%: "+rachunek.coByByloGdybyPodatekNaWszystkimByl23());
        rachunek.wypiszRachunek();
    }
}
