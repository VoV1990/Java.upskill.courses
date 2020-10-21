import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import static java.lang.Math.*;

//Сформировать квадратную матрицу порядка N по правилу:
//A[i,j]=sin(j^2-j^2/N)
// и подсчитать количество положительных элементов в ней.

public class SquareMatrixFour {
    static {
        System.out.println("Please enter number:");
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
        int positive = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = (int) sin(((i * i) - (j * j)) / n);
                if(array[i][j] > 0)
                    positive++;
            }
        }
        System.out.println("Number of positive: " + positive);
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
