package zadanie2poczekalnia;

import java.time.LocalTime;

public class Klient {
    private String imie;
    private LocalTime czasPrzybycia;
    private boolean czyJestPriorytetem;

    public Klient() {
    }

    public Klient(String imie, LocalTime czasPrzybycia, boolean czyJestPriorytetem) {
        this.imie = imie;
        this.czasPrzybycia = czasPrzybycia;
        this.czyJestPriorytetem = czyJestPriorytetem;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public LocalTime getCzasPrzybycia() {
        return czasPrzybycia;
    }

    public void setCzasPrzybycia(LocalTime czasPrzybycia) {
        this.czasPrzybycia = czasPrzybycia;
    }

    public boolean czyJestPriorytetem() {
        return czyJestPriorytetem;
    }

    public void setCzyJestPriorytetem(boolean czyJestPriorytetem) {
        this.czyJestPriorytetem = czyJestPriorytetem;
    }

    @Override
    public String toString() {
        return "Klient{" +
                "imie='" + imie + '\'' +
                ", czasPrzybycia=" + czasPrzybycia +
                ", czyJestPriorytetem=" + czyJestPriorytetem +
                '}';
    }



}
