//Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.

public class Diagonal {
    public static int[][] array = new int[8][8];

    public static void main(String[] args) {
        initializeArray();
        printDiagonal();
    }

    private static void initializeArray() {
        int k = 10;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                array[i][j] = k;
                k++;
            }
        }
    }

    private static void printDiagonal() {
        for (int i = 0; i < array.length; i++) {
            int k = 0;
            while (k != i) {
                System.out.print("  ");
                k++;
            }
            System.out.println(array[i][i]);
        }
    }
}
