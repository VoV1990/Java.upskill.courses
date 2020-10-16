import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Вычислить значение выражения по формуле (все переменные принимают действительные значения):
//(sin x + cos y / cos x - sin y) * tg xy

public class TrigonometricFunction {
    static {
        System.out.println("Please enter two values: ");
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double x = Double.parseDouble(reader.readLine());
        double y = Double.parseDouble(reader.readLine());

        System.out.println("Result: " + getValue(x, y));
    }

    private static double getValue(double x, double y) {
        double x_radians = Math.toRadians(x);
        double y_radians = Math.toRadians(x);
        double result;

        result = ((Math.sin(x_radians) + Math.cos(y_radians)) /
                (Math.cos(x_radians) - Math.sin(y_radians))) * Math.tan(x_radians * y_radians);
        return result;
    }
}
