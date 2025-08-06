// Quick Sort in Java
// Quick Sort is a divide-and-conquer algorithm
// Time Complexity: O(n log n) on average, O(n^2) in worst-case (rare)
// Space Complexity: O(log n) due to recursion stack
// It is much faster than bubble/selection/insertion sort for large data

package sorting.com;

public class QuickSort {

    // Main QuickSort method (recursive)
    public static void QuickSort(int[] ar, int low, int high) {
        if (low < high) {
            // Get the partition index where pivot is placed correctly
            int pi = partition(ar, low, high);

            // Recursively sort left subarray
            QuickSort(ar, low, pi - 1);

            // Recursively sort right subarray
            QuickSort(ar, pi + 1, high);
        }
    }

    // Partition method to place pivot in correct position
    private static int partition(int[] ar, int low, int high) {
        int pivot = ar[high]; // Last element as pivot
        int i = low - 1;      // Pointer for smaller element

        // Traverse from low to high - 1
        for (int j = low; j < high; j++) {
            if (ar[j] < pivot) {
                i++;

                // Swap ar[i] and ar[j]
                int temp = ar[i];
                ar[i] = ar[j];
                ar[j] = temp;
            }
        }

        // Swap pivot with the element at i+1
        int temp = ar[i + 1];
        ar[i + 1] = ar[high];
        ar[high] = temp;

        // Return the pivot index
        return i + 1;
    }

    // Main method
    public static void main(String[] args) {
        int[] ar = {5, 6, 2, 3, 1, 8, 4};

        // Call QuickSort on the array
        QuickSort(ar, 0, ar.length - 1);

        // Print the sorted array
        for (int num : ar) {
            System.out.print(num + " ");
        }
    }
}
