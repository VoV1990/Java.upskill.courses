import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Написать метод(методы), проверяющий, являются ли данные три числа взаимно простыми.

public class PrimeNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter three numbers:");
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        isMutuallyPrimeNum(a, b, c);
    }

    private static void isMutuallyPrimeNum(int a, int b, int c) {
        int first = getNOD(a, b);
        int second = getNOD(b, c);
        int third = getNOD(a, c);
        if(first == 1 && second == 1 && third == 1)
            System.out.println("These are mutually prime numbers");
        else
            System.out.println("These are not mutually prime numbers");
    }

    private static int getNOD(int a, int b) {
        int nod = 0;
        if (a == 0 && b > 0) return b;
        else if(b == 0 && a > 0) return a;
        else if(a == b) return a;

        while (b != 0 && a != 0) {
            if (a > b) a %= b;
            else b %= a;

            nod = a + b;
        }
        return nod;
    }
}
