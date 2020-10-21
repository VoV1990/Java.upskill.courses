//Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего.

public class Matrix {
    public static int[][] array = new int[10][5];
    public static void main(String[] args) {
        initializeArray();
        printColumns();
    }

    private static void initializeArray() {
        int k = 85;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 5; j++) {
                array[i][j] = k;
                k--;
            }
        }
    }

    private static void printColumns() {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j+=2) {
                if(array[0][j] > array[array.length - 1][j])
                    System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
