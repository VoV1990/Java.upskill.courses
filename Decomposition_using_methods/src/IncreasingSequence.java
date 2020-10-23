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
        int index = 0;
        for(long i = count; !stop; i++) {
            long num = i;
            if(isLength(num, n)) {
                while (num != 0) {
                    int a = (int) (num % 10);
                    num /= 10;
                    array[index] = a;
                    index++;
                }
            } else stop = true;
            index = 0;
            if(isIncreasingSequence(array)) System.out.print(i + " ");
        }
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
