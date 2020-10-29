import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Написать метод(методы), определяющий, в каком из данных двух чисел больше цифр.

public class NumbersLength {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter two numbers: ");
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        getMostLength(a, b);
    }

    private static void getMostLength(int a, int b) {
        int len1 = getLength(a);
        int len2 = getLength(b);

        if(len1 > len2) System.out.println("The first number has more digits");
        else if(len2 > len1) System.out.println("The second number has more digits");
        else System.out.println("The number of digits in the numbers is the same");
    }

    private static int getLength(int num) {
        int count = 0;
        while (num != 0) {
            num /= 10;
            count++;
        }
        return count;
    }
}
