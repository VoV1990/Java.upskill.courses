import java.util.Random;

//Отсотрировать стобцы матрицы по возрастанию и убыванию значений эементов.

public class MatrixSortColumns {
    public static int[][] array;

    public static void main(String[] args) {
        Random random = new Random();
        initializeArray(random);
        System.out.println("Matrix before sort: ");
        printArray();
        ascendingSortColumn();
        System.out.println("Matrix after sort columns in ascending order: ");
        printArray();
        descendingSortColumn();
        System.out.println("Matrix after sort columns in descending order: ");
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

    private static void ascendingSortColumn() {
        int column = 0;
        int temp;
        do {
            for (int i = 0; i < array.length; i++) {
                for (int j = i + 1; j < array.length; j++) {
                    if(array[i][column] > array[j][column]) {
                        temp = array[i][column];
                        array[i][column] = array[j][column];
                        array[j][column] = temp;
                    }
                }
            }
            column++;
        } while (column < array[0].length);
    }

    private static void descendingSortColumn() {
        int column = 0;
        int temp;
        do {
            for (int i = 0; i < array.length; i++) {
                for (int j = i + 1; j < array.length; j++) {
                    if(array[i][column] < array[j][column]) {
                        temp = array[i][column];
                        array[i][column] = array[j][column];
                        array[j][column] = temp;
                    }
                }
            }
            column++;
        } while (column < array[0].length);
    }
}
