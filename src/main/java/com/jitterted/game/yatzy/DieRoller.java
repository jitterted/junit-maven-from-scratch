package com.jitterted.game.yatzy;

import java.util.Random;

public class DieRoller {

  private final Random random = new Random();

  public int roll() {
    return random.nextInt(6) + 1;
  }
}