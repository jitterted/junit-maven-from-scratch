package com.jitterted.game.yatzy;

import java.util.List;

public class Scorer {
  public int score(List<Integer> roll, int category) {
    return roll.stream()
               .filter(die -> die == category)
               .mapToInt(Integer::intValue)
               .sum();
  }
}
