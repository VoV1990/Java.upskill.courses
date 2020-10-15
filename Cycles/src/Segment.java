import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Вычислить значения функции на отрезке [а,b] c шагом h

public class Segment {
    static {
        System.out.println("Please enter the segment from a to b: ");
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        System.out.println("Enter a step: ");
        int h = Integer.parseInt(reader.readLine());
        rangeOfValues(a, b, h);
    }

    private static void rangeOfValues(int a, int b, int h) {
        while (a <= b) {
            System.out.print(a + " ");
            a += h;
        }
    }
}
