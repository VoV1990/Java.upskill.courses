import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Дана последовательность действительных чисел а1 ,а2 ,..., ап.
//Заменить все ее члены, большие данного Z, этим числом. Подсчитать количество замен.

public class Replacing {
    public static int[] array = new int[200];

    static {
        System.out.println("Please enter the number (from 1 to 200):");
    }

    public static void main(String[] args) throws IOException {
        initializeArray();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(reader.readLine());
        System.out.println("The count of replacement: " + getSumMultiple(num));
    }

    private static void initializeArray() {
        for (int i = 0; i < 200; i++) {
            array[i] = i + 1;
        }
    }

    private static int getSumMultiple(int num) {
        int count = 0;
        for (int i = num; i < array.length; i++) {
            array[i] = num;
            count++;
        }
        return count;
    }
}
