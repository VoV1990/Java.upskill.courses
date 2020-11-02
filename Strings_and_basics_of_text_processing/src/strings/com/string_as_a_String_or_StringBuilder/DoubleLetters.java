package strings.com.string_as_a_String_or_StringBuilder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Из заданной строки получить новую, повторив каждый символ дважды.

public class DoubleLetters {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter string:");
        String str = reader.readLine();
        System.out.println(toDoubleLetters(str));
    }

    private static String toDoubleLetters(String str) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < str.length(); i ++) {
            builder.append(str.charAt(i)).append(str.charAt(i));
        }
        return builder.toString();
    }
}
