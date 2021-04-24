package com.yoons2owo.baekjoon.array.최댓값;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[9];
        for (int i = 0; i < 9; i++) {
            array[i] = Integer.parseInt(br.readLine());
        }

        int max = 0;
        int maxIndex = 1;
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
                maxIndex = i + 1;
            }
        }
        System.out.println(max);
        System.out.println(maxIndex);
    }
}
