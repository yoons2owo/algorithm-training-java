package com.yoons2owo.programmers.sort.가장큰수;

import java.util.Arrays;
import java.util.Comparator;

public class Solution {
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.solution(new int[]{6, 0, 10, 2}));
    }

    public String solution(int[] numbers) {
        String answer = "";
        String[] arr = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            arr[i] = String.valueOf(numbers[i]);
        }
        Arrays.sort(arr, (o1, o2) -> (o2 + o1).compareTo(o1 + o2));

        if (arr[0].equals("0")) {
            return "0";
        }

        for (int i = 0; i < arr.length; i++) {
            answer += arr[i];
        }
        return answer;
    }
}
