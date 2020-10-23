import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import static java.lang.Math.*;

//На плоскости заданы своими координатами n точек. Написать метод(методы),
//определяющие, между какими из пар точек самое большое расстояние.
//Указание. Координаты точек занести в массив.

public class CoordinateDistance {
    public static void main(String[] args) throws IOException {
        double [] coordinates = initializeCoordinates();
        calculateDistance(coordinates);
    }

    private static double[] initializeCoordinates() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double [] array = new double[6];
        int index = 0;
        for (int i = 0; i < 3; i++) {
            System.out.println("Please enter pair of coordinates x than y:");
            double x = Double.parseDouble(reader.readLine());
            double y = Double.parseDouble(reader.readLine());
            array[index] = x;
            index++;
            array[index] = y;
            index++;
        }
        return array;
    }

    private static void calculateDistance(double[] coordinates) {
        double x1 = coordinates[0];
        double y1 = coordinates[1];
        double x2 = coordinates[2];
        double y2 = coordinates[3];
        double x3 = coordinates[4];
        double y3 = coordinates[5];
        double distance1 = sqrt(pow((x2 - x1), 2) + (pow((y2 - y1), 2)));
        double distance2 = sqrt(pow((x3 - x2), 2) + (pow((y3 - y2), 2)));
        double distance3 = sqrt(pow((x3 - x1), 2) + (pow((y3 - y1), 2)));
        getMaxDistance(distance1, distance2, distance3);
    }

    private static void getMaxDistance(double distance1, double distance2, double distance3) {
        if(distance1 == distance2 && distance2 == distance3)
            System.out.println("The distances are equal");
        else if(distance1 >= distance2 && distance1 >= distance3)
            System.out.println("The max distance between first and second coordinates");
        else if(distance2 >= distance1 && distance2 >= distance3)
            System.out.println("The max distance between second and third coordinates");
        else if(distance3 >= distance1 && distance3 >= distance2)
            System.out.println("The max distance between first and third coordinates");
    }
}
