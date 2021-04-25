package com.yoons2owo.baekjoon.array.나머지;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] input = new int[10];
        for (int i = 0; i < 10; i++) {
            input[i] = Integer.parseInt(br.readLine());
        }
        for (int i= 0; i < input.length; i++) {
            input[i] = input[i] % 42;
        }
        System.out.println(Arrays.stream(input).distinct().count());

    }
}
