package com.yoons2owo.hackrank.search.icecream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

class Result {

    public static void whatFlavors(List<Integer> cost, int money) {
//        for (int i = 0; i < cost.size(); i++) {
//            for (int j = i + 1; j < cost.size(); j++) {
//                if (money - cost.get(i) - cost.get(j) == 0) {
//                    System.out.println((i + 1) + " " + (j + 1));
//                    return;
//                }
//            }
//        }
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < cost.size(); i++) {
            if (money > cost.get(i)) {
                if (map.containsKey(money - cost.get(i))) {
                    System.out.println(map.get(money - cost.get(i)) + " " + (i + 1));
                    return;
                }
                if (!map.containsKey(cost.get(i))) map.put(cost.get(i), i + 1);
            }
        }
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int money = Integer.parseInt(br.readLine());
        List<Integer> a = Stream.of(br.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        Result.whatFlavors(a, money);
    }
}
