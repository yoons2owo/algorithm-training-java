package com.yoons2owo.hackrank.sort.markandtoys;

import java.util.Arrays;
import java.util.List;

class Result {
    public static int maximumToys(List<Integer> prices, int k) {
        int result = 0;
        Integer[] array = prices.toArray(new Integer[prices.size()]);

        Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {
            if (k > array[i]) {
                k -= array[i];
                result++;
            } else {
                break;
            }
        }
        return result;
    }
}

public class Solution {
    public static void main(String[] args) {

    }
}
