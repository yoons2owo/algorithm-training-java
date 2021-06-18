package com.yoons2owo.codility.lesson1.binarygap;

class Solution {
    public int solution(int N) {
        String binary = Integer.toBinaryString(N);
        char[] binaryChar = binary.toCharArray();

        int gap = 0;
        int temp = 0;
        for (int i = 0; i < binaryChar.length; i++) {
            if (binaryChar[i] == '1') {
                if (temp > gap) gap = temp;
                temp = 0;
            } else {
                ++temp;
            }
        }
        return gap;
    }
}
