package strings.com.string_as_a_String_or_StringBuilder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Проверить, является ли заданное слово палиндромом.

public class Palindrome {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter string:");
        String str = reader.readLine();
        System.out.println(isPalindrome(str));
    }

    private static boolean isPalindrome(String str) {
        StringBuilder builder = new StringBuilder(str);
        builder.reverse();

        return builder.toString().equals(str);
    }
}
