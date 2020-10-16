import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Вычислить значение выражения по формуле (все переменные принимают действительные значения)

public class CalculatingValues {
    static {
        System.out.println("Please enter three numbers: ");
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double a = Double.parseDouble(reader.readLine());
        double b = Double.parseDouble(reader.readLine());
        double c = Double.parseDouble(reader.readLine());

        System.out.println("Result: " + getValue(a, b, c));
    }

    private static double getValue(double a, double b, double c) {
        double result;
        result = ((b + Math.sqrt((b * b) + (4 * a * c))) / 2 * a) - Math.pow(a, 3) * c + Math.pow(b, -2);
        return result;
    }
}
