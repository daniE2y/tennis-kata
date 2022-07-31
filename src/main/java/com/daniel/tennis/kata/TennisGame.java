package com.daniel.tennis.kata;

import org.apache.commons.lang3.StringUtils;

public class TennisGame {

    private static final String DEUCE = "deuce";
    private static final String ADVANTAGE = "advantage";
    private static final String FOUR_POINTS = "40";
    private static final String LOVE = "love";

    private final Player player1;
    private final Player player2;

    public TennisGame(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public String getGameResults() {
        if (hasWinner()) {
            return getPlayerWithHighestScore().getName() + " is the winner!";
        }

        if (hasDeuce()) {
            return DEUCE;
        }

        if (hasAdvantage()) {
            return ADVANTAGE;
        }

        return StringUtils.EMPTY;
    }

    private boolean hasDeuce() {
        return FOUR_POINTS.equals(player1.getScore()) && FOUR_POINTS.equals(player2.getScore());
    }

    private boolean hasAdvantage() {
        return ADVANTAGE.equals(player1.getScore()) || ADVANTAGE.equals(player2.getScore());
    }

    private boolean hasWinner() {
        if (loveGameInProcess()) {
            return false;
        }
        if (getFourPointsByAPlayer()) {
            return "15".equals(player1.getScore()) || "15".equals(player2.getScore());
        }
        return false;
    }

    private boolean getFourPointsByAPlayer() {
        return FOUR_POINTS.equals(player1.getScore()) || FOUR_POINTS.equals(player2.getScore());
    }

    private boolean loveGameInProcess() {
        return LOVE.equals(player1.getScore()) && LOVE.equals(player2.getScore());
    }

    private Player getPlayerWithHighestScore() {
        if (Integer.parseInt(player1.getScore()) > Integer.parseInt(player2.getScore())) {
            return player1;
        } else {
            return player2;
        }
    }
}
