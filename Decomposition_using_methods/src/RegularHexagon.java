import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import static java.lang.Math.*;

//Вычислить площадь правильного шестиугольника со стороной а,
//используя метод вычисления площади треугольника.

public class RegularHexagon {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter the number greater than 0:");
        double side = Double.parseDouble(reader.readLine());
        System.out.println("Area of Hexagon: " + getAreaOfHexagon(side));
    }

    private static double getAreaOfHexagon(double side) {
        double cornerBase = toRadians(30);
        double cornerTop = toRadians(120);
        double cornerEquilateral = toRadians(60);
        double baseOfTriangle = calculateBaseOfTriangle(side, cornerBase);
        double areaIsoscelesTriangle = calculateAreaIsoscelesTriangle(side, cornerTop);
        double areaEquilateralTriangle = calculateAreaEquilateralTriangle(baseOfTriangle, cornerEquilateral);

        return (areaIsoscelesTriangle * 3) + areaEquilateralTriangle;
    }

    private static double calculateBaseOfTriangle(double side, double cornerBase) {
        return 2 * side * cos(cornerBase);
    }

    private static double calculateAreaIsoscelesTriangle(double side, double cornerTop) {
        return (1.0 / 2.0) * pow(side, 2) * sin(cornerTop);
    }

    private static double calculateAreaEquilateralTriangle(double baseOfTriangle, double equilateral) {
        return (1.0 / 2.0) * pow(baseOfTriangle, 2) * sin(equilateral);
    }
}
