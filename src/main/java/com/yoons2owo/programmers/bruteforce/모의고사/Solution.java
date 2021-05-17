package com.yoons2owo.programmers.bruteforce.모의고사;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

    public static void main(String[] args) {

    }

    public int[] solution(int[] answers) {
        int[] answer = {0, 0, 0};

        int[] person1 = {1, 2, 3, 4, 5};
        int[] person2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] person3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == person1[i % person1.length]) answer[0]++;
            if (answers[i] == person2[i % person2.length]) answer[1]++;
            if (answers[i] == person3[i % person3.length]) answer[2]++;
        }

        List<Integer> list = new ArrayList<>();
        int max = Arrays.stream(answer).max().getAsInt();
        for (int i = 0; i < answer.length; i++) {
            if (max == answer[i]) list.add(i + 1);
        }

        return list.stream().mapToInt(i->i).toArray();
    }
}
