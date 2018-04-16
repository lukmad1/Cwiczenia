package zadanie4wiadomosci;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.TreeMap;

public class Telefon {
    TreeMap<String, SkrzynkaOdbiorcza> mapaWiadomosci = new TreeMap<>();

    public void dodajWiadomosc(String nadawca, String tresc) {
        if (!mapaWiadomosci.keySet().contains(nadawca)) {
            mapaWiadomosci.put(nadawca, new SkrzynkaOdbiorcza());
        }
        mapaWiadomosci.get(nadawca).dodajWiadomosc(tresc);
        System.out.println("Nowa wiadomosc od: " + nadawca);
    }

    public List<Wiadomosc> listujWiadomosci(String nadawca) {
        mapaWiadomosci.get(nadawca).wylistujWiadomosci();
        return mapaWiadomosci.get(nadawca).getStosWiadomosci();
    }

    public Wiadomosc usunOstatniaWiadomosc(String nadawca) {

        if (!mapaWiadomosci.containsKey(nadawca)) {
            System.out.println("Brak nadawcy");
            return new Wiadomosc();
        }
        Wiadomosc wiadomoscDoUsuniecia = mapaWiadomosci.get(nadawca).usunNajnowszaWiadomosc();

        if (wiadomoscDoUsuniecia.getTrescWiadomosci() == null) {
            System.out.println("Brak wiadomosci od: " + nadawca);
            return new Wiadomosc();
        }
        System.out.println("Usunieto wiadomosc " + wiadomoscDoUsuniecia +
                " ze skrzynki odbiorczej nadawcy: " + nadawca);
        return wiadomoscDoUsuniecia;
    }
}

