//Для каждого натурального числа в промежутке от m до n вывести все делители,
// кроме единицы и самого числа. m и n вводятся с клавиатуры.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Dividers {
    static {
        System.out.println("Please enter the two natural numbers: ");
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(reader.readLine());
        int n = Integer.parseInt(reader.readLine());
        if(m < 1 || n < m)
            System.out.println("You entered incorrect number");
        else
            getDividers(m, n);
    }

    private static void getDividers(int m, int n) {
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = m; i < n; i++) {
            for (int j = 2; j < i; j++) {
                if(i % j == 0) {
                    stringBuilder.append(j).append(" ");
                }
            }
            if (stringBuilder.length() != 0) {
                System.out.println(i + ": " + stringBuilder);
                stringBuilder = new StringBuilder();
            } else {
                System.out.println(i + " has no dividers other than 1 and itself");
            }
        }
    }
}
