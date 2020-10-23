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
        double cornersEquilateral = toRadians(60);
        double baseOfTriangle = 2 * side * cos(cornerBase);
        double areaIsoscelesTriangle = (1.0 / 2.0) * pow(side, 2) * sin(cornerTop);
        double areaEquilateralTriangle = (1.0 / 2.0) * pow(baseOfTriangle, 2) * sin(cornersEquilateral);

        return (areaIsoscelesTriangle * 3) + areaEquilateralTriangle;
    }
}
