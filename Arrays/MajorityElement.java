package Arrays;



import java.util.*;

// Problem:
// Given an array of integers, find the element that appears more than
// n / 2 times, where n is the size of the array.

// Example:
// Input:
// 5
// 2 2 1 1 1
//
// Output:
// 1
//
// Majority element: 1

// Approach:
// Store the frequency of each element using a HashMap.
// Traverse the array and count the occurrences of each number.
// Then traverse the HashMap and find the element whose frequency
// is greater than n / 2.
//
// Time Complexity:
// O(n)
//
// Space Complexity:
// O(n)

public class MajorityElement {

    public static int majorityElement(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();

        // Count frequency of each element
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int n = nums.length;

        // Find the majority element
        for (int key : map.keySet()) {

            if (map.get(key) > n / 2) {
                return key;
            }
        }

        return 0;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int result = majorityElement(nums);

        System.out.println("Majority element: " + result);

        sc.close();
    }
}
