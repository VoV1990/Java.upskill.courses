import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

//Даны два числа. Определить цифры, входящие в запись как первого так и второго числа.

public class SimilarDigits {
    static {
        System.out.println("Please enter the two numbers: ");
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int firstNum = Integer.parseInt(reader.readLine());
        int secondNum = Integer.parseInt(reader.readLine());
        getSimilarDigits(firstNum, secondNum);
    }

    private static void getSimilarDigits(int firstNum, int secondNum) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        Set<Integer> set = new TreeSet<>();
        int a;
        int b;
        while (firstNum > 0) {
            a = firstNum % 10;
            list1.add(a);
            firstNum /= 10;
        }
        while (secondNum > 0) {
            b = secondNum % 10;
            list2.add(b);
            secondNum /= 10;
        }
        for(Integer i : list1) {
            for (Integer j : list2) {
                if(i.equals(j)) {
                    set.add(i);
                }
            }
        }
        printSimilarDigits(set);
    }

    private static void printSimilarDigits(Set<Integer> set) {
        for (Integer i : set)
            System.out.print(i + " ");
    }
}
