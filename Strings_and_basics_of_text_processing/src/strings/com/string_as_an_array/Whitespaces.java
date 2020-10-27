package strings.com.string_as_an_array;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Удалить в строке все лишние пробелы,
//то есть серии подряд идущих пробелов заменить на одиночные пробелы.
//Крайние пробелы в строке удалить.

public class Whitespaces {
    public static void main(String[] args) {
        String whitespace = " Hello white   rabbit! ";
        System.out.println(deleteWhitespaces(whitespace));
    }

    private static String deleteWhitespaces(String whitespace) {
        Pattern pattern = Pattern.compile("\\s+");
        Matcher matcher = pattern.matcher(whitespace);
        whitespace = matcher.replaceAll(" ");
        return whitespace.trim();
    }
}
