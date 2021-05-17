package com.yoons2owo.programmers.hash.위장;

import java.util.HashMap;

public class Solution {
    public int solution(String[][] clothes) {
        int result = 1;
        HashMap<String, Integer> map = new HashMap<String, Integer>();	// 종류, 갯수
        for (int i = 0; i < clothes.length; i++) {
            if (map.containsKey(clothes[i][1])) {
                map.put(clothes[i][1], map.get(clothes[i][1]) + 1);
            } else {
                map.put(clothes[i][1], 1);
            }
        }
        for (String key : map.keySet()) {
            result *= map.get(key) + 1;
        }
        return result - 1;
    }
}
