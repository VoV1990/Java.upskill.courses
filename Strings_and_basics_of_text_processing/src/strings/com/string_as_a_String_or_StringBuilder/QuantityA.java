package strings.com.string_as_a_String_or_StringBuilder;

//Подсчитать, сколько раз среди символов заданной строки встречается буква “а”.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Подсчитать, сколько раз среди символов заданной строки встречается буква “а”.

public class QuantityA {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter string:");
        String str = reader.readLine();
        System.out.println(getQuantityA(str));
    }

    private static int getQuantityA(String str) {
        char[] letters = str.toCharArray();
        int count = 0;
        for (Character c : letters) {
            if(c.equals('a')) count++;
        }
        return count;
    }
}
