import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Задан массив D. Определить следующие суммы:
// D[l] + D[2] + D[3]; D[3] + D[4] + D[5]; D[4] +D[5] +D[6].
//Пояснение. Составить метод(методы) для вычисления суммы трех последовательно
//расположенных элементов массива с номерами от k до m.

public class SumOfElements {
    public static int[] array = {3, 0, 5, 15, 6, 8, 19, -3, 10, 23, 88, 99, 63};

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter the number: ");
        int k = Integer.parseInt(reader.readLine());
        if(k > array.length || k < 1)
            System.out.println("Entered number outside the array");
        else
            System.out.println("Sum the interval of the array is: " + getSum(k));
    }

    private static int getSum(int k) {
        int sum = 0;
        k -= 1;
        int j = 3;
        for (int i = k; i < array.length && j > 0; i++) {
            j--;
            sum += array[i];
        }
        return sum;
    }
}
