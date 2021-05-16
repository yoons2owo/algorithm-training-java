package com.yoons2owo.hackrank.sort.comparator;

import java.util.Comparator;

class Player {
    String name;
    int score;

    Player(String name, int score) {
        this.name = name;
        this.score = score;
    }

}

class Checker implements Comparator<Player> {

    @Override
    public int compare(Player a, Player b) {
        if (a.score > b.score) {
            return -1;
        } else if (a.score == b.score) {
            return a.name.compareTo(b.name);
        } else if (a.score < b.score) {
            return 1;
        }
        return 0;
    }
}

public class Solution {

    public static void main(String[] args) {

    }

}
