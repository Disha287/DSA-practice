package Arrays;
// Problem:
// Move all zeroes in an array to the end while maintaining the
// relative order of the non-zero elements.

// Example:
// Input:
// 5
// 0 1 0 3 12
//
// Output:
// 1 3 12 0 0

// Approach:
// Use a pointer `start` to track the position where the next
// non-zero element should be placed.
// Traverse the array and whenever a non-zero element is found,
// swap it with the element at `start` and increment `start`.

// Time Complexity:
// O(n)

// Space Complexity:
// O(1)

import java.util.*;

public class moveZeroes {

    public static void moveZero(int[] nums) {

        int start = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] != 0) {

                int temp = nums[i];
                nums[i] = nums[start];
                nums[start] = temp;

                start++;
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        moveZero(nums);

        for (int i = 0; i < n; i++) {
            System.out.print(nums[i] + " ");
        }

        sc.close();
    }
}