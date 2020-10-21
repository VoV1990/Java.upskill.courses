import java.util.Random;

//Реализуйте сортировку выбором.

public class SelectionSort {
    public static int[] array;
    public static void main(String[] args) {
        Random random = new Random();
        initializeArray(random);
        System.out.println("Array before sort:");
        printArray();
        selectionSort();

        System.out.println("Array after sort:");
        printArray();
    }

    private static void initializeArray(Random random) {
        array = new int[10];
        for (int i = 0; i < array.length; i++) {
                array[i] = random.nextInt(25);
        }
    }

    private static void selectionSort() {
        int temp;
        for (int i = 0; i < array.length; i++) {
            int indexMin = i;
            for (int j = i; j < array.length; j++) {
                if (array[j] < array[indexMin]) {
                    indexMin = j;
                }
            }
            temp = array[i];
            array[i] = array[indexMin];
            array[indexMin] = temp;
        }
    }

    private static void printArray() {
        for (Integer n : array) System.out.print(n + " ");
        System.out.println();
    }
}
