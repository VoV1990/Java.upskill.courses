//В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число.
//Если таких чисел несколько, то определить наименьшее из них.

import java.util.*;

public class MostCommonNumber {
    public static int[] array = {2, -7, 8, 15, 100, 0, 41, -5, 98, -9, 4, 18, 3, 23, -9, 2, 1, 1};

    public static void main(String[] args) {
        getCountOfCommon();
    }

    private static void getCountOfCommon() {
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if(array[i] == array[j])
                    count++;
            }
            map.put(array[i], count);
            count = 0;
        }
        getMinNumber(map);
    }

    private static void getMinNumber(Map<Integer, Integer> map) {
        List<Integer> list = new ArrayList<>();
        int maxValue = 0;
        int minOfMostCommon;

        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if(maxValue < entry.getValue())
                maxValue = entry.getValue();
        }
        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (maxValue == entry.getValue())
                list.add(entry.getKey());
        }
        minOfMostCommon = Collections.min(list);
        System.out.println(minOfMostCommon);
    }
}
