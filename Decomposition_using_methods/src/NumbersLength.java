import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Написать метод(методы), определяющий, в каком из данных двух чисел больше цифр.

public class NumbersLength {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter the number: ");
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        getMostLength(a, b);
    }

    private static void getMostLength(int a, int b) {
        String str1 = Integer.toString(a);
        String str2 = Integer.toString(b);
        int len1 = str1.length();
        int len2 = str2.length();

        if(len1 > len2) System.out.println("The first number has more digits");
        else if(len2 > len1) System.out.println("The second number has more digits");
        else System.out.println("The number of digits in the numbers is the same");
    }
}
