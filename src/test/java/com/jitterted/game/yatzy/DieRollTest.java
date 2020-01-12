package com.jitterted.game.yatzy;

import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class DieRollTest {

  @Test
  public void rollOneDieResultsInValueBetween1and6() {
    int roll = new DieRoller().roll();

    assertThat(roll)
        .isBetween(1, 6);
  }

}