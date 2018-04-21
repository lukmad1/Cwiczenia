package pl.sda.zadanie1;

public class Main {

    public static void main(String[] args) {

        System.out.println(power(2,4));
        System.out.println(power(2.5f,4));
    }

    public static int power(int a, int b) {
        int powerValue = 1;
        for (int i = 0; i < b; i++) {
            powerValue *= a;
        }
        return powerValue;
    }


    public static float power(float a, int b) {
        float powerValue = 1;
        for (int i = 0; i < b; i++) {
            powerValue *= a;
        }
        return powerValue;
    }
}
