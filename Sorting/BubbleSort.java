// Bubble Sort in Java
// Bubble sort is a simple sorting algorithm.
// It is easy to understand but not very efficient for large datasets.
// Time Complexity: O(n^2)

import java.util.*;

public class BubbleSort {
  public static void main(String[] args) {
    int nums[] = {6, 5, 2, 8, 9, 4};
    int size = nums.length;
    
    System.out.println("Before Sorting:");
    for (int num : nums) {
      System.out.print(num + " ");
    }

    // Bubble Sort Logic
    for (int i = 0; i < size; i++) {
      for (int j = 0; j < size - i - 1; j++) {
        // Compare and swap adjacent elements if needed
        if (nums[j] > nums[j + 1]) {
          int temp = nums[j];
          nums[j] = nums[j + 1];
          nums[j + 1] = temp;
        }
      }
      // Uncomment below to see the internal state after each pass
      // System.out.println();
      // for (int num : nums) {
      //   System.out.print(num + " ");
      // }
    }

    System.out.println("\nAfter Sorting:");
    for (int num : nums) {
      System.out.print(num + " ");
    }
  }
}
