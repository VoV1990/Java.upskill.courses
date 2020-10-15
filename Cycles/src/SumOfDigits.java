import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Напишите программу, где пользователь вводит любое целое положительное число.
// А программа суммирует все числа от 1 до введенного пользователем числа

public class SumOfDigits {
    static {
        System.out.println("Please enter a number greater than zero: ");
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(reader.readLine());
        if (num < 0) {
            System.out.println("The Number entered is less than zero");
        } else {
            System.out.println(getSumOfDigits(num));
        }
    }

    private static long getSumOfDigits(int num) {
        long sum = 0;
        for (int i = 1; i <= num; i++) {
            sum += i;
        }
        return sum;
    }
}
