package pl.sda.zadanie7;

public class Main {
    public static void main(String[] args) {
        int[][] doubleArray = new int[][]{{1,2,3,4,5},{5,4,3,2,1}, {4,3,2,1}};

        printDoubleArray(doubleArray);
    }

    private static void printDoubleArray(int[][] doubleArray) {
        for (int i = 0; i < doubleArray.length; i++) {
            for (int j = 0; j < doubleArray[i].length; j++) {
                System.out.print(doubleArray[i][j]+",");
            }
            System.out.println();
        }
    }
}
