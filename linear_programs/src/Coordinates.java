import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Coordinates {
    static {
        System.out.println("Please enter coordinates x then y: ");
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(reader.readLine());
        int y = Integer.parseInt(reader.readLine());
        System.out.println(validateCoordinates(x, y));
    }

    private static boolean validateCoordinates (int x, int y) {
        boolean flag = false;
        if(x >= -2 && x <= 2 && y >= 0 && y <= 4) {
            flag = true;
        } else if (x >= -4 && x <= 4 && y >= -3 && y <= 0) {
            flag = true;
        }
        return flag;
    }
}
