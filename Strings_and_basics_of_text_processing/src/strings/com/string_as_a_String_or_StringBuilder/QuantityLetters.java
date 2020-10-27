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
        Pattern pattern1 = Pattern.compile("[a-z]");
        Pattern pattern2 = Pattern.compile("[A-Z]");
        int countOfLower = 0;
        int countOfUpper = 0;
        char[] letters = str.toCharArray();
        for (Character c : letters) {
            String letter = Character.toString(c);
            Matcher matcher1 = pattern1.matcher(letter);
            Matcher matcher2 = pattern2.matcher(letter);
            if(matcher1.matches())
                countOfLower++;
            else if(matcher2.matches())
                countOfUpper++;
        }
        System.out.println("Quantity of letters in lower case: " + countOfLower);
        System.out.println("Quantity of letters in upper case: " + countOfUpper);
    }
}
