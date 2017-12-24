package com.tito;

public class Main {

  public static void main(String[] args) {
    /* if/else blocks are good when you want flexibility with comparison statements */
    int value = 3;
    if (value == 1) {
        System.out.println("value is 1");
    } else if (value == 2) {
        System.out.println("value is 2");
    } else {
      System.out.println("value is not 1 or 2");
    }

    /* Switches are good for testing a single value */
    // can accept byte, short, char, int as an inp]ut value
    int switchValue = 4;
    switch(switchValue) {
      case 1:
        System.out.println("value is 1");
        break;
      case 2:
        System.out.println("value is 2");
        break;
      case 3:case 4:case 5:
        System.out.println("value is a 3, 4 or 5");
        System.out.println("actually, it was a " + switchValue);
        break;
      default:
        System.out.println("value is neither 1 nor 2");
        break;
    }

    /* CHALLENGE */
    // 1. create a new switch statement using char instead of int
    // 2. create a new char variable
    // 3. create a switch statement that tests for: A, B, C, D, and E
    // 4. display a message if any of thee are found and then break
    // 5. add a default to display "not found"

    char letter = 'D';

    switch(letter) {
      case 'A':
        System.out.println("the char is: " + letter);
        break;
      case 'B':
        System.out.println("the char is: " + letter);
        break;
      case 'C':case 'D':case 'E':
        System.out.println("the char is: " + letter);
        break;
      default:
        System.out.println("the char is not A, B, D or E");
        break;
    }

    String month = "JANUARY";
    // must match the case of String and char data types
    String lower = month.toLowerCase();
    switch(lower) {
      case "january":
        System.out.println("Jan");
        break;
      case "july":
        System.out.println("Jul");
        break;
      default:
        System.out.println("don't know that month");
        break;
    }
  }

}
