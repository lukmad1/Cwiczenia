package zadanie2poczekalnia;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Comparator;

public class Poczekalnia {

    private ArrayList<Klient> kolejkaPriorytetowa = new ArrayList<>();

    public void dodajKlienta(String imieKlienta, boolean czyPosiadaPriorytet) {
        Klient nowyKlient = new Klient(imieKlienta, LocalTime.now(), czyPosiadaPriorytet);
        kolejkaPriorytetowa.add(nowyKlient);
        kolejkaPriorytetowa.sort(new Comparator<Klient>() {
            @Override
            public int compare(Klient o1, Klient o2) {
                if (o1.czyJestPriorytetem() && o2.czyJestPriorytetem()) {
                    if (o1.getCzasPrzybycia().compareTo(o2.getCzasPrzybycia()) < 0) {
                        return -1;
                    } else if (o1.getCzasPrzybycia().compareTo(o2.getCzasPrzybycia()) == 0) {
                        return 0;
                    } else {
                        return 1;
                    }
                } else if (o1.czyJestPriorytetem() && !o2.czyJestPriorytetem()) {
                    return -1;
                } else if (!o1.czyJestPriorytetem() && o2.czyJestPriorytetem()) {
                    return 1;
                } else {
                    return 0;
                }
            }
        });
    }

    public Klient pobierzKlienta() {
        Klient klient =kolejkaPriorytetowa.get(0);
        kolejkaPriorytetowa.remove(0);  //zakladamy ze klient zostaje obsluzony wiec usuwamy go z kolejki
        return klient;
    }

    public void wypiszKolejnoKlientow() {
        kolejkaPriorytetowa.stream().forEach(System.out::println);
    }


}
