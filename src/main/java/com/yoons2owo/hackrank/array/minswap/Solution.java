package com.yoons2owo.hackrank.array.minswap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

    static int minimumSwaps(int[] arr) {
        int swap = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != i + 1) {
                for(int j = i + 1; j < arr.length; j++) {
                    if (arr[j] == i + 1) {
                        swap(arr, i, j);
                        swap++;
                        break;
                    }
                }
            }
        }
        return swap;
    }

    private static void swap(int[] arr, int left, int right) {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        int[] arr = new int[input.length];

        for (int i = 0; i < input.length; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }

        System.out.println(minimumSwaps(arr));
    }
}
