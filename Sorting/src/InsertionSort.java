import java.util.Random;

public class InsertionSort {
    public static int[] array;

    public static void main(String[] args) {
        Random random = new Random();
        initializeArray(random);
        System.out.println("Array before sort:");
        printArray();
        insertionSort();

        System.out.println("Array after sort:");
        printArray();
    }

    private static void initializeArray(Random random) {
        array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(25);
        }
    }

    private static void insertionSort() {
        for (int i = 0; i < array.length; i++) {
            int num = array[i];
            int j = i - 1;
            for (; j >= 0; j-- ) {
                if (num < array[j]) {
                   array[j + 1] = array[j];
                } else {
                   break;
                }
            }
            array[j + 1] = num;
        }
    }

    private static void printArray() {
        for (Integer n : array) System.out.print(n + " ");
        System.out.println();
    }
}