//Составить программу нахождения произведения квадратов первых двухсот чисел.

import java.math.BigInteger;

public class Multiplication {
    public static void main(String[] args) {
        System.out.println(getMultiplication());
    }

    private static BigInteger getMultiplication() {
        BigInteger result = new BigInteger("1");
        BigInteger b;
        long square;
        for (int i = 1; i <= 200; i++) {
            square = i * i;
            b = BigInteger.valueOf(square);
            result = result.multiply(b);
        }
        return result;
    }
}
