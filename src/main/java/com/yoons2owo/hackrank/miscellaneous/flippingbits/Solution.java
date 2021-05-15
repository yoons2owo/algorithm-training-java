package com.yoons2owo.hackrank.miscellaneous.flippingbits;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Result {

    public static long flippingBits(long n) {
        String binary = Long.toBinaryString(n);
        binary = String.format("%32s", binary).replaceAll(" ", "0");
        String temp = "";
        for (int i = 0; i < binary.length(); i++) {
            if (binary.charAt(i) == '0') {
                temp += '1';
            } else if (binary.charAt(i) == '1') {
                temp += '0';
            }
        }
        return Long.parseLong(temp, 2);
    }
}

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Result.flippingBits(Long.parseLong(br.readLine()));
    }
}
