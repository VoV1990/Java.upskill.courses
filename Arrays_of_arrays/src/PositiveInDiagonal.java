//Найти положительные элементы главной диагонали квадратной матрицы.

public class PositiveInDiagonal {
    public static int[][] array;

    public static void main(String[] args) {
        initializeArray();
        printArray();
        printDiagonal();
    }

    private static void initializeArray() {
        int k = -9;
        array = new int[5][5];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                array[i][j] = k;
                k++;
            }
        }
    }

    private static void printArray() {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void printDiagonal() {
        for (int i = 0; i < array.length; i++) {
            if(array[i][i] > 0)
                System.out.println(array[i][i]);
        }
    }
}
