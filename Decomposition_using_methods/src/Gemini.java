import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

//Два простых числа называются «близнецами», если они отличаются друг от друга на 2 (например, 41 и 43).
//Найти и напечатать все пары «близнецов» из отрезка [n,2n],
//где n - заданное натуральное число больше 2. Для решения задачи использовать декомпозицию.

public class Gemini {
    public static int[] array;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter the number greater than 2: ");
        int n = Integer.parseInt(reader.readLine());
        initializeArray(n);
        int []simpleNum = getSimpleNumbers();
        getGemini(simpleNum);
    }

    private static void initializeArray(int n) {
        array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = n;
            n++;
        }
    }

    private static int[] getSimpleNumbers() {
        List<Integer> list = new ArrayList<>();
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            int num = array[i];
            for(int j = 1; j <= num; j++) {
                if(num % j == 0) count++;
            }
            if(count == 2) list.add(array[i]);
            count = 0;
        }
        int[] array1 = new int[list.size()];
        for (int k = 0; k < list.size(); k++)
            array1[k] = list.get(k);

        return array1;
    }

    private static void getGemini(int[] simpleNum) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < simpleNum.length; i++) {
            for(int j = 1; j < simpleNum.length; j++) {
                if(simpleNum[j] - simpleNum[i] == 2) {
                    list.add(simpleNum[i]);
                    list.add(simpleNum[j]);
                }
            }
        }
        if(list.size() > 0) {
            System.out.print("Gemini: ");
            for (Integer n : list) System.out.print(n + " ");
            System.out.println();
        } else {
            System.out.println("Gemini don't found");
        }

    }
}
