package com.yoons2owo.programmers.skillcheck1.x만큼간격이있는n개의숫자;

import java.util.Arrays;

class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.mySolution(2, 5)));
        System.out.println(Arrays.toString(solution.anotherSolution(2, 5)));
        System.out.println(Arrays.toString(solution.anotherSolution(-4, 2)));
        System.out.println(Arrays.toString(solution.anotherSolution(-4, 2)));
    }

    public long[] mySolution(int x, int n) {
        long[] answer = {};
        answer = new long[n];

        long temp = x;
        for (int i = 0; i < n; i++) {
            answer[i] = temp;
            temp += x;
        }

        return answer;
    }

    public long[] anotherSolution(int x, int n) {
        long[] answer = new long[n];
        answer[0] = x;

        for (int i = 1; i < n; i++) {
            answer[i] = answer[i - 1] + x;
        }

        return answer;
    }
}
