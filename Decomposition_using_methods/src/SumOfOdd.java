import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

//Написать программу, определяющую сумму n - значных чисел, содержащих только нечетные цифры.
//Определить также, сколько четных цифр в найденной сумме.
//Для решения задачи использовать декомпозицию.

public class SumOfOdd {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter the number greater than 1: ");
        int n = Integer.parseInt(reader.readLine());
        if(n == 1) System.out.println("The length of entered number equals 1, try again");
        else {
            int count = getCountValue(n);
            calculateOddNum(count, n);
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

    private static void calculateOddNum(int count, int n) {
        List<Long> list = new ArrayList<>();
        boolean stop = false;
        boolean isOdd;
        for(long i = count; !stop; i++) {
            if(isLength(i, n)) {
                isOdd = validateOdd(i);
            } else {
                stop = true;
                isOdd = false;
            }
            if(isOdd) list.add(i);
        }
        if(list.size() > 0) getSum(list);
    }

    private static boolean isLength(long num, int n) {
        int count = 0;
        while (num != 0) {
            num /= 10;
            count++;
        }
        return count == n;
    }

    private static boolean validateOdd(long num) {
        while (num != 0) {
            int a = (int) (num % 10);
            num /= 10;
            if(a % 2 == 0) return false;
        }
        return true;
    }

    private static void getSum(List<Long> list) {
        long sum = 0;
        for (Long l : list) {
            System.out.print(l + " ");
            sum += l;
        }
        System.out.println();
        System.out.println("The sum of numbers with only odd digits: " + sum);
        getCountEvenDigits(sum);
    }

    private static void getCountEvenDigits(long sum) {
        int count = 0;
        while (sum != 0) {
            int a = (int) (sum % 10);
            sum /= 10;
            if(a % 2 == 0) count++;
        }
        System.out.println("The quantity of even digits in sum of " +
                "numbers with only odd digits: " + count);
    }
}
