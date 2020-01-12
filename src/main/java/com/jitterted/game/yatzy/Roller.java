package com.jitterted.game.yatzy;

import java.util.ArrayList;
import java.util.List;

public class Roller {

  private DieRoller dieRoller = new DieRoller();

  public List<Integer> nextRoll() {
    List<Integer> roll = new ArrayList<>();
    for (int i = 0; i < 5; i++) {
      roll.add(dieRoller.roll());
    }
    return roll;
  }
}
