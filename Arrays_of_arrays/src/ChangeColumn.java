import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//В числовой матрице поменять местами два столбца любых столбца,
//т. е. все элементы одного столбца поставить на соответствующие им позиции другого,
//а его элементы второго переместить в первый. Номера столбцов вводит пользователь с клавиатуры.

public class ChangeColumn {
    static {
        System.out.println("Please enter two numbers of columns:");
    }

    public static int[][] array;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());

        initializeArray(a, b);
        printArray();
    }

    private static void initializeArray(int a, int b) {
        int k = 10;
        array = new int[a+b][a+b];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                array[i][j] = k;
                k++;
            }
        }
        changeColumns(a, b);
    }

    private static void changeColumns(int a, int b) {
        int temp;
        int j = a - 1;
        for (int i = 0; i < array.length; i++) {
                temp = array[i][j];
                array[i][j] = array[i][b-1];
                array[i][b-1] = temp;
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
