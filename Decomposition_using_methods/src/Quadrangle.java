import static java.lang.Math.*;
//Даны числа X, Y, Z, Т — длины сторон четырехугольника.
//Написать метод(методы) вычисления его площади, если угол между сторонами длиной X и Y— прямой.

public class Quadrangle {
    private static double side_x = 2;
    private static double side_y = 4;
    private static double side_z = 3.5;
    private static double side_t = 1;

    public static void main(String[] args) {
        System.out.println(getArea());
    }

    private static double getArea() {
        double areaOfQuadrangle;
        double hypotenuse = sqrt(pow(side_x, 2) + pow(side_y, 2));
        double areaRightTriangle = (side_x * side_y) / 2;
        double half_meter = (hypotenuse + side_t + side_z) / 2;
        double areaSecondTriangle = sqrt(half_meter * (half_meter - side_t) *
                (half_meter - side_z) * (half_meter - hypotenuse));
        areaOfQuadrangle = areaRightTriangle + areaSecondTriangle;
        return areaOfQuadrangle;
    }
}
