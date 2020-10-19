//Задана последовательность N вещественных чисел.
//Вычислить сумму чисел, порядковые номера которых являются простыми числами.

public class PrimeNumbers {
    public static double[] array = {1, 4, 8, 3.3, 5.6, 2.1, 10, 4.2, 9, 1.2};

    public static void main(String[] args) {
        System.out.println(sumOfNum());
    }

    private static double sumOfNum () {
        double sum = 0;
        int dividers = 0;
        for (int i = 2; i < array.length; i++) {
            for (int j = 1; j <= i; j++) {
                if(i % j == 0)
                    dividers++;
            }
            if (dividers == 2)
                sum += array[i];
            dividers = 0;
        }
        return sum;
    }
}
