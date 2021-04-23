package com.yoons2owo.baekjoon.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 최소최대 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());
        int[] array = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        int max = Arrays.stream(array).max().getAsInt();
        int min = Arrays.stream(array).min().getAsInt();

        System.out.println(min + " " + max);
    }
}
