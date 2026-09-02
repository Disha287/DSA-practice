package Arrays;

import java.util.*;

// Problem:
// Remove duplicates from a sorted array in-place and return the number
// of unique elements.

// Example:
// Input:
// 6
// 1 1 2 2 3 3
//
// Output:
// 3
// Array after removing duplicates:
// 1 2 3

// Approach:
// Use two pointers.
// `j` traverses the array, while `i` keeps track of the position
// where the next unique element should be placed.
// Whenever nums[j] is different from the previous element,
// place it at nums[i] and increment i.

// Time Complexity:
// O(n)

// Space Complexity:
// O(1)

public class RemoveDuplicates {

    public static int removeDuplicates(int[] nums) {

        int n = nums.length;

        if (n == 0) {
            return 0;
        }

        int i = 1;

        for (int j = 1; j < n; j++) {

            if (nums[j] != nums[j - 1]) {
                nums[i] = nums[j];
                i++;
            }
        }

        return i;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int k = removeDuplicates(nums);

        System.out.println("Number of unique elements: " + k);

        System.out.print("Array after removing duplicates: ");

        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }

        sc.close();
    }
}