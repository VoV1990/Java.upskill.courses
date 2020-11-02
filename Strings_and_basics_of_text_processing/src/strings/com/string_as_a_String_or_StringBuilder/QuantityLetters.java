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
        Matcher matcherLower = patternLowerCase.matcher(str);
        Matcher matcherUpper = patternUpperCase.matcher(str);
        int countOfLower = 0;
        int countOfUpper = 0;
        while (matcherLower.find()) countOfLower++;
        while (matcherUpper.find()) countOfUpper++;

        System.out.println("Quantity of letters in lower case: " + countOfLower);
        System.out.println("Quantity of letters in upper case: " + countOfUpper);
    }
}
