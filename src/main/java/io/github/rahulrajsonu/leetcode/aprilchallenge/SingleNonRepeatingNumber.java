package io.github.rahulrajsonu.leetcode.aprilchallenge;

public class SingleNonRepeatingNumber {

  public static void main(String[] args) {
    int[] arr = {4,1,2,1,2};
    System.out.println(singleNumber(arr));
  }

  /**
   * Given a non-empty array of integers, every element appears twice except for one. Find that single one.
   * Constraint : Your algorithm should have a linear runtime complexity.
   * Could you implement it without using extra memory?
   * Example 1:
   * Input: [2,2,1]
   * Output: 1
   *
   * Example 2:
   * Input: [4,1,2,1,2]
   * Output: 4
   */
  public static int singleNumber(int[] arr){
    int res = 0;
    for (int m :arr) {
      res^=m;
    }
    return res;
  }
}
