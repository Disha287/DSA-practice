package Arrays;

import java.util.*;

// Problem:
// Given an array of integers and a target value, find the indices
// of two numbers whose sum is equal to the target.

// Example:
// Input:
// 4
// 2 7 11 15
// 9
//
// Output:
// 0 1

// Approach:
// Use a HashMap to store each number and its index.
// For every element, calculate its complement:
// complement = target - current element.
// If the complement already exists in the HashMap, return its index
// along with the current index.
// Otherwise, store the current element and its index in the map.

// Time Complexity:
// O(n)

// Space Complexity:
// O(n)

public class twosum {

    public static int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();

        int n = nums.length;

        for (int i = 0; i < n; i++) {

            int complement = target - nums[i];

            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }

            map.put(nums[i], i);
        }

        return new int[]{};
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int target = sc.nextInt();

        int[] result = twoSum(nums, target);

        if (result.length == 2) {
            System.out.println(result[0] + " " + result[1]);
        } else {
            System.out.println("No solution found");
        }

        sc.close();
    }
}