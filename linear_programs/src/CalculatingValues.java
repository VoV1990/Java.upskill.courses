import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CalculatingValues {
    static {
        System.out.println("Please enter three numbers: ");
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double a = Double.parseDouble(reader.readLine());
        double b = Double.parseDouble(reader.readLine());
        double c = Double.parseDouble(reader.readLine());
        boolean flag = checkingValues(a, b, c);
        double result;
        if(flag) {
            result = getValue(a, b, c);
            System.out.println("Result: " + result);
        } else {
            System.out.println("You entered incorrect values");
        }
    }
    private static boolean checkingValues (double a, double b, double c) {
        boolean flag = false;
        if (Double.isNaN(a) || Double.isNaN(b) || Double.isNaN(c)) {
            return flag;
        } else {
            flag = true;
        }
        return flag;
    }

    private static double getValue(double a, double b, double c) {
        double result;
        result = ((b + Math.sqrt((b * b) + (4 * a * c))) / 2 * a) - Math.pow(a, 3) * c + Math.pow(b, -2);
        return result;
    }
}
