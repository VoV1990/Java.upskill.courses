import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Дано натуральное число N.
//Написать метод(методы) для формирования массива, элементами которого являются цифры числа N.

public class ArrayOfDigits {
    public static int[] array;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter the number: ");
        int num = Integer.parseInt(reader.readLine());
        getArray(num);
        printArray();
    }

    private static void getArray(int num) {
        String str = Integer.toString(num);
        int len = str.length();
        array = new int[len];
        for (int i = array.length - 1; i >= 0; i--) {
            int a = num % 10;
            array[i] = a;
            num /= 10;
        }
    }

    private static void printArray() {
        for (Integer n : array) System.out.print(n + " ");
        System.out.println();
    }
}
