import java.util.Random;

//Отсортировать строки матрицы по возрастанию и убыванию значений элементов.

public class MatrixSortRows {
    public static int[][] array;

    public static void main(String[] args) {
        Random random = new Random();
        initializeArray(random);
        System.out.println("Matrix before sort: ");
        printArray();
        ascendingSortRows();
        System.out.println("Matrix after sort rows in ascending order: ");
        printArray();
        descendingSortRows();
        System.out.println("Matrix after sort rows in descending order: ");
        printArray();
    }

    private static void initializeArray(Random random) {
        array = new int[10][10];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                array[i][j] = random.nextInt(16);
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

    private static void ascendingSortRows() {
        int string = 0;
        int temp;
        do {
            for (int i = 0; i < array[0].length; i++) {
                for (int j = i + 1; j < array[0].length; j++) {
                    if(array[string][i] > array[string][j]) {
                        temp = array[string][i];
                        array[string][i] = array[string][j];
                        array[string][j] = temp;
                    }
                }
            }
            string++;
        } while (string < array.length);
    }

    private static void descendingSortRows() {
        int string = 0;
        int temp;
        do {
            for (int i = 0; i < array[0].length; i++) {
                for (int j = i + 1; j < array[0].length; j++) {
                    if(array[string][i] < array[string][j]) {
                        temp = array[string][i];
                        array[string][i] = array[string][j];
                        array[string][j] = temp;
                    }
                }
            }
            string++;
        } while (string < array.length);
    }
}
