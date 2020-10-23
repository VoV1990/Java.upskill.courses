import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

//Натуральное число, в записи которого n цифр, называется числом Армстронга, если сумма его цифр,
//возведенная в степень n, равна самому числу. Найти все числа Армстронга от 1 до k.
//Для решения задачи использовать декомпозицию.

public class ArmstrongNum {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter the number greater than 0: ");
        int k = Integer.parseInt(reader.readLine());
        getArmstrongNum(k);
    }

    private static void getArmstrongNum(int k) {
        List<Long> list;
        list = calculateArmstrongNum(k);
        for (Long l : list) System.out.print(l + " ");
    }

    private static List<Long> calculateArmstrongNum(int k) {
        List<Long> list = new ArrayList<>();
        long sum = 0;
        int lengthOfNum;
        for (long i = 1; i <= k; i++) {
            long num = i;
            lengthOfNum = getLength(num);
            while (num != 0) {
                long a = num % 10;
                num /= 10;
                a = getDegree(a, lengthOfNum);
                sum += a;
            }
            if(sum == i)
               list.add(i);
            sum = 0;
        }
        return list;
    }

    private static int getLength(long num) {
        int count = 0;
        while (num != 0) {
            num /= 10;
            count++;
        }
        return count;
    }

    private static long getDegree(long sum, int count) {
        return (long) Math.pow(sum, count);
    }
}
