package Arrays;

import java.util.*;

// Problem:
// Given an array containing n distinct numbers taken from the range
// [0, n], find the one number that is missing from the array.

// Example:
// Input:
// 3
// 3 0 1
//
// Output:
// 2

// Approach:
// Use the XOR property:
// - x ^ x = 0
// - x ^ 0 = x
//
// XOR all numbers from 0 to n and XOR all elements present in the array.
// All numbers that are present cancel out, leaving only the missing number.

// Time Complexity:
// O(n)

// Space Complexity:
// O(1)

public class MissingNumber {

    public static int missingNumber(int[] nums) {

        int n = nums.length;
        int total = 0;
        int present = 0;

        for (int i = 0; i <= n; i++) {
            total ^= i;
        }

        for (int num : nums) {
            present ^= num;
        }

        return total ^ present;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int missing = missingNumber(nums);

        System.out.println("Missing number: " + missing);

        sc.close();
    }
}