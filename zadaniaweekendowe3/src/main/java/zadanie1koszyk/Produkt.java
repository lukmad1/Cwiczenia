package zadanie1koszyk;

public class Produkt {
    private String nazwaProduktu;
    private double cenaNetto;
    private PodatekProduktu podatekProduktu;


    public Produkt() {
    }

    public Produkt(String nazwaProduktu, double cenaNetto, PodatekProduktu podatekProduktu) {
        this.nazwaProduktu = nazwaProduktu;
        this.cenaNetto = cenaNetto;
        this.podatekProduktu = podatekProduktu;
    }

    public String getNazwaProduktu() {
        return nazwaProduktu;
    }

    public void setNazwaProduktu(String nazwaProduktu) {
        this.nazwaProduktu = nazwaProduktu;
    }

    public double getCenaNetto() {
        return cenaNetto;
    }

    public void setCenaNetto(double cenaNetto) {
        this.cenaNetto = cenaNetto;
    }

    public PodatekProduktu getPodatekProduktu() {
        return podatekProduktu;
    }

    public void setPodatekProduktu(PodatekProduktu podatekProduktu) {
        this.podatekProduktu = podatekProduktu;
    }


    @Override
    public String toString() {
        return nazwaProduktu +
                ", cenaNetto=" + cenaNetto +
                ", podatekProduktu=" + podatekProduktu;
    }

    public double podajCeneBrutto() {
        return cenaNetto + cenaNetto * podatekProduktu.getPodatek();
    }

}
