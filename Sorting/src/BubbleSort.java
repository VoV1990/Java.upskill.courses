import java.util.Random;

//Реализуйте сортировку обменами.

public class BubbleSort {
    public static int[] array;

    public static void main(String[] args) {
        Random random = new Random();
        initializeArray(random);
        System.out.println("Array before sort:");
        printArray();
        bubbleSort();

        System.out.println("Array after sort:");
        printArray();
    }

    private static void initializeArray(Random random) {
        array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(25);
        }
    }

    private static void bubbleSort() {
        int temp;
        for(int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if(array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    private static void printArray() {
        for (Integer n : array) System.out.print(n + " ");
        System.out.println();
    }
}
