package strings.com.string_as_a_String_or_StringBuilder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Строка X состоит из нескольких предложений, каждое из которых кончается точкой,
//восклицательным или вопросительным знаком.
//Определить количество предложений в строке X.

public class QuantityOfSentences {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter string:");
        String str = reader.readLine();
        System.out.println(getQuantitySentences(str));
    }

    private static int getQuantitySentences(String str) {
        String pattern = "[.?!]";
        String[]sentences = str.split(pattern);
        return sentences.length;
    }
}
