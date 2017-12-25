package com.tito;

public class Main {

  public static void main(String[] args) {
    System.out.println("[line 6] $10,000 at 2% interest = $" + calcInterest(10000.0, 2.0));
//    System.out.println("$10,000 at 3% interest = $" + calcInterest(10000.0, 3.0));
//    System.out.println("$10,000 at 4% interest = $" + calcInterest(10000.0, 4.0));
//    System.out.println("$10,000 at 5% interest = $" + calcInterest(10000.0, 5.0));
    // use line 11 to break up outputs
    System.out.println("**********************************************");

    for (int i = 0; i < 3; i ++) {
      if (i < 2) {
        System.out.println("[line 12] loop " + i + " hello!");
      } else {
        System.out.println("[line 12] loop " + i + " hello!" + "\n");
      }
//      System.out.println("$10,000 at 2% interest = $" + calcInterest(10000.0, 2.0));
    }

    /* CHALLENGE: */
    // 1. using the for statement , call the calcInterest method
    // 2. use the amount 10,000 w/interest rates of 2, 3, 4, 5, 6, 7, and 8
    // 3. print the results to the console

    for (double i = 2; i < 9; i ++) {
      if (i < 8) {
        System.out.println( "[line 22] $10,000 at " + i + "% interest = $" +
            String.format( "%.2f", calcInterest(10000.0, i) ) );
        // "%.2f" makes output print the number with 2 zeros
      } else {
        System.out.println("[line 22] $10,000 at " + i + "% interest = $" +
            String.format("%.2f", calcInterest(10000.0, i)) + "\n");
        // "%.2f" makes output print the number with 2 zeros
      }
    }

    // how would you modify the for loop above to start at 8% go to 2% ???
    // answer is below
    for (double i = 8; i > 1; i --) {
      System.out.println("[line 29] $10,000 at " + i + "% interest = $" +
          String.format("%.2f", calcInterest(10000.0, i)));
      // "%.2f" makes output print the number with 2 zeros
    }

  /* CHALLENGE: */
  // 1. create a for statement using any range of numbers
  // 2. determine is the number is a prime number using the isPrime method
  // 3. if it is a prime number, print it & increment a prime number counter
  // 4. when the prime number counter reaches 3, exit the loop
  // hint: use the break; statement to exit the loop
    System.out.println("**********************************************");
    int primeCounter = 0;

    for (int i = 100; i < 150; i++) {
      int currNum = i;
      if ( isPrime(currNum) ) {
        primeCounter++;
        System.out.println(currNum + " is a prime");
        System.out.println("prime count: " + primeCounter);
        System.out.println("**********************************************");
        if (primeCounter >= 10) {
          System.out.println("found 10 primes, exiting for loop");
          break;
        }
      }
//      else if (primeCounter > 3) {
//        System.out.println("found 3 primes, exiting for loop");
//        break;
//      }
    }

  }

  public static boolean isPrime(int n) {
    if(n == 1) {
      return false;
    }

    for(int i=2; i <= (long) Math.sqrt(n); i++) {
//      System.out.println("Looping " + i); // how to check for optimization
      if(n % i == 0) {
        return false;
      }
    }
    return true;
  }

  public static double calcInterest(double amount, double intRate) {
    return (amount * (intRate / 100));
  }
}
