package strings.com.string_as_a_String_or_StringBuilder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Посчитать количество строчных (маленьких) и прописных (больших) букв в введенной строке.
//Учитывать только английские буквы.

public class QuantityLetters {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter string:");
        String str = reader.readLine();
        getQuantityLetters(str);
    }

    private static void getQuantityLetters(String str) {
        Pattern patternLowerCase = Pattern.compile("[a-z]");
        Pattern patternUpperCase = Pattern.compile("[A-Z]");
        System.out.println("Quantity of letters in lower case: " + getQuantity(str, patternLowerCase));
        System.out.println("Quantity of letters in upper case: " + getQuantity(str, patternUpperCase));
    }

    private static int getQuantity(String str, Pattern pattern) {
        Matcher matcher = pattern.matcher(str);
        int count = 0;
        while (matcher.find()) count++;
        return count;
    }
}
