package io.github.rahulrajsonu.leetcode.aprilchallenge;

/**
 * Kadanes algorithm
 */
public class LongestContiguousSubarraySum {

  public static void main(String[] args) {
    int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
    System.out.println(maxSubArray(arr));
  }

  /**
   * Given an integer array nums, find the contiguous subarray (containing at least one number)
   * which has the largest sum and return its sum.
   *
   * Example:
   * Input: [-2,1,-3,4,-1,2,1,-5,4],
   * Output: 6
   * Explanation: [4,-1,2,1] has the largest sum = 6.
   *
   * @param nums
   * @return
   */
  public static int maxSubArray(int[] nums) {
    int meh = 0;
    int msf = Integer.MIN_VALUE;
    for (int m = 0; m < nums.length; m++) {
      meh+=nums[m];
      if(meh<nums[m])
        meh=nums[m];
      if(meh>msf)
        msf=meh;
    }
    return msf;
  }

  public static int maxSubArrayWithIdx(int[] nums) {
    int maxEnding = 0;
    int maxSoFar = Integer.MIN_VALUE;
    int left = 0;
    int right = 0;
    for (int m = 0; m < nums.length; m++) {
      maxEnding+=nums[m];
      if(nums[m] > maxEnding){
        maxEnding = nums[m];
        left = m;
      }
      if(maxSoFar < maxEnding){
        maxSoFar = maxEnding;
        right = m;
      }
    }
    System.out.println(left+"<->"+right);
    return maxSoFar;
  }

}
