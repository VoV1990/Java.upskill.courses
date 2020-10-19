import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К.

public class MultipleNumbers {
    public static int[] array = new int[100];

    static {
        System.out.println("Please enter the natural number (from 1 to 100):");
    }

    public static void main(String[] args) throws IOException {
        initializeArray();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(reader.readLine());
        System.out.println("The sum of multiple numbers: " + getSumMultiple(num));
    }

    private static void initializeArray() {
        for (int i = 0; i < 100; i++) {
            array[i] = i + 1;
        }
    }

    private static int getSumMultiple(int num) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if((num % array[i]) == 0) {
                sum += array[i];
            }
        }
        return sum;
    }
}
