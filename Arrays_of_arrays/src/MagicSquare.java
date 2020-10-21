import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Магическим квадратом порядка n называется квадратная матрица размера nxn,
//составленная из чисел 1, 2, 3, ..., так, что суммы по каждому столбцу,
//каждой строке и каждой из двух больших диагоналей равны между собой. Построить такой квадрат.

public class MagicSquare {
    static {
        System.out.println("Please enter odd number greater than 1:");
    }

    public static int[][] magicSquare;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());

        initializeArray(n);
        printArray();
    }

    private static void initializeArray(int n) {
        magicSquare = new int[n][n];

        int number = 1;
        int row = 0;
        int column = n / 2;
        int curr_row;
        int curr_col;
        while (number <= n * n) {
            magicSquare[row][column] = number;
            number++;
            curr_row = row;
            curr_col = column;
            row -= 1;
            column += 1;
            if (row == -1) {
                row = n - 1;
            }
            if (column == n) {
                column = 0;
            }
            if (magicSquare[row][column] != 0) {
                row = curr_row + 1;
                column = curr_col;
                if (row == -1) {
                    row = n - 1;
                }
            }
        }
    }

    private static void printArray() {
        for (int i = 0; i < magicSquare.length; i++) {
            for (int j = 0; j < magicSquare[0].length; j++) {
                System.out.print(magicSquare[i][j] + " ");
            }
            System.out.println();
        }
    }
}
