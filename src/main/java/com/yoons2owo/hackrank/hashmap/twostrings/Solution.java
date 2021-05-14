package com.yoons2owo.hackrank.hashmap.twostrings;

import java.util.HashMap;

class Result {

    public static String twoStrings(String s1, String s2) {
        String[] array1 = s1.split("");
        String[] array2 = s2.split("");

        HashMap<String, String> map = new HashMap<String, String>();
        for (String a :  array1) {
            map.put(a, "");
        }
        for (String a : array2) {
            if (map.containsKey(a)) {
                return "YES";
            }
        }
        return "NO";
    }

}

public class Solution {
    public static void main(String[] args) {

    }
}
