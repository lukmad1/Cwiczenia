package zadanie3dyspozytornia;

import java.time.format.DateTimeFormatter;;
import java.util.*;

import static java.lang.Math.abs;

public class Dyspozytornia {
    TreeMap<String, Zgloszenie> zgloszenia = new TreeMap<>();


    public void dodajZgloszenie(String tresc, TypZgloszenia typZgloszenia) {
        Zgloszenie zgloszenie = new Zgloszenie(typZgloszenia, tresc);
        zgloszenia.put(generujKlucz(zgloszenie), zgloszenie);
//        System.out.println(generujKlucz(zgloszenie));
    }

    public void drukujZgloszenia() {
        for (String klucz : zgloszenia.keySet()) {
            System.out.println(zgloszenia.get(klucz));
        }
    }

    public List<Zgloszenie> zwrocNajaktualniejszeZgloszenia(int ilosc) {
        List<Zgloszenie> aktualneZgloszenia = new ArrayList<>();
        int licznik = 0;
        for (String klucz : zgloszenia.keySet()) {
            aktualneZgloszenia.add(zgloszenia.get(klucz));
            licznik++;
            if (licznik == ilosc) break;
        }
        return aktualneZgloszenia;
    }

    public List<Zgloszenie> zwrocZgloszeniaTypu(TypZgloszenia typZgloszenia) {
        List<Zgloszenie> zgloszeniaTypu = new ArrayList<>();
        Zgloszenie sprawdzaneZgloszenie;
        for (String klucz : zgloszenia.keySet()) {
            sprawdzaneZgloszenie = zgloszenia.get(klucz);
            if (sprawdzaneZgloszenie.getTypZgloszenia().equals(typZgloszenia)) {
                zgloszeniaTypu.add(sprawdzaneZgloszenie);
            }
        }
        return zgloszeniaTypu;
    }

    private String generujKlucz(Zgloszenie zgloszenie) { //wymyslony generator klucza
        String klucz = "";
        Integer kluczLiczbowy;
        klucz += zgloszenie.getCzasZgloszenia().format(DateTimeFormatter.ofPattern("HHmmssS"));
        kluczLiczbowy = zgloszenie.getTypZgloszenia().hashCode();
        klucz += kluczLiczbowy.toString().subSequence(0, 2).toString();
        kluczLiczbowy = abs(zgloszenie.hashCode());                     //wyciagamy wartosc bezwzgledna haschodu zgloszenia (czasem daje ujemne)
        klucz += kluczLiczbowy.toString().subSequence(0, 6);            //przycinamy hashcode zgloszenia, zeby wszystkie klucze mialy taka sama dlugosc
        return klucz;            //klucz jako najbardziej znaczace cyfry
                                 // przyjmuje czas dodania zgloszenia,
                                 //dzieki czemu TreeSet "zgloszenia" zawsze bedzie posortowany po czasie
    }


}
