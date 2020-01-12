package com.jitterted.game.yatzy;

import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class UpperSectionScoreTrackerTest {

  @Test
  public void assignScoreToCategory5RemovesItFromAvailableCategories() throws Exception {
    UpperSectionScoreTracker upperSectionScoreTracker = new UpperSectionScoreTracker();

    upperSectionScoreTracker.assignScore(5, 15);

    assertThat(upperSectionScoreTracker.availableCategories())
        .containsOnly("Category 1",
                      "Category 2",
                      "Category 3",
                      "Category 4",
                      "Category 6");
  }

  @Test
  public void scoreTableReturnsScoresForAllCategories() throws Exception {
    UpperSectionScoreTracker upperSectionScoreTracker = new UpperSectionScoreTracker();

    upperSectionScoreTracker.assignScore(1, 5);
    upperSectionScoreTracker.assignScore(2, 20);
    upperSectionScoreTracker.assignScore(6, 24);

    assertThat(upperSectionScoreTracker.categoryScores())
        .containsOnly("Category 1: 5",
                      "Category 2: 20",
                      "Category 3: 0",
                      "Category 4: 0",
                      "Category 5: 0",
                      "Category 6: 24");
  }

  @Test
  public void addScoreOf9ForThreesToNewGameResultsInTotalScoreOf9() throws Exception {
    UpperSectionScoreTracker upperSectionScoreTracker = new UpperSectionScoreTracker();

    upperSectionScoreTracker.assignScore(3, 9);

    assertThat(upperSectionScoreTracker.totalScore())
        .isEqualTo(9);
  }

}
