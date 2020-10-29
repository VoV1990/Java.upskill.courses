import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Найти все натуральные n-значные числа, цифры в которых образуют строго
//возрастающую последовательность (например, 1234, 5789).
//Для решения задачи использовать декомпозицию.

public class IncreasingSequence {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter the number greater than 1: ");
        int n = Integer.parseInt(reader.readLine());
        if(n == 1) System.out.println("The sequence is missing");
        else {
            int count = getCountValue(n);
            calculateSequence(count, n);
        }
    }

    private static int getCountValue(int n) {
        StringBuilder builder = new StringBuilder("1");
        int count;
        for (int i = 1; i < n; i++) {
            builder.append("0");
        }
        count = Integer.parseInt(builder.toString());
        return count;
    }

    private static void calculateSequence(int count, int n) {
        int [] array = new int[n];
        boolean stop = false;
        for(long i = count; !stop; i++) {
            if(isLength(i, n)) {
                array = decompositionOfNumber(i, n);
            } else stop = true;
            if(isIncreasingSequence(array)) System.out.print(i + " ");
        }
    }

    private static int[] decompositionOfNumber(long num, int n) {
        int [] array = new int[n];
        int a;
        for (int i = 0; i < array.length; ) {
            while (num != 0) {
                a = (int) (num % 10);
                num /= 10;
                array[i] = a;
                i++;
            }
        }
        return array;
    }

    private static boolean isLength(long num, int n) {
        int count = 0;
        while (num != 0) {
            num /= 10;
            count++;
        }
        return count == n;
    }

    private static boolean isIncreasingSequence(int[] array) {
        for(int i = 0; i < array.length - 1; i++) {
            if(array[i] <= array[i + 1] || (array[i] - array[i + 1]) > 1) {
                return false;
            }
        }
        return true;
    }
}
