package com.yoons2owo.hackrank.greedy.mindifference;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Result {

    public static int minimumAbsoluteDifference(List<Integer> arr) {
//        int result = arr.get(0) > arr.get(1) ?
//                arr.get(0) - arr.get(1) : arr.get(1) - arr.get(0);
//        for (int i = 0; i < arr.size(); i++) {
//            for (int j = i + 1; j < arr.size(); j++) {
//                    int temp = arr.get(i) > arr.get(j) ?
//                            arr.get(i) - arr.get(j) : arr.get(j) - arr.get(i);
//                    if (result > temp) {
//                        result = temp;
//                    }
//            }
//        }
        Collections.sort(arr);
        int result = arr.get(1) - arr.get(0);
        for (int i = 0; i < arr.size() - 1; i++) {
            int temp = arr.get(i+1) - arr.get(i);
            if (result > temp) result = temp;
        }

        return result;
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> arr = Stream.of(br.readLine()
                .replaceAll("\\s+$", "")
                .split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());


        Result.minimumAbsoluteDifference(arr);
    }
}
