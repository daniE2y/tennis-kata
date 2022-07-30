package com.daniel.tennis.kata;

import org.apache.commons.lang3.StringUtils;

public class TennisGame {

    Player player1 = new Player();
    Player player2 = new Player();

    public TennisGame(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public String getGameResults(Player player1, Player player2) {

        // Love. Starting the game.
        if ("love".equals(player1.getScore()) && "love".equals(player2.getScore())) {
            return "The game has not winners! Let's play";
        }

        // Simple winner game.
        if ("40".equals(player1.getScore()) && "15".equals(player2.getScore())) {
            return player1.getName() + " is the winner!";
        }

        if ("40".equals(player2.getScore()) && "15".equals(player1.getScore())) {
            return player2.getName() + "is the winner!";
        }

        // Deuce.
        if ("40".equals(player1.getScore()) && "40".equals(player2.getScore())) {
            return "deuce";
        }

        // Advantage.
        if ("advantage".equals(player1.getScore()) && "40".equals(player2.getScore())) {
            return "advantage";
        }

        if ("40".equals(player2.getScore()) && "advantage".equals(player1.getScore())) {
            return "advantage";
        }

        return StringUtils.EMPTY;
    }
}
