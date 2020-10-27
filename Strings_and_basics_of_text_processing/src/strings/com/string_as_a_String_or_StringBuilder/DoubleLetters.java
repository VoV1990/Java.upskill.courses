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
        char[] letters = str.toCharArray();
        for (Character c : letters) {
            for (int i = 0; i < 2; i++) {
                builder.append(c);
            }
        }
        return builder.toString();
    }
}
