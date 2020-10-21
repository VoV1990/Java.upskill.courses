import java.util.Random;

//Матрицу 10x20 заполнить случайными числами от 0 до 15.
//Вывести на экран саму матрицу и номера строк, в которых число 5 встречается три и более раз.

public class RandomMatrix {
    public static int[][] array;

    public static void main(String[] args) {
        Random random = new Random();
        initializeArray(random);
        printArray();
    }

    private static void initializeArray(Random random) {
        array = new int[10][20];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                array[i][j] = random.nextInt(16);
            }
        }
    }

    private static void printArray() {
        StringBuilder builder = new StringBuilder("The number 5 occurs three or more times in strings: ");
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if(array[i][j] == 5) count++;
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
            if(count >= 3) builder.append(i + 1).append("; ");
            count = 0;
        }
        System.out.println(builder);
    }
}
