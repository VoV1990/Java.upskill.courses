package strings.com.string_as_a_String_or_StringBuilder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Вводится строка. Требуется удалить из нее повторяющиеся символы и все пробелы.
//Например, если было введено "abc cde def", то должно быть выведено "abcdef".

public class NonRepeating {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter string:");
        String str = reader.readLine();
        System.out.println(getWithoutDuplicates(str));
    }

    private static String getWithoutDuplicates(String str) {
        HashSet<Character> set = new LinkedHashSet<>();
        StringBuilder builder = new StringBuilder();
        Pattern pattern = Pattern.compile("\\s+");
        Matcher matcher = pattern.matcher(str);
        str = matcher.replaceAll("");
        char[] letters = str.toCharArray();
        for (Character c : letters) {
            set.add(c);
        }
        for (Character c : set) {
            builder.append(c);
        }
        return builder.toString();
    }
}
