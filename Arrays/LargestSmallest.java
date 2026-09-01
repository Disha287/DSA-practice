package Arrays;

import java.util.*;

// Problem:
// Find the largest and smallest element in an array.

// Example:
// Input:
// 5
// 10 25 3 78 12
//
// Output:
// largest 78 smallest 3

// Approach:
// Traverse the array once while maintaining two variables:
// one for the largest element and one for the smallest element.
// Update them whenever a larger or smaller element is found.

// Time Complexity:
// O(n)

// Space Complexity:
// O(1)

public class LargestSmallest {

    public static void findLargestSmallest(int[] arr) {

        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > largest) {
                largest = arr[i];
            }

            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }

        System.out.println("largest " + largest + " smallest " + smallest);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        findLargestSmallest(arr);

        sc.close();
    }
}