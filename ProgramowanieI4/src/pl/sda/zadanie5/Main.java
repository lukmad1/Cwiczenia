package pl.sda.zadanie5;

public class Main {
    public static void main(String[] args) {
        int[] numbersOdd = new int[]{-5, 4, 10, 20, -8, -20, 5, -20, 123};
        int[] numbersEven = new int[]{-5, 4, 5, 10, 20, -8, -20, 5, -20, 123};

        boolean isEven = isArrayEven(numbersOdd);
        System.out.println(isEven);

        isEven = isArrayEven(numbersEven);
        System.out.println(isEven);
    }

    private static boolean isArrayEven(int[] array) {

        if (array.length % 2 == 0) {
            return true;
        } else {
            return false;
        }

    }
}
