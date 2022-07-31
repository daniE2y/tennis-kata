package com.daniel.tennis.kata.scoring;

import com.daniel.tennis.kata.Player;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class TennisScoringTest {

    @Test
    void getPoint_shouldIncreaseThePlayerScore() {
        Player player = new Player();
        player.setName("Daniel");
        player.setScore("love");

        TennisScoring scoring = new TennisScoring();

        boolean point;
        point = scoring.getPoint(player, "15");
        assertThat(point).isTrue();

        point = scoring.getPoint(player, "30");
        assertThat(point).isTrue();
    }

    @Test
    void getPoint_shouldNotIncreaseThePlayerScore() {
        Player player = new Player();
        player.setName("Daniel");
        player.setScore("love");

        TennisScoring scoring = new TennisScoring();

        boolean point = scoring.getPoint(player, "100");
        assertThat(point).isFalse();
    }

}
