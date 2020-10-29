import static java.lang.Math.*;
//Даны числа X, Y, Z, Т — длины сторон четырехугольника.
//Написать метод(методы) вычисления его площади, если угол между сторонами длиной X и Y— прямой.

public class Quadrangle {
    private static double side_x = 2;
    private static double side_y = 4;
    private static double side_z = 3.5;
    private static double side_t = 1;

    public static void main(String[] args) {
        System.out.println(getAreaOfQuadrangle(side_x, side_y, side_z, side_t));
    }

    private static double getAreaOfQuadrangle(double x, double y, double z, double t) {
        double hypotenuse = calculateHypotenuse(x, y);
        double areaRightTriangle = (x * y) / 2;
        double half_meter = calculateHalfMeter(hypotenuse, t, z);
        double areaSecondTriangle = calculateAreaOfTriangle(half_meter, hypotenuse, t, z);

        return areaRightTriangle + areaSecondTriangle;
    }

    private static double calculateHypotenuse(double x, double y) {
        return sqrt(pow(x, 2) + pow(y, 2));
    }

    private static double calculateHalfMeter(double hypotenuse, double t, double z) {
        return (hypotenuse + side_t + side_z) / 2;
    }

    private static double calculateAreaOfTriangle(double half_meter, double hypotenuse, double t, double z) {
        return sqrt(half_meter * (half_meter - t) *
                (half_meter - z) * (half_meter - hypotenuse));
    }
}
