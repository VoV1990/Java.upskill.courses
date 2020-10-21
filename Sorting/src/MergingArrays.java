//Заданы два одномерных массива с различным количеством элементов и натуральное число k.
//Объединить их в один массив, включив второй массив между k-м и (k+1) - м элементами первого,
//при этом не используя дополнительный массив.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class MergingArrays {
    public static int[] array1 = {1, 2, 3, 4, 5};
    public static int[] array2 = {0, 9, 8, 7, 13, 18};

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.printf("Please enter a number greater than %d and less than %d:\n",
                array1.length, array2.length);
        int k = Integer.parseInt(reader.readLine());
        System.out.println("Array1 before changes:");
        printArray();
        mergingArrays(k);
        System.out.println("Array1 after changes:");
        printArray();
    }

    private static void mergingArrays(int k) {
        k -= 1;
        int oldLength = array1.length - 1;
        array1 = Arrays.copyOf(array1, array1.length + array2.length);
        int newLength = array1.length - 1;
        int index = 0;
        for (int i = oldLength; i > k; i--) {
            array1[newLength] = array1[i];
            newLength--;
        }

        for (int i = k + 1; i <= newLength; i++) {
            array1[i] = array2[index];
            index++;
        }
    }

    private static void printArray() {
        for (Integer n : array1) System.out.print(n + " ");
        System.out.println();
    }
}
