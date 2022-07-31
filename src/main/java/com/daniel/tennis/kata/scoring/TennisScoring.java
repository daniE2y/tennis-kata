package com.daniel.tennis.kata.scoring;

import com.daniel.tennis.kata.Player;

public class TennisScoring {

    public TennisScoring() {
        // Empty constructor.
    }

    public boolean getPoint(Player player, String score) {
        if (isValidScore(score)) {
            player.setScore(score);
            return true;
        }

        return false;
    }

    private boolean isValidScore(String score) {
        return "love".equals(score)
            || "15".equals(score)
            || "30".equals(score)
            || "40".equals(score)
            || "deuce".equals(score)
            || "advantage".equals(score);
    }

}
