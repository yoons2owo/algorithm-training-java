package com.yoons2owo.programmers.skillcheck1.K번째수;

import java.util.Arrays;

class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1},{1, 7, 3}};
        System.out.println(Arrays.toString(solution.mySolution(array, commands)));
        System.out.println(Arrays.toString(solution.anotherSolution(array, commands)));
    }

    public int[] mySolution(int[] array, int[][] commands) {
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

    public int[] anotherSolution(int[] array, int[][] commands) {

        int[] answer = new int[commands.length]; // commands의 길이에 따라 정답의 길이가 정해짐
        for (int i = 0; i < commands.length; i++) {
            int[] arr = Arrays.copyOfRange(array, commands[i][0] - 1, commands[i][1]); // i부터 j까지 배열을 생성
            Arrays.sort(arr); // 생성한 배열을 정렬해주고
            answer[i] = arr[commands[i][2] - 1]; // 정답 배열의 i 번째 인덱스에 생성한 배열의 commands의 k번째 값 을 넣어준다
        }
        return answer;

    }
}