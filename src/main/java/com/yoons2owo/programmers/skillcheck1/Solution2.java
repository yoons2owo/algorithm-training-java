package com.yoons2owo.programmers.skillcheck1;

import java.util.Arrays;

public class Solution2 {

    public int[] solution(int[] array, int[][] commands) {
        int[] answer = {};
        answer = new int[commands.length];

        for (int i = 0; i < commands.length; i++) {
            int[] temp = new int[commands[i][1] - commands[i][0] + 1];
            int count = 0;
            for (int j = commands[i][0] - 1; j < commands[i][1]; j++) {
                temp[count] = array[j];
                count++;
            }
            Arrays.sort(temp);
            answer[i] = temp[commands[i][2] - 1];
        }

        return answer;
    }
}
