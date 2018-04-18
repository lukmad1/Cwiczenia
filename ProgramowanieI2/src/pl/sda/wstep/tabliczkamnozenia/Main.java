package pl.sda.wstep.tabliczkamnozenia;

public class Main {
    public static void main(String[] args) {
//      Mniej ladny sposob formatowania
//        for (int i = 1; i < 11; i++) {
//            for (int j = 1; j < 11; j++) {
//                System.out.printf("%03d ", i*j);
//            }
//
//            System.out.println();
//        }


//      Dluzszy kod alelepiej sformatowane

        for (int i = 1; i < 11; i++) {
            for (int j = 1; j < 11; j++) {
                if (i * j < 10) {
                    System.out.print("   " + i * j);
                } else if (i * j >= 10) {
                    System.out.print("  " + i * j);
                } else if (i * j > 99) {
                    System.out.print(" " + i * j);
                }
            }

            System.out.println();
        }

    }
}
