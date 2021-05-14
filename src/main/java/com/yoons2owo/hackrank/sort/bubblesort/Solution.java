package com.yoons2owo.hackrank.sort.bubblesort;

import java.util.List;

class Result {

    public static void countSwaps(List<Integer> a) {
        int swap = 0;
        for (int i = 0; i < a.size() - 1; i++) {
            boolean swaped = false;
            for (int j = 0; j < a.size() - 1 - i; j++) {
                if (a.get(j) > a.get(j + 1)) {
                    int temp = a.get(j);
                    a.set(j, a.get(j + 1));
                    a.set(j + 1, temp);
                    swap++;
                    swaped = true;
                }
            }
            if (!swaped) break;
        }
        System.out.printf("Array is sorted in %s swaps.\n", swap);
        System.out.println("First Element: " + a.get(0));
        System.out.println("Last Element: " + a.get(a.size() - 1));
    }
}

public class Solution {

}
