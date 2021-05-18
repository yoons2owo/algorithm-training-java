package com.yoons2owo.programmers.kakaointern2020.키패드누르기;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Solution sol = new Solution();
        System.out.println(sol.solution(new int[]{1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5}, "right"));
    }

    public static final String LEFT = "L";
    public static final String RIGHT = "R";

    public String solution(int[] numbers, String hand) {
        String answer = "";
        int lh = 10;
        int rh = 12;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] != 0 && numbers[i] % 3 == 1) { // 1, 4, 7
                lh = numbers[i];
                answer += "L";
                continue;
            }
            if (numbers[i] != 0 && numbers[i] % 3 == 0) { // 3, 6, 9
                rh = numbers[i];
                answer += "R";
                continue;
            }

            int ld = getDistance(lh, numbers[i]);
            int rd = getDistance(rh, numbers[i]);
            if (ld == rd) {
                if ("left".equals(hand)) {
                    lh = numbers[i];
                    answer += LEFT;
                } else if ("right".equals(hand)) {
                    rh = numbers[i];
                    answer += RIGHT;
                }
            } else if (ld < rd) {
                lh = numbers[i];
                answer += LEFT;
            } else if (ld > rd) {
                rh = numbers[i];
                answer += RIGHT;
            }
        }
        return answer;
    }

    public static int getDistance(int current, int number) {
        if (number == 0) number = 11;
        if (current == 0) current = 11;

        int x = (current - 1) / 3;
        int y = (current - 1) % 3;
        int numberX = number / 3;
        int numberY = 1;

        return Math.abs(x-numberX) + Math.abs(y-numberY);
    }
}
