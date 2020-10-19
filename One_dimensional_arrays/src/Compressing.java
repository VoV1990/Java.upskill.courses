//Дан целочисленный массив с количеством элементов п.
//Сжать массив, выбросив из него каждый второй элемент (освободившиеся элементы заполнить нулями).

public class Compressing {
    public static int[] array = new int[100];

    public static void main(String[] args) {
        initializeArray();

        System.out.println("Before changes: ");
        for (Integer n : array) System.out.print(n + " ");
        System.out.println();

        compressingArray();
        System.out.println("After changes: ");
        for (Integer n : array) System.out.print(n + " ");
    }

    private static void initializeArray() {
        for (int i = 0; i < 100; i++) {
            array[i] = i + 1;
        }
    }

    private static void compressingArray() {
        int[]newArray = new int[array.length];
        int index = 0;
        for(int i = 0; i < array.length; i+=2) {
            newArray[index] = array[i];
            index++;
        }
        for (int j = index; j < newArray.length; j++) {
            newArray[j] = 0;
        }
        array = newArray;
    }
}
