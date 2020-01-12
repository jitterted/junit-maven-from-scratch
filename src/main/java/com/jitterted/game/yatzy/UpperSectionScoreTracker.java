package com.jitterted.game.yatzy;

import java.util.ArrayList;
import java.util.List;

public class UpperSectionScoreTracker {
  private List<Integer> upperSectionScores = new ArrayList<>();
  private List<Boolean> isAvailable = new ArrayList<>();

  public UpperSectionScoreTracker() {
    initializeScores();
  }

  private void initializeScores() {
    for (int i = 0; i <= 6; i++) {
      upperSectionScores.add(0);
      isAvailable.add(true);
    }
  }

  public void assignScore(int category, int score) {
    upperSectionScores.set(category, score);
    isAvailable.set(category, false);
  }

  public int totalScore() {
    return upperSectionScores.stream().mapToInt(Integer::intValue).sum();
  }

  public List<String> availableCategories() {
    List<String> categories = new ArrayList<>();
    for (int i = 1; i <= 6; i++) {
      if (isAvailable.get(i)) {
        categories.add("Category " + i);
      }
    }
    return categories;
  }

  public List<String> categoryScores() {
    List<String> categoryScores = new ArrayList<>();
    for (int i = 1; i <= 6; i++) {
      categoryScores.add("Category " + i + ": " + upperSectionScores.get(i));
    }
    return categoryScores;
  }
}
