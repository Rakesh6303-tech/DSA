// Selection Sort in Java
// Selection Sort is a simple comparison-based sorting algorithm
// Time Complexity: O(n^2)
// Space Complexity: O(1) – In-place sorting
// Not very efficient for large datasets, but easy to understand and implement

import java.util.*;

public class SelectionSort {
  public static void main(String args[]) {
    int nums[] = {6, 5, 2, 8, 9, 4};
    int size = nums.length;
    int minIndex = -1;
    int temp = 0;

    // Print the original array
    System.out.println("Before Sorting");
    for (int num : nums) {
      System.out.print(num + " ");
    }
    System.out.println();

    // Selection Sort Logic
    for (int i = 0; i < size - 1; i++) {
      minIndex = i; // Assume current index has the smallest value

      // Find the index of the smallest element in the remaining array
      for (int j = i + 1; j < size; j++) {
        if (nums[minIndex] > nums[j]) {
          minIndex = j;
        }
      }

      // Swap the smallest element with the current index
      temp = nums[minIndex];
      nums[minIndex] = nums[i];
      nums[i] = temp;

      // Print array after each pass (Internal Process)
      for (int num : nums) {
        System.out.print(num + " ");
      }
      System.out.println();
    }

    // Print the sorted array
    System.out.println();
    System.out.println("After Sorting");
    for (int num : nums) {
      System.out.print(num + " ");
    }
  }
}
