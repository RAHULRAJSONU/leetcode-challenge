package io.github.rahulrajsonu.leetcode.aprilchallenge;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {

  public static void main(String[] args) {
    System.out.println(isHappyNumber(29));
  }

  /**
   * A happy number is a number defined by the following process: Starting with any positive integer,
   * replace the number by the sum of the squares of its digits,
   * and repeat the process until the number equals 1 (where it will stay),
   * or it loops endlessly in a cycle which does not include 1.
   * Those numbers for which this process ends in 1 are happy numbers.
   *Example:
   *
   * Input: 19
   * Output: true
   * Explanation:
   * 12 + 92 = 82
   * 82 + 22 = 68
   * 62 + 82 = 100
   * 12 + 02 + 02 = 1
   *
   * Return True if n is a happy number, and False if not.
   * @param number
   * @return
   */
  public static boolean isHappyNumber(int number){
    Set<Integer> visited = new HashSet<Integer>();
    boolean result = false;
    while (number > 0){
      number = getSum(number);
      if(visited.contains(number)){
        result = false;
        break;
      }else if(1==number){
        result = true;
        break;
      }
      visited.add(number);
    }
    return result;
  }

  private static int getSum(int number) {
    int sum = 0;
    while (0 < number){
      int right = number%10;
      sum+=right*right;
      number/=10;
    }
    return sum;
  }

}
