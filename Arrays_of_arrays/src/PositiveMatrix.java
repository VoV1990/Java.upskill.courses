import java.io.IOException;

//Задана матрица неотрицательных чисел.
//Посчитать сумму элементов в каждом столбце. Определить, какой столбец содержит максимальную сумму.

public class PositiveMatrix {
    public static int[][] array;

    public static void main(String[] args) {
        initializeArray();
        printArray();
        sumOfNum();
    }

    private static void initializeArray() {
        int k = 10;
        array = new int[6][6];
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

    private static void sumOfNum() {
        int sum = 0;
        int max = 0;
        int indexMaxColumn = 0;
        for (int i = 0; i < array[0].length; i++) {
            for (int j = 0; j < array.length; j++) {
                sum += array[j][i];
            }
            System.out.printf("Sum of numbers in column %d: %d\n", (i + 1), sum);
            if(sum > max) {
                max = sum;
                indexMaxColumn = i + 1;
            }
            sum = 0;
        }
        System.out.printf("Max sum is: %d, in column: %d", max, indexMaxColumn);
    }
}
