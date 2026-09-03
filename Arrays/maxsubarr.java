package Arrays;

import java.util.*;

// Problem:
// Given an integer array, find the contiguous subarray with the
// largest sum and return its sum.
//
// Example:
// Input:
// 9
// -2 1 -3 4 -1 2 1 -5 4
//
// Output:
// 6
//
// Maximum subarray:
// 4 -1 2 1
//
// Maximum sum = 6

// Approach:
// Use Kadane's Algorithm.
//
// Maintain two variables:
// currsum -> maximum sum of a subarray ending at the current index.
// maxsum  -> maximum subarray sum found so far.
//
// For every element, decide whether to:
// 1. Start a new subarray from the current element.
// 2. Extend the previous subarray by adding the current element.
//
// currsum = max(nums[i], currsum + nums[i])
// maxsum = max(maxsum, currsum)
//
// Time Complexity:
// O(n)
//
// Space Complexity:
// O(1)

public class maxsubarr {

    public static int maxSubArray(int[] nums) {

        int currsum = nums[0];
        int maxsum = nums[0];

        for (int i = 1; i < nums.length; i++) {

            currsum = Math.max(nums[i], currsum + nums[i]);

            maxsum = Math.max(maxsum, currsum);
        }

        return maxsum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int result = maxSubArray(nums);

        System.out.println("Maximum subarray sum: " + result);

        sc.close();
    }
}