package strings.com.string_as_an_array;

//В строке найти количество чисел.

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class QuantityOfNum {
    public static void main(String[] args) {
        String numString = "0Num456str100ng6World356";
        System.out.println(getQuantityOfNum(numString));
    }

    private static int getQuantityOfNum(String digitString) {
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(digitString);
        int count = 0;
        while (matcher.find()) count++;
        return count;
    }
}
