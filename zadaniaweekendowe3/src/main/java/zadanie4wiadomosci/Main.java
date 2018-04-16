package zadanie4wiadomosci;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Telefon appleTakieDobre = new Telefon();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Uzyj 'help' aby uzyskac dostepne komendy");
        while (true) {
            String[] komenda = scanner.nextLine().toLowerCase().split(" ");

            if ("help".equals(komenda[0])) {
                System.out.println("Dostepne komendy to: " +
                        "\n1.dodaj NADAWCA TRESC" +
                        "\n2.listuj NADAWCA" +
                        "\n3.usun NADAWCA");
            } else if ("dodaj".equals(komenda[0])) {
                if (komenda.length < 3) {
                    System.out.println("Brak argumentow");
                    continue;
                }
                String trescSmska = "";
                for (int i = 2; i < komenda.length; i++) {
                    trescSmska += (komenda[i] + " ");
                }
                appleTakieDobre.dodajWiadomosc(komenda[1], trescSmska);

            } else if ("listuj".equals(komenda[0])) {
                if (komenda.length < 2) {
                    System.out.println("Brak argumentow");
                    continue;
                }
                appleTakieDobre.listujWiadomosci(komenda[1]);

            } else if ("usun".equals(komenda[0])) {
                if (komenda.length < 2) {
                    System.out.println("Brak argumentow");
                    continue;
                }
                appleTakieDobre.usunOstatniaWiadomosc(komenda[1]);

            } else if ("quit".equals(komenda[0])) {
                return;
            }else {
                System.out.println("Brak komendy! Uzyj 'help'");
            }


        }
    }
}
