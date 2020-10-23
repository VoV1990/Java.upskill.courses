import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Написать метод(методы) для нахождения наибольшего общего делителя
//и наименьшего общего кратного двух натуральных чисел:
//НОК(А,В) = А*В/НОД(А,В)

public class NokNod {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter two numbers:");
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int nod = getNOD(a, b);
        System.out.println("The greatest common divisor: " + nod);
        System.out.println("Smallest common multiple: " + getNOK(a, b, nod));
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

    private static int getNOK(int a, int b, int nod) {
        return a * b / nod;
    }
}
