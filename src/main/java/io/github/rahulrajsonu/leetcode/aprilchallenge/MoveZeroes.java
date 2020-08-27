package io.github.rahulrajsonu.leetcode.aprilchallenge;

public class MoveZeroes {

  public static void main(String[] args) {
    int[] arr = {0,0,0,2,0,1,0,3,12,0,0,0,0,1,0,0};
//    int[] arr = {2,0,1,0,3,12,0,0,0,0,1};
//    int[] arr = {0,1,0,3,12};
    moveZeroes(arr);
    for (int el : arr) {
      System.out.print(el+" ");
    }
  }

  /**
   * Given an array nums, write a function to move all 0's to the end of it,
   * while maintaining the relative order of the non-zero elements.
   *
   * Example:
   *
   * Input: [0,1,0,3,12]
   * Output: [1,3,12,0,0]
   *
   * Note:
   * You must do this in-place without making a copy of the array.
   * Minimize the total number of operations.
   * @param nums
   */
  public static void moveZeroes(int[] nums) {
    int zeroIdx = 0;
    for (int m = 1; m < nums.length; m++) {
      if(nums[zeroIdx]==0 && nums[m]!=0){
        nums[zeroIdx] = nums[m];
        nums[m] = 0;
        zeroIdx++;
      }else if(nums[zeroIdx] != 0){
        zeroIdx++;
      }
    }
  }
}
