package Arrays;



import java.util.*;

// Problem:
// Given an integer array, find all elements that appear more than
// n / 3 times, where n is the size of the array.
//
// There can be at most 2 such elements.
//
// Example:
// Input:
// 8
// 1 1 1 2 2 2 3 3
//
// Output:
// 1 2
//
// Majority elements: 1 and 2

// Approach:
// Use the Boyer-Moore Voting Algorithm.
//
// Since an element must appear more than n / 3 times, there can be
// at most 2 majority elements.
//
// Maintain two candidates (f1, f2) and their vote counts (c1, c2).
// If the current number matches a candidate, increase its count.
// If a candidate has zero votes, replace it with the current number.
// If the current number is different from both candidates, decrease
// both counts because their votes can be cancelled.
//
// After finding the two potential candidates, traverse the array again
// to count their actual frequencies.
// Finally, add the candidates whose frequency is greater than n / 3.
//
// Time Complexity:
// O(n)
//
// Space Complexity:
// O(1)

public class MajorityElementII {

    public static List<Integer> majorityElement(int[] nums) {

        int f1 = 0, f2 = 0;
        int c1 = 0, c2 = 0;

        // Find potential candidates
        for (int num : nums) {

            if (num == f1) {
                c1++;
            }
            else if (num == f2) {
                c2++;
            }
            else if (c1 == 0) {
                f1 = num;
                c1 = 1;
            }
            else if (c2 == 0) {
                f2 = num;
                c2 = 1;
            }
            else {
                c1--;
                c2--;
            }
        }

        // Count actual frequencies
        c1 = 0;
        c2 = 0;

        for (int num : nums) {

            if (num == f1) {
                c1++;
            }
            else if (num == f2) {
                c2++;
            }
        }

        List<Integer> list = new ArrayList<>();

        // Check if candidates actually occur more than n/3 times
        if (c1 > nums.length / 3) {
            list.add(f1);
        }

        if (c2 > nums.length / 3) {
            list.add(f2);
        }

        return list;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        List<Integer> result = majorityElement(nums);

        System.out.println("Majority elements: " + result);

        sc.close();
    }
}
