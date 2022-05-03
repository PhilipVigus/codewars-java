package leetcode.twosum;

public class TwoSum {
  public int[] twoSumBruteForce(int[] nums, int target) {
    for (int i = 0; i < nums.length - 1; i++) {
      for (int j = i + 1; j < nums.length; j++) {
        if (nums[i] + nums[j] == target) {
          return new int[] {i, j};
        }
      }
    }

    return new int[] {};
  }

  public int[] twoSumEfficient(int[] nums, int target) {
    int leftPointer = 0;
    int rightPointer = nums.length - 1;
    int sum;

    while (leftPointer < rightPointer) {
      sum = nums[leftPointer] + nums[rightPointer];

      if (sum == target) {
        return new int[] {leftPointer, rightPointer};
      }

      if (sum > target) {
        rightPointer--;
      } else {
        leftPointer++;
      }
    }

    return new int[] {-1, -1};
  }
}
