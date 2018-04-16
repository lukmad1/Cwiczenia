package zadanie1koszyk;

import java.util.ArrayList;

public class Rachunek {
    private ArrayList<Produkt> produkty = new ArrayList<>();


    public ArrayList<Produkt> getProdukty() {
        return produkty;
    }

    public void dodajProdukt(Produkt produkt) {
        produkty.add(produkt);
    }

    public void wypiszRachunek() {
        for (Produkt produkt : produkty) {
            System.out.println(produkt);
        }
    }

    public double podsumujRachunekNetto() {
        double sumaRachunkuNetto = 0;
        for (Produkt produkt : produkty) {
            sumaRachunkuNetto += produkt.getCenaNetto();
        }
        return sumaRachunkuNetto;
    }

    public double podsumujRachunekBrutto() {
        double sumaRachunkuBrutto = 0;
        for (Produkt produkt : produkty) {
            sumaRachunkuBrutto += produkt.podajCeneBrutto();
        }
        return sumaRachunkuBrutto;
    }

    public double zwrocWartoscPodatku() {
        return podsumujRachunekBrutto() - podsumujRachunekNetto();
    }

    public double coByByloGdybyPodatekNaWszystkimByl8() {
        double sumaGdyby8 = 0;
        for (Produkt produkt : produkty) {
            sumaGdyby8 += produkt.getCenaNetto() + produkt.getCenaNetto() * PodatekProduktu.VAT8.getPodatek();
        }
        return sumaGdyby8;
    }


    public double coByByloGdybyPodatekNaWszystkimByl23() {
        double sumaGdyby23 = 0;
        for (Produkt produkt : produkty) {
            sumaGdyby23 += produkt.getCenaNetto() + produkt.getCenaNetto() * PodatekProduktu.VAT23.getPodatek();
        }
        return sumaGdyby23;
    }

}
