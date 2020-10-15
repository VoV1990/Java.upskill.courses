import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они расположены на одной прямой.

public class StraightLine {
    static {
        System.out.println("Please enter 3 pairs of coordinates, x then y: ");
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int x1 = Integer.parseInt(reader.readLine());
        int y1 = Integer.parseInt(reader.readLine());
        int x2 = Integer.parseInt(reader.readLine());
        int y2 = Integer.parseInt(reader.readLine());
        int x3 = Integer.parseInt(reader.readLine());
        int y3 = Integer.parseInt(reader.readLine());
        isLine(x1, y1, x2, y2, x3, y3);
    }

    private static void isLine(int x1, int y1, int x2, int y2, int x3, int y3) {
        String line = "It's a straight line!";
        if ((x1 == x2 && x2 == x3) && (y1 != y2 && y1 != y3))
            System.out.println(line);
        else if ((y1 == y2 && y2 == y3) && (x1 != x2 && x1 != x3))
            System.out.println(line);
        else if ((x3 - x1) / (x2 - x1) == (y3 - y1) / (y2 - y1))
            System.out.println(line);
        else
            System.out.println("It's not a line!");
    }
}

