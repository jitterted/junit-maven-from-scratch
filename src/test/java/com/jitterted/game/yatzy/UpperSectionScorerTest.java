package com.jitterted.game.yatzy;

import org.junit.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.*;

public class UpperSectionScorerTest {

  @Test
  public void rollOf_3_3_3_2_4_ScoreAsThreesIs9() throws Exception {
    // Given
    List<Integer> roll = List.of(3, 3, 3, 2, 4);

    // When
    // X parameter to Scorer() constructor
    // X method name specific to score category (scoreThrees)
    // ☑️ parameter to score() method
    int score = new Scorer().score(roll, 3);

    // Then
    assertThat(score)
        .isEqualTo(9);
  }

  @Test
  public void roll5_5_4_3_1_ScoreAsFivesIs10() throws Exception {
    List<Integer> roll = List.of(5, 5, 4, 3, 1);

    int score = new Scorer().score(roll, 5);

    assertThat(score)
        .isEqualTo(10);
  }

  @Test
  public void roll6_6_5_5_4ScoreAsAcesIs0() throws Exception {
    List<Integer> roll = List.of(6, 6, 5, 5, 4);

    int score = new Scorer().score(roll, 1);

    assertThat(score)
        .isZero();
  }

}