package zadanie4wiadomosci;

import java.time.LocalDateTime;

public class Wiadomosc {
    private String trescWiadomosci;
    private LocalDateTime dataOdebrania;

    public Wiadomosc() {
    }

    public Wiadomosc(String trescWiadomosci, LocalDateTime dataOdebrania) {
        this.trescWiadomosci = trescWiadomosci;
        this.dataOdebrania = dataOdebrania;
    }

    public String getTrescWiadomosci() {
        return trescWiadomosci;
    }

    public void setTrescWiadomosci(String trescWiadomosci) {
        this.trescWiadomosci = trescWiadomosci;
    }

    public LocalDateTime getDataOdebrania() {
        return dataOdebrania;
    }

    public void setDataOdebrania(LocalDateTime dataOdebrania) {
        this.dataOdebrania = dataOdebrania;
    }

    @Override
    public String toString() {
        return "Tresc Wiadomosci: '" + trescWiadomosci + '\'' +
                ", Data Odebrania: " + dataOdebrania;
    }
}
