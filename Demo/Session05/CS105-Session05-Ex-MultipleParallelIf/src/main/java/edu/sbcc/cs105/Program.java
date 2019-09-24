package edu.sbcc.cs105;

public class Program {

  public static void main(String[] args) {

    int ficoScore = 750;
    double interestRate = 0;
    boolean loanDecision = true;

    if (ficoScore > 750) {
      interestRate = .05;
    } else if (ficoScore > 600) {
      interestRate = .1;
    } else if (ficoScore > 500) {
      interestRate = .15;
    } else {
      // we did not set this in the other branches because of initialized to true
      loanDecision = false;
    }

    if (loanDecision) {
      System.out.printf("Congratulations, you were approved for a %2.2f percent loan%n", interestRate * 100);
    } else {
      System.out.printf("We're very sorry, but we cannot offer you a loan%n");
    }

  }

  
}
