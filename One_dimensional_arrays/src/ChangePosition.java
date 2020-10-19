//Даны действительные числа а1 ,а2 ,..., аn . Поменять местами наибольший и наименьший элементы.

public class ChangePosition {
    public static int[] array = {2, -7, 8, 15, 100, 0, 41, -5, 98, -9};

    public static void main(String[] args) {
        replaceNumbers();
    }

    private static void replaceNumbers() {
        int indexMin = 0;
        int indexMax = 0;
        int temp;
        for(int i = 1; i < array.length; i++) {
            if(array[i] < array[indexMin]) {
                indexMin = i;
            }
            if(array[i] > array[indexMax]) {
                indexMax = i;
            }
        }
        System.out.println("Before changes: ");
        System.out.println("indexMin: " + indexMin + ", value: " + array[indexMin]);
        System.out.println("indexMax: " + indexMax + ", value: " + array[indexMax]);

        temp = array[indexMin];
        array[indexMin] = array[indexMax];
        array[indexMax] = temp;

        System.out.println("After changes: ");
        System.out.println("indexMin: " + indexMin + ", value: " + array[indexMin]);
        System.out.println("indexMax: " + indexMax + ", value: " + array[indexMax]);
    }
}
