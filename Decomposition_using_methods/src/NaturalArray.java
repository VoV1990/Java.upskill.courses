import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

//Даны натуральные числа К и N. Написать метод(методы) формирования массива А,
//элементами которого являются числа, сумма цифр которых равна К и которые не большее N.

public class NaturalArray {
    public static int[] array;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter two numbers greater than 0: ");
        int k = Integer.parseInt(reader.readLine());
        int n = Integer.parseInt(reader.readLine());
        getArray(k, n);
        printArray();
    }

    private static void getArray(int k, int n) {
        List<Integer> list = new ArrayList<>();
        int sum;
        for (int i = 1; i <= n; i++) {
            sum = getSumOfDigits(i);
            if(sum == k) list.add(i);
        }
        array = new int[list.size()];
        for (int j = 0; j < list.size(); j++)
            array[j] = list.get(j);
    }

    private static int getSumOfDigits(int num) {
        int sum = 0;
        int a;
        while (num != 0) {
            a = num % 10;
            sum += a;
            num /= 10;
        }
        return sum;
    }

    private static void printArray() {
        for (Integer n : array) System.out.print(n + " ");
        System.out.println();
    }
}
