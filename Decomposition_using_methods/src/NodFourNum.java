import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Написать метод(методы) для нахождения наибольшего общего делителя четырех натуральных чисел.

public class NodFourNum {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter four numbers:");
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int d = Integer.parseInt(reader.readLine());
        System.out.println("The greatest common divisor: " + getNOD(a, b, c, d));
    }

    private static int getNOD(int a, int b, int c, int d) {
        int nodFirst = calculateNod(a, b);
        int nodSecond = calculateNod(c, d);
        return calculateNod(nodFirst, nodSecond);
    }

    private static int calculateNod(int a, int b) {
        int nod = 0;
        if (a == 0 && b > 0) return b;
        else if(b == 0 && a > 0) return a;
        else if(a == b) return a;

        while (b != 0 && a != 0) {
            if (a > b) {
                a %= b;
            } else {
                b %= a;
            }
            nod = a + b;
        }
        return nod;
    }
}
