package com.jitterted.game.yatzy;

import java.util.List;
import java.util.Scanner;

public class YatzyGame {

  private Roller roller = new Roller();
  private Scorer scorer = new Scorer();
  private UpperSectionScoreTracker upperSectionScoreTracker = new UpperSectionScoreTracker();

  public static void main(String[] args) {
    System.out.println("Welcome to Yatzy!");
    Scanner scanner = new Scanner(System.in);
    YatzyGame game = new YatzyGame();
    boolean playing = true;
    while (playing) {
      System.out.println("(R)oll or (Q)uit?");
      String choice = scanner.nextLine().toLowerCase().substring(0, 1);
      switch (choice) {
        case "q":
          playing = false;
          break;
        case "r":
          game.doRoll(scanner);
          break;
        default:
          System.out.println("Enter R to Roll or Q to Quit.");
      }
    }
  }

  private void doRoll(Scanner scanner) {
    List<Integer> roll = roller.nextRoll();
    System.out.println("Roll: " + roll);
    upperSectionScoreTracker.availableCategories().forEach(System.out::println);

    System.out.println("Which category to use for scoring? (1-6)");
    int category = Integer.parseInt(scanner.nextLine());
    int score = scorer.score(roll, category);

    System.out.println("Your score is: " + score);
    upperSectionScoreTracker.assignScore(category, score);

    System.out.println("Upper Section Score Total: " + upperSectionScoreTracker.totalScore());
    upperSectionScoreTracker.categoryScores().forEach(System.out::println);
  }
}
