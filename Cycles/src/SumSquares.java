//Найти сумму квадратов первых ста чисел.

public class SumSquares {
    public static void main(String[] args) {
        System.out.println(getSum());
    }
    private static long getSum() {
        long result = 0;
        for (int i = 1; i <= 100; i++) {
            result = result + (i * i);
        }
        return result;
    }
}
