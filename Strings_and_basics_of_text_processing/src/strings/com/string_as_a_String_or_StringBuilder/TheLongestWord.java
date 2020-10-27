package strings.com.string_as_a_String_or_StringBuilder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Вводится строка слов, разделенных пробелами. Найти самое длинное слово и вывести его на экран.
//Случай, когда самых длинных слов может быть несколько, не обрабатывать.

public class TheLongestWord {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter string:");
        String str = reader.readLine();
        System.out.println(getTheLongestWord(str));
    }

    private static String getTheLongestWord(String str) {
        String[] words = str.split(" ");
        String longestWord = words[0];
        for (int i = 1; i < words.length; i++) {
            if(words[i].length() > longestWord.length())
                longestWord = words[i];
        }
        return longestWord;
    }
}
