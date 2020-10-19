import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Дан массив действительных чисел, размерность которого N.
//Подсчитать, сколько в нем отрицательных, положительных и нулевых элементов.

public class RealArray {
    public static int[] array;

    static {
        System.out.println("Please specify the size of the array:");
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(reader.readLine());
        initializeArray(num);
        getCountRealNum(array);
    }

    private static void initializeArray(int num) {
        array = new int[num];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
    }

    private static void getCountRealNum(int [] array) {
        int negativeNum = 0;
        int zeroNum = 0;
        int positiveNum = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] < 0) negativeNum++;
            else if(array[i] == 0) zeroNum++;
            else positiveNum++;
        }
        System.out.println("Count of negative numbers: " + negativeNum);
        System.out.println("Count of zero numbers: " + zeroNum);
        System.out.println("Count of positive numbers: " + positiveNum);
    }
}