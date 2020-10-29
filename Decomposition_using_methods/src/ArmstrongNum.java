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
        List<Long> list = calculateArmstrongNum(k);
        System.out.print("Armstrong nums: ");
        for (Long l : list) System.out.print(l + " ");
    }

    private static List<Long> calculateArmstrongNum(int k) {
        List<Long> list = new ArrayList<>();
        long sum;
        for (long i = 1; i <= k; i++) {
            sum = getSum(i);
            if(sum == i)
               list.add(i);
        }
        return list;
    }

    private static long getSum(long number) {
        long sum = 0;
        int lengthOfNum = getLength(number);
        long digit;
        while (number != 0) {
            digit = number % 10;
            number /= 10;
            digit = getDegree(digit, lengthOfNum);
            sum += digit;
        }
        return sum;
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
