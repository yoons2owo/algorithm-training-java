package com.yoons2owo.hackrank.string.alternating;

class Result {

    public static int alternatingCharacters(String s) {
        int result = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i+1)) {
                result++;
            }
        }
        return result;
    }
}

public class Solution {
}
