//Дана последовательность целых чисел а1 ,а2 ,..., аn.
//Образовать новую последовательность, выбросив из исходной те члены, которые равны min(а1 ,а2 ,..., аn).

public class NewSequence {
    public static int[] array = {2, -7, 8, 15, 100, 0, 41, -5, 98, -9, 4, 18, 3, 23, -9};

    public static void main(String[] args) {
        System.out.println("Before changes: ");
        for (Integer n : array) System.out.print(n + " ");
        System.out.println();
        getNewSequence();
    }

    private static void getNewSequence() {
        int[] newArray;
        int min = array[0];
        int count = 0;
        for(int i = 1; i < array.length; i++) {
            if(array[i] < min) {
                min = array[i];
                count++;
            }
        }
        newArray = new int[array.length - count];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] != min) {
                newArray[index] = array[i];
                index++;
            }
        }
        System.out.println("After changes: ");
        for (Integer n : newArray) System.out.print(n + " ");
    }
}