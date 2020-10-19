//Даны действительные числа а1 ,а2 ,..., аn.
//Найти max(a1 + a2n, a2 + a2n-1,..., an + an+1)

public class MaxSum {
    public static double[] array = {1, 4, 8, 3.3, -3, 5.6, 0, 2.1, 10, 4.2, 9, 1.2, 21, -2.5};

    public static void main(String[] args) {
        System.out.println(getMaxSum());
    }

    private static double getMaxSum () {
        double maxSum = array[0] + array[array.length - 1];
        int partOfLength = array.length / 2;
        for (int i = 1; i <= partOfLength; ) {
            for (int j = array.length - 2; j > i; j--) {
                if((array[i] + array[j]) > maxSum)
                    maxSum = array[i] + array[j];
                i++;
            }
        }
        return maxSum;
    }
}
