package com.tito;

public class Main {

  public static void main(String[] args) {
    /* WHILE (1) // FOR (2) // WHILE/IF (3) */
    /* example 1 */
    int count = 0;
    while (count != 6) {
      System.out.println("[while] count value is " + count);
      count++;
    }
    System.out.println("1 *********************************************");

    /* example 2 */
    // same loop as the above while example (line 8)
    for (int i = 0; i < 6; i++) {
      System.out.println("[for] count value is " + i);
    }
    System.out.println("2 *********************************************");

    /* example 3 */
    // same loop as the above while and for loop examples (line 8 & line 14)
    count = 0; // reset counter
    while (true) {
      if (count == 6) {
        break;
      }
      System.out.println("[while w/nested if & break] count value is " + count);
      count ++;
    }
    System.out.println("3 *********************************************");

    /* DO WHILE STATMENTS */
    // do while loops are guaranteed to execute at least once
    // this makes it easy to get into infinite loops
    count = 0; // reset counter
    do {
      System.out.println("[do while] count value is " + count);
      count ++;
      // safeguard against infiite loop
      if (count > 100) {
        break;
      }
    } while (count != 6);

    /* CHALLENGE 1: */
    // 1. create am isEvenNum method that takes a param of type int
    // 2. isEvenNum will determine if the param passed to it is even or not
    // 3. return true if even, false if not
    System.out.println("4 *********************************************");
    for (int i = 0; i < 10; i ++) {
      boolean out = isEvenNum(i);
      System.out.println("[do while (C1)] " + out);
    }
    System.out.println("5 *********************************************");
    count = 0; //reset counter
    while (count != 10) {
      boolean out = isEvenNum(count);
      System.out.println("[do while (C1)] " + out);
      count ++;
    }
    System.out.println("6 *********************************************");
    count = 0; // reset counter
    do {
      // returns true when an even number is passed to the method
      boolean out = isEvenNum(count);
      System.out.println("[do while (C1)] " + out);
      count ++;
    } while (count != 10);
    System.out.println("7 *********************************************");
    /* INSTRUCTOR SOLUTION */
    count = 0;
    int finishNum = 20;
    while (count <= finishNum) {
      // if (!TRUE) => falsey ---- if (!FALSE) => truthy
      // written to evaluate when the count is not an even number
      if (!isEvenNum(count)) {
        count ++;
        continue; // resets code back to line 74 to re-test the condition
      }
      System.out.println("[while w/if (C1)] even number: "+ count);
      count ++;
    }
    System.out.println("8 *********************************************");
    /* CHALLENGE 2: */
    //  modify the while w/if statement directly above to include:
    //  - recording a count of even numbers
    //  - break when even number counter reaches 5
    //  - display total count of even numbers
    count = 4;
    int evenCount = 0;
    while (evenCount < 5) {
      if (!isEvenNum(count)) {
        evenCount ++;
        count ++;
        System.out.println("[while w/if (C2)] even number: " + count);
        continue; // resets code back to line 91 to re-test the condition
      }
      count ++;
    }
    System.out.println(evenCount + " evens counted");
  }

  public static boolean isEvenNum (int num) {
    if ( (num % 2) == 0 ) {
      System.out.println("[isEvenNum] " + num + " is even");
      return true;
    }
    return false;
  }
}
