import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Triangle {
    static {
        System.out.println("Please enter two corners of a triangle: ");
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        inspectionOfTriangle(a, b);
    }

    private static void inspectionOfTriangle (int a, int b) {
        if((a + b) < 180) {
            System.out.println("Triangle exist");
            rectangularTriangle(a, b);
        }
        else
            System.out.println("Triangle doesn't exist");
    }

    private static void rectangularTriangle(int a, int b) {
        if(a == 90 || b == 90 || (a + b) == 90)
            System.out.println("Triangle is rectangular");
        else
            System.out.println("Triangle is not rectangular");
    }
}
