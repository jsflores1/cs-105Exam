package edu.sbcc.cs105;

import java.util.Scanner;

public class Program {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    System.out.println("Enter a FICO score (300 - 850");
    int ficoScore = input.nextInt();
    input.close();

    if (ficoScore < 300 || ficoScore > 850) {
      System.out.printf("%d is not a valid score. A valid is between 300 and 800", ficoScore);
      return;
    }

    double interestRate = 0;
    boolean loanDecision = true;

    char ficoLevel = getFicoLevel(ficoScore);

    switch (ficoLevel) {
    case 'A':
      interestRate = .05;
      break;
    case 'B':
      interestRate = .10;
      break;
    case 'C':
      interestRate = .15;
      break;
    default:
      loanDecision = false;
      break;
    }

    if (loanDecision) {
      System.out.printf("Congratulations, you were approved for a %2.2f percent loan%n", interestRate * 100);
    } else {
      System.out.printf("We're very sorry, but we cannot offer you a loan%n");
    }

  }

  private static char getFicoLevel(int ficoScore) {
    return 'A';
  }
}
