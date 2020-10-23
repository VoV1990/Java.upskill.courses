//Даны числа X, Y, Z, Т — длины сторон четырехугольника.
//Написать метод(методы) вычисления его площади, если угол между сторонами длиной X и Y— прямой.

public class Quadrangle {
    private static int side_x = 2;
    private static int side_y = 4;
    private static int side_z = 2;
    private static int side_t = 4;

    public static void main(String[] args) {
        System.out.println("Area of Quadrangle is: " + side_x * side_y);
    }
}
