package strings.com.string_as_a_String_or_StringBuilder;

//Дан текст (строка). Найдите наибольшее количество подряд идущих пробелов в нем.

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class QuantityOfWhitespaces {
    public static void main(String[] args) {
        String whitespace = " Hello  white    rabbit   !        ";
        System.out.println(getQuantityOfWhitespaces(whitespace));
    }

    private static int getQuantityOfWhitespaces(String whitespace) {
        Pattern pattern = Pattern.compile("(\\s+)");
        Matcher matcher = pattern.matcher(whitespace);
        int max = 0;
        while (matcher.find()) {
            for (int i = 0; i < matcher.groupCount(); i++) {
                if (matcher.group(i).length() > max)
                    max = matcher.group(i).length();
            }
        }
        return max;
    }
}
