package com.yoons2owo.hackrank.hashmap.ransomnote;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Result {


    public static void checkMagazine(List<String> magazine, List<String> note) {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        for (String m : magazine) {
            if (map.containsKey(m)) {
                map.put(m, map.get(m) + 1);
            } else {
                map.put(m, 1);
            }
        }
        for (String n : note) {
            if (map.containsKey(n)) {
                if (map.get(n) < 1) {
                    System.out.println("No");
                    return;
                }
                map.put(n, map.get(n) - 1);
            } else {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }
}

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] firstMultipleInput = bufferedReader.readLine()
                .replaceAll("\\s+$", "").split(" ");
        int m = Integer.parseInt(firstMultipleInput[0]);
        int n = Integer.parseInt(firstMultipleInput[1]);

        List<String> magazine = Stream.of(bufferedReader.readLine()
                .replaceAll("\\s+$", " ")
                .split("")).collect(Collectors.toList());
        List<String> note = Stream.of(bufferedReader.readLine()
                .replaceAll("\\s+$", " ")
                .split("")).collect(Collectors.toList());

        Result.checkMagazine(magazine, note);
        bufferedReader.close();
    }
}
