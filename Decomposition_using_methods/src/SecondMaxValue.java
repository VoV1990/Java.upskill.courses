import java.util.Random;

//Составить программу, которая в массиве A[N] находит второе по величине число
//(вывести на печать число, которое меньше максимального элемента массива,
// но больше всех других элементов).

public class SecondMaxValue {
    public static int[] array;

    public static void main(String[] args) {
        Random random = new Random();
        initializeArray(random);
        printArray();
        getSecondMaxValue();
    }

    private static void initializeArray(Random random) {
        array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(25);
        }
    }

    private static void getSecondMaxValue() {
        int max = array[0];
        int secondMax = 0;
        for (int i = 1; i < array.length; i++) {
            if(array[i] > max) {
                secondMax = max;
                max = array[i];
            } else if (array[i] > secondMax && array[i] != max) {
                secondMax = array[i];
            }
        }
        System.out.println("Second max value of array is: " + secondMax);
    }

    private static void printArray() {
        for (Integer n : array) System.out.print(n + " ");
        System.out.println();
    }
}
