package Arrays;



import java.util.*;

// Problem:
// Given an unsorted array of integers, find the length of the longest
// consecutive sequence of elements.

// Example:
// Input:
// 6
// 100 4 200 1 3 2
//
// Output:
// 4
//
// Longest consecutive sequence: 1 2 3 4

// Approach:
// Store all elements in a HashSet for O(1) average-time lookup.
// For each number, check if its previous number (num - 1) exists.
// If it does not exist, the current number is the start of a
// consecutive sequence.
// Then keep checking num + 1, num + 2, etc. and count the sequence.

// Time Complexity:
// O(n)
//
// Space Complexity:
// O(n)

public class LongestConsecutiveSequence {

    public static int longestConsecutive(int[] nums) {

        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }

        int longest = 0;

        for (int num : set) {

            // Check if num is the start of a sequence
            if (!set.contains(num - 1)) {

                int current = num;
                int count = 1;

                // Find consecutive numbers
                while (set.contains(current + 1)) {
                    current++;
                    count++;
                }

                longest = Math.max(longest, count);
            }
        }

        return longest;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int result = longestConsecutive(nums);

        System.out.println("Longest consecutive sequence length: " + result);

        sc.close();
    }
}
