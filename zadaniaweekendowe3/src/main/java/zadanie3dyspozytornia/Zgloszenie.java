package zadanie3dyspozytornia;

import java.time.LocalTime;

public class Zgloszenie{
    private TypZgloszenia typZgloszenia;
    private String trescZgloszenia;
    private LocalTime czasZgloszenia;

    public Zgloszenie() {
    }

    public Zgloszenie(TypZgloszenia typZgloszenia, String trescZgloszenia) {
        this.typZgloszenia = typZgloszenia;
        this.trescZgloszenia = trescZgloszenia;
        this.czasZgloszenia = LocalTime.now();
    }

    public TypZgloszenia getTypZgloszenia() {
        return typZgloszenia;
    }

    public void setTypZgloszenia(TypZgloszenia typZgloszenia) {
        this.typZgloszenia = typZgloszenia;
    }

    public String getTrescZgloszenia() {
        return trescZgloszenia;
    }

    public void setTrescZgloszenia(String trescZgloszenia) {
        this.trescZgloszenia = trescZgloszenia;
    }

    public LocalTime getCzasZgloszenia() {
        return czasZgloszenia;
    }

    public void setCzasZgloszenia(LocalTime czasZgloszenia) {
        this.czasZgloszenia = czasZgloszenia;
    }


    @Override
    public String toString() {
        return "Tresc zgloszenia: '" + trescZgloszenia + '\'' +
                ", Czas zgloszenia: " + czasZgloszenia +
                ", Zgloszenie dla: " + typZgloszenia;
    }
}
