package searching.com;

/*
 * Binary Search is a Searching Algorithm.
 * Time Complexity: O(log n)
 * Binary Search is more efficient compared to Linear Search,
 * especially for large, sorted arrays.
 * 
 * Procedure:
 * 1) Ensure the array is sorted.
 * 2) Use the formula: mid = left + (right - left) / 2 (to avoid overflow).
 * 3) Compare the target with the mid element.
 *    - If equal, return index.
 *    - If target > mid, search in the right half.
 *    - If target < mid, search in the left half.
 */

public class BinarySearch {

    public static void main(String[] args) {
        // Step 1: Define a sorted array
        int nums[] = {5, 7, 9, 11, 13};
        
        // Step 2: Define the target element to search
        int target = 11;
        
        // Step 3: Call the BinarySearch method and store result (index or -1)
        int result = BinarySearch(nums, target);
        
        // Step 4: Display output based on result
        if (result != -1)
            System.out.println("Element Found at index: " + result);
        else
            System.out.println("Element not Found");
    }

    // Static method to perform Binary Search
    static int BinarySearch(int nums[], int target) {
        int left = 0; // Starting index
        int right = nums.length - 1; // Ending index
        
        // Repeat until search space is exhausted
        while (left <= right) {
            // Calculate mid index safely
            int mid = (left + right) / 2;

            // Print the current state (for understanding)
            System.out.println("Left: " + left + ", Right: " + right + ", Mid: " + mid);

            // If the target is found at mid, return the index
            if (nums[mid] == target) {
                return mid;
            }
            // If the target is greater, ignore the left half
            else if (nums[mid] < target) {
                left = mid + 1;
            }
            // If the target is smaller, ignore the right half
            else {
                right = mid - 1;
            }
        }
        // If the loop ends, target is not found
        return -1;
    }
}
