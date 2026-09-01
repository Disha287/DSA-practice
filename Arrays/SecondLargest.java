package Arrays;

import java.util.*;

// Problem:
// Find the second largest distinct element in an array.

// Example:
// Input:
// 6
// 10 5 20 8 20 15
//
// Output:
// 15

// Approach:
// Traverse the array once while maintaining two variables:
// largest and secondLargest.
// If the current element is greater than largest, update both values.
// Otherwise, if it is distinct from largest and greater than
// secondLargest, update secondLargest.

// Time Complexity:
// O(n)

// Space Complexity:
// O(1)

public class SecondLargest {

    public static void findSecondLargest(int[] arr) {

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];

            } else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }

        System.out.println(secondLargest);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        findSecondLargest(arr);

        sc.close();
    }
}