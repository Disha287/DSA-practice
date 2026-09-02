package Arrays;



import java.util.*;

// Problem:
// Given an array where every element appears twice except for one element,
// find and return the element that appears only once.

// Example:
// Input:
// 5
// 4 1 2 1 2
//
// Output:
// 4

// Approach:
// Use XOR.
// Since a number XOR itself is 0 (x ^ x = 0) and
// XOR with 0 gives the number (x ^ 0 = x),
// all duplicate elements cancel each other out.
// The remaining value is the single number.

// Time Complexity:
// O(n)

// Space Complexity:
// O(1)

public class SingleNumber {

    public static int singleNumber(int[] nums) {

        int total = 0;

        for (int num : nums) {
            total ^= num;
        }

        return total;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int result = singleNumber(nums);

        System.out.println("Single number: " + result);

        sc.close();
    }
}
