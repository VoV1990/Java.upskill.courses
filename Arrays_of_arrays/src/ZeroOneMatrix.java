import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Сформировать случайную матрицу m x n,
//состоящую из нулей и единиц, причем в каждом столбце число единиц равно номеру столбца.

public class ZeroOneMatrix {
    static {
        System.out.println("Please enter two numbers:");
    }

    public static int[][] array;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(reader.readLine());
        int n = Integer.parseInt(reader.readLine());

        initializeArray(m, n);
        printArray();
    }

    private static void initializeArray(int m, int n) {
        array = new int[m][n];
        int column = 0;
        int count;
        do {
            count = column + 1;
            for (int i = 0; i < array.length; i++) {
                    if(count > 0) {
                        array[i][column] = 1;
                        count--;
                    }
                    else array[i][column] = 0;
            }
            column++;
        } while (column < array[0].length);
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