package com.yoons2owo.programmers.skillcheck1;

class Solution1 {

    public long[] solution(int x, int n) {
        long[] answer = {};
        answer = new long[n];

        long temp = x;
        for (int i = 0; i < n; i++) {
            answer[i] = temp;
            temp += x;
        }

        return answer;
    }
}