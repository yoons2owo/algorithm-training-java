package com.yoons2owo.baekjoon.array.OX퀴즈;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    private static final String CORRECT = "O";
    private static final String WRONG = "X";

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCaseCnt = Integer.parseInt(br.readLine());
        for (int i = 0; i < testCaseCnt; i++) {
            int score = 0;
            int count = 0;
            String[] array = br.readLine().split("");
            for (int j = 0; j < array.length; j++) {
                if (CORRECT.equals(array[j])) {
                    score += ++count;
                } else if (WRONG.equals(array[j])){
                    count = 0;
                }
            }
            System.out.println(score);
        }
    }
}
