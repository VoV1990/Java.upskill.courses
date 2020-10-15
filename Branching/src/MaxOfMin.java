import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MaxOfMin {
    static {
        System.out.println("Please enter four numbers: ");
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int d = Integer.parseInt(reader.readLine());
        System.out.println("Maximal value of the minimum values: " + getMaximalValue(a, b, c, d));
    }

    private static int getMaximalValue(int a, int b, int c, int d) {
        int min1 = (a < b) ? a : b;
        int min2 = (c < d) ? c : d;
        return (min1 > min2) ? min1 : min2;
    }
}
