package com.yoons2owo.hackrank.dp.maxarraysum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

    static int maxSubsetSum(int[] arr) {
        int length = arr.length;
        arr[0] = Math.max(0, arr[0]);
        arr[1] = Math.max(arr[0], arr[1]);
        for (int i = 2; i < length; i++) {
            int a = arr[i-1];
            int b = arr[i] + arr[i-2];
            arr[i] = Math.max(a, b);
        }
        return arr[length - 1];
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int[] arr = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }
        System.out.println(maxSubsetSum(arr));
    }
}
