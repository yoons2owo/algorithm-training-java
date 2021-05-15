package com.yoons2owo.hackrank.array.chaos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

class Result {

    public static void minimumBribes(List<Integer> q) {
        int bribes = 0;
        for (int i = q.size() - 1; i >= 0; i--) {
            if (q.get(i) - (i + 1)> 2) {
                System.out.println("Too chaotic");
                return;
            }
            for (int j = Math.max(0, q.get(i) - 2); j < i; j++) {
                if (q.get(j) > q.get(i)) bribes++;
            }
        }
        System.out.println(bribes);
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> a = Stream.of(br.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());
        Result.minimumBribes(a);
    }
}
