//Написать метод(методы) для вычисления суммы факториалов всех нечетных чисел от 1 до 9.

public class SumOfFactorial {
    public static void main(String[] args) {
        System.out.println("Sum of factorials of odd numbers from 1 to 9: " + getSumOfFactorial());
    }

    public static long getSumOfFactorial () {
        long sum = 0;
        long factorial = 1;

        for(int i = 1; i < 10; i+=2) {
            factorial *= i;
            sum += factorial;
        }
        return sum;
    }
}
