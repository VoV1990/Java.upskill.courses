import java.text.DecimalFormat;

//Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях).
// Поменять местами дробную и целую части числа и вывести полученное значение числа.

public class SwapParts {
    public static double num = 123.456;

    public static void main(String[] args) {
        System.out.println(getSwapNum(num));
    }

    private static String getSwapNum (double n) {
        int firstPart = (int) n;
        double secondPart = (n - firstPart) * 1000;
        double result = secondPart + (double) firstPart / 1000;
        return new DecimalFormat("#0.000").format(result);
    }
}
