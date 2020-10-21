import java.util.Random;

//Найдите наибольший элемент матрицы и заменить все нечетные элементы на него.

public class ChangeToMax {
    public static int[][] array;

    public static void main(String[] args) {
        Random random = new Random();
        initializeArray(random);
        System.out.println("Matrix before sort: ");
        printArray();
        int max = getMaxValue();
        changeOddValues(max);
        System.out.println("Matrix after replacing odd values with the maximum value: ");
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

    private static int getMaxValue() {
        int max = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if(array[i][j] > max) max = array[i][j];
            }
        }
        return max;
    }

    private static void changeOddValues(int max) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if(array[i][j] % 2 != 0) array[i][j] = max;
            }
        }
    }
}
