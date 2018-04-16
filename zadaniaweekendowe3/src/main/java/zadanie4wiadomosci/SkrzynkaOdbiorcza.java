package zadanie4wiadomosci;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class SkrzynkaOdbiorcza {
    private List<Wiadomosc> stosWiadomosci = new ArrayList<Wiadomosc>();

    public List<Wiadomosc> getStosWiadomosci() {
        return stosWiadomosci;
    }

    public void dodajWiadomosc(String tresc) {
        stosWiadomosci.add(new Wiadomosc(tresc, LocalDateTime.now()));

    }

    public Wiadomosc usunNajnowszaWiadomosc(){
        if (stosWiadomosci.size() < 1){
            return new Wiadomosc();
        }
        return stosWiadomosci.remove(stosWiadomosci.size()-1);
    }

    public void wylistujWiadomosci(){
        stosWiadomosci.forEach(System.out::println);
    }

}
