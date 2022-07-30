package com.daniel.tennis.kata;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TennisGameKataTest {

    @Test
    public void shouldGetGameResultsReturnNoWinners_whenTheGameIsNotStarted() {

        Player player1 = new Player();
        player1.setName("Daniel");
        player1.setScore("love");

        Player player2 = new Player();
        player1.setName("Pita");
        player1.setScore("love");

        TennisGame game = new TennisGame(player1, player2);
        String result = game.getGameResults();

        assertThat(result).isEqualTo("The game has not winners! Let's play");
    }

    @Test
    public void shouldGetGameResultsReturnInvalidGame_whenTheScoreIsIncorrect() {
        Player player1 = new Player();
        player1.setName("Daniel");
        player1.setScore("15");

        Player player2 = new Player();
        player1.setName("Pita");
        player1.setScore("35");

        TennisGame game = new TennisGame(player1, player2);
        String result = game.getGameResults();

        assertThat(result).isEqualTo("Oh! This is an invalid game");
    }

	@Test
	public void shouldGetGameResultsReturnPlayer1IsTheWinner_whenPlayer1GetsFortyPoints() {
        Player player1 = new Player();
        player1.setName("Daniel");
        player1.setScore("40");

        Player player2 = new Player();
        player1.setName("Pita");
        player1.setScore("15");

        TennisGame game = new TennisGame(player1, player2);
        String result = game.getGameResults();

        assertThat(result).isEqualTo("Player1 is the winner!");
    }

    @Test
    public void shouldGetGameResultsReturnDeuce_whenPlayersHaveTheSameFinalScore() {
        Player player1 = new Player();
        player1.setName("Daniel");
        player1.setScore("40");

        Player player2 = new Player();
        player1.setName("Pita");
        player1.setScore("40");

        TennisGame game = new TennisGame(player1, player2);
        String result = game.getGameResults();

        assertThat(result).isEqualTo("deuce");
        assertThat(player1.getScore()).isEqualTo("40");
        assertThat(player2.getScore()).isEqualTo("40");

    }

    @Test
    public void shouldGetGameResultsReturnAdvantage_whenPlayer1GetsAnExtraPoint() {
        Player player1 = new Player();
        player1.setName("Daniel");
        player1.setScore("advantage");

        Player player2 = new Player();
        player1.setName("Pita");
        player1.setScore("40");

        TennisGame game = new TennisGame(player1, player2);
        String result = game.getGameResults();

        assertThat(result).isEqualTo("advantage");
        assertThat(player1.getScore()).isEqualTo("advantage");
        assertThat(player2.getScore()).isEqualTo("40");

    }

}
