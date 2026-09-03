package Arrays;



import java.util.*;

// Problem:
// Given an integer array nums and an integer k, find the total number
// of subarrays whose sum equals k.
//
// Example:
// Input:
// 5
// 1 2 3 -2 2
// 3
//
// Output:
// 3
//
// Subarrays with sum 3:
// [1, 2]
// [3]
// [3, -2, 2]
//
// Approach:
// Use a brute-force approach with two nested loops.
//
// For every starting index i, maintain a running sum and keep adding
// elements from i to j.
// Whenever the sum becomes equal to k, increment the count.
//
// Time Complexity:
// O(n^2)
//
// Space Complexity:
// O(1)

public class SubarraySumEqualsK {

    public static int subarraySum(int[] nums, int k) {

        int count = 0;
        int n = nums.length;

        for (int i = 0; i < n; i++) {

            int sum = 0;

            for (int j = i; j < n; j++) {

                sum += nums[j];

                if (sum == k) {
                    count++;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int k = sc.nextInt();

        int result = subarraySum(nums, k);

        System.out.println("Number of subarrays with sum " + k + ": " + result);

        sc.close();
    }
}