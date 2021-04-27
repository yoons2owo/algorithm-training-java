package com.yoons2owo.baekjoon.array.평균;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int subjectCnt = Integer.parseInt(br.readLine());

        int[] score = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        int max = Arrays.stream(score).max().getAsInt();
        double sum = 0;
        for (int i = 0; i < score.length; i++) {
            sum += (double) score[i] / max * 100;
        }
        System.out.printf("%f", sum / subjectCnt);
    }
}
