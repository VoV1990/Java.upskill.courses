//Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для которых аi > i.

public class PrintNumbers {
    public static int[] array = {2, -7, 8, 15, 100, 0, 41, -5, 98, -9, 4, 0, 3};

    public static void main(String[] args) {
        printNum();
    }

    private static void printNum() {
        for (int i = 0; i < array.length; i++) {
            if(array[i] > i)
                System.out.println("а[i] = " + array[i] + " > " + "i = " + i);
        }
    }
}