package com.daniel.tennis.kata;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class TennisGameKataTest {

	@Test
	void shouldGetGameResultsReturnPlayer1IsTheWinner_whenPlayer1GetsFourPoints() {
        Player player1 = new Player();
        player1.setName("Daniel");
        player1.setScore("40");

        Player player2 = new Player();
        player2.setName("Pita");
        player2.setScore("15");

        TennisGame game = new TennisGame(player1, player2);
        String result = game.getGameResults();

        assertThat(result).isEqualTo("Daniel is the winner!");
    }

    @Test
    void shouldGetGameResultsReturnDeuce_whenPlayersHaveTheSameFinalScore() {
        Player player1 = new Player();
        player1.setName("Daniel");
        player1.setScore("40");

        Player player2 = new Player();
        player2.setName("Pita");
        player2.setScore("40");

        TennisGame game = new TennisGame(player1, player2);
        String result = game.getGameResults();

        assertThat(result).isEqualTo("deuce");
        assertThat(player1.getScore()).isEqualTo("40");
        assertThat(player2.getScore()).isEqualTo("40");

    }

    @Test
    void shouldGetGameResultsReturnAdvantage_whenPlayer1GetsAnExtraPoint() {
        Player player1 = new Player();
        player1.setName("Daniel");
        player1.setScore("advantage");

        Player player2 = new Player();
        player2.setName("Pita");
        player2.setScore("40");

        TennisGame game = new TennisGame(player1, player2);
        String result = game.getGameResults();

        assertThat(result).isEqualTo("advantage");
        assertThat(player1.getScore()).isEqualTo("advantage");
        assertThat(player2.getScore()).isEqualTo("40");

    }

}
