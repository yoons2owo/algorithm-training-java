package com.yoons2owo.hackrank.string.anagram;

import java.util.HashMap;

class Result {

    public static int anagram(String s) {
        if (s.length() % 2 != 0) {
            return -1;
        }
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = s.length() - 1; i >= s.length() / 2; i--) {
            if (map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
            } else {
                map.put(s.charAt(i), 1);
            }
        }
        int result = 0;
        for (int i = 0; i < s.length() / 2; i++) {
            if (map.containsKey(s.charAt(i))) {
                if (map.get(s.charAt(i)) > 0) {
                    map.put(s.charAt(i), map.get(s.charAt(i))- 1);
                } else {
                    result++;
                }
            }
            if (!map.containsKey(s.charAt(i))) {
                result++;
            }
        }
        return result;
    }
}

public class Solution {
    public static void main(String[] args) {
        System.out.println(Result.anagram("xaxbbbxx"));
    }
}
