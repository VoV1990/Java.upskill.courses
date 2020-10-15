import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Вычислить значение функции F(x) = x² - 3x + 9, если x <= 3
//F(x) = 1 / x³ + 6

public class FunctionX {
    static {
        System.out.println("Please enter x: ");
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double x = Double.parseDouble(reader.readLine());
        System.out.println(getFunctionValue(x));
    }

    private static double getFunctionValue(double x) {
        double value;
        if(x <= 3) {
            value = (x * x) - (3 * x) + 9;
        } else {
            value = 1 / ((x * x * x) + 6);
        }
        return value;
    }
}
