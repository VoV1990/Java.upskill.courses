//Из заданного числа вычли сумму его цифр.
//Из результата вновь вычли сумму его цифр и т.д.
//Сколько таких действий надо произвести, чтобы получился нуль?
//Для решения задачи использовать декомпозицию.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AimForZero {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter the number greater than 1: ");
        int num = Integer.parseInt(reader.readLine());
        if(num < 10) System.out.println("Number of actions up to zero: 1");
        else goToZero(num);
    }

    private static void goToZero(int num) {
        int count = 0;
        while (num > 0) {
            int sumOfDigits = getSumOfDigits(num);
            num -= sumOfDigits;
            count++;
        }
        System.out.println("Number of actions up to zero: " + count);
    }

    private static int getSumOfDigits(int num) {
        int sum = 0;
        while (num != 0) {
            int a = num % 10;
            num /= 10;
            sum += a;
        }
        return sum;
    }
}


