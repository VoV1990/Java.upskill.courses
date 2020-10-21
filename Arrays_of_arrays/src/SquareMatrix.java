import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Сформировать квадратную матрицу порядка n по заданному образцу(n - четное)
//1  2   3  ... n
//n n-1 n-2 ... 1

public class SquareMatrix {
    static {
        System.out.println("Please enter even number:");
    }

    public static int[][] array;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());

        initializeArray(n);
        printArray();
    }

    private static void initializeArray(int n) {
        array = new int[n][n];
        for (int i = 1; i <= n; i++) {
            if(i % 2 == 0)
                for (int j = 0; j < n; j++) {
                    array[i-1][j] = n - j;
                }
            else
                for (int j = 0; j < n; j++) {
                    array[i-1][j] = j + 1;
                }
        }
    }

    private static void printArray() {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}