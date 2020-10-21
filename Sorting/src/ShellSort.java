import java.util.Random;

public class ShellSort {
    public static int[] array;

    public static void main(String[] args) {
        Random random = new Random();
        initializeArray(random);
        System.out.println("Array before sort:");
        printArray();
        shellSort();

        System.out.println("Array after sort:");
        printArray();
    }

    private static void initializeArray(Random random) {
        array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(25);
        }
    }

    private static void shellSort() {
        int dist = array.length / 2;
        while (dist > 0) {
            for (int i = dist; i < array.length; i++) {
                for (int j = i - dist; j >= 0 && array[j] > array[j + dist]; j -= dist) {
                    int temp = array[j];
                    array[j] = array[j + dist];
                    array[j + dist] = temp;
                }
            }
            dist = dist / 2;
        }
    }

    private static void printArray() {
        for (Integer n : array) System.out.print(n + " ");
        System.out.println();
    }
}
