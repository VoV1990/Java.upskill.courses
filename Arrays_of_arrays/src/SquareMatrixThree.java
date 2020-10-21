/*Сформировать квадратную матрицу порядка n по заданному образцу(n - четное)
1 1 1 ... 1 1 1
0 1 1 ... 1 1 0
0 0 1 ... 1 0 0
. . . ... . . .
0 1 1 ... 1 1 0
1 1 1 ... 1 1 1*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SquareMatrixThree {
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
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(n - i == n || i + 1 == n)
                    array[i][j] = 1;
                else if (j < i && j < n - (i + 1) || (j > i && j >= n - i))
                    array[i][j] = 0;
                else
                    array[i][j] = 1;
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