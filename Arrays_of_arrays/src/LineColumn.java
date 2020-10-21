import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Дана матрица. Вывести k-ю строку и p-й столбец матрицы.

public class LineColumn {
    static {
        System.out.println("Please enter two numbers (line and column):");
    }

    public static int[][] array;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int line = Integer.parseInt(reader.readLine());
        int column = Integer.parseInt(reader.readLine());

        initializeArray(line, column);
        printLineAndColumn(line, column);
    }

    private static void initializeArray(int line, int column) {
        array = new int[line + 2][column + 2];
        int k = 10;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                array[i][j] = k;
                k++;
            }
        }
    }

    private static void printLineAndColumn(int line, int column) {
        System.out.println("Line number " + line + ":");
        for (int i = line - 1; ; ) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
            break;
        }

        System.out.println("Column number " + column + ":");
        for (int j = column - 1; ; ) {
            for (int i = 0; i < array.length; i++) {
                System.out.println(array[i][j]);
            }
            break;
        }
    }
}
