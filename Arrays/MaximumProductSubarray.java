package Arrays;

import java.util.*;

// Problem:
// Given an integer array, find the contiguous subarray that has the
// largest product and return the product.
//
// Example:
// Input:
// 4
// 2 3 -2 4
//
// Output:
// 6
//
// Maximum product subarray:
// [2, 3]
//
// Maximum product = 6

// Approach:
// Use a modified version of Kadane's Algorithm.
//
// Maintain two variables:
// currmax -> maximum product of a subarray ending at the current index.
// currmin -> minimum product of a subarray ending at the current index.
//
// We need both maximum and minimum because multiplying by a negative
// number can turn the minimum product into the maximum product.
//
// If the current number is negative, swap currmax and currmin.
//
// Then calculate:
// currmax = max(nums[i], currmax * nums[i])
// currmin = min(nums[i], currmin * nums[i])
//
// Keep updating maxprod to store the maximum product found so far.
//
// Time Complexity:
// O(n)
//
// Space Complexity:
// O(1)

public class MaximumProductSubarray {

    public static int maxProduct(int[] nums) {

        int currmax = nums[0];
        int currmin = nums[0];
        int maxprod = nums[0];

        for (int i = 1; i < nums.length; i++) {

            // Negative number can swap maximum and minimum
            if (nums[i] < 0) {

                int temp = currmax;
                currmax = currmin;
                currmin = temp;
            }

            currmax = Math.max(nums[i], currmax * nums[i]);

            currmin = Math.min(nums[i], currmin * nums[i]);

            maxprod = Math.max(maxprod, currmax);
        }

        return maxprod;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int result = maxProduct(nums);

        System.out.println("Maximum product subarray: " + result);

        sc.close();
    }
}