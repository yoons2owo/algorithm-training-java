package com.yoons2owo.baekjoon.array.숫자의개수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int input = 1;
        for (int i = 0; i < 3; i++) {
            input = input * Integer.parseInt(br.readLine());
        }

        String[] array = Integer.toString(input).split("");
        for (int i = 0; i < 10; i++) {
            int cnt = i;
            System.out.println(Arrays.stream(array).filter(e -> e.equals(Integer.toString(cnt))).count());
        }
    }
}
