import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Hole {
    private static int heightOfHole = 5;
    private static int widthOfHole = 10;

    static {
        System.out.println("Please enter dimensions of the brick: ");
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        Brick brick = new Brick(a, b, c);
        isHoleForBrick(brick);
    }

    private static void isHoleForBrick (Brick brick) {
        boolean flag = false;
        if (brick.height < heightOfHole && brick.width < widthOfHole) {
            flag = true;
        } else if (brick.width < heightOfHole && brick.height < widthOfHole) {
            flag = true;
        } else if (brick.depth < heightOfHole && brick.height < widthOfHole) {
            flag = true;
        } else if (brick.height < heightOfHole && brick.depth < widthOfHole) {
            flag = true;
        } else if (brick.depth < heightOfHole && brick.width < widthOfHole) {
            flag = true;
        } else if (brick.width < heightOfHole && brick.depth < widthOfHole) {
            flag = true;
        }
        printResult(flag);
    }

    private static void printResult (boolean flag) {
        if (flag) {
            System.out.println("Brick climbed");
        } else {
            System.out.println("The brick did not fit");
        }
    }

    static class Brick {
        public int height;
        public int width;
        public int depth;

        public Brick(int height, int width, int depth) {
            this.height = height;
            this.width = width;
            this.depth = depth;
        }
    }
}
