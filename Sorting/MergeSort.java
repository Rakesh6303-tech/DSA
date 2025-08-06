// Merge Sort in Java
// -------------------
// Merge Sort is a divide-and-conquer sorting algorithm.
// It recursively divides the array into two halves, sorts them individually,
// and then merges the two sorted halves back together.
// 
// Time Complexity: O(n log n) in all cases (best, average, worst)
// Space Complexity: O(n) – requires additional space for temporary arrays
// Stable Sort: Yes (maintains the relative order of equal elements)
// Not an in-place sort (uses extra space)
// Suitable for large datasets

package sorting.com;

public class MergeSort {

    // Recursive function to divide and sort the array
	public static void MergeSort(int ar[], int l, int r) {
		if (l < r) {
			// To find mid Value
			int mid = (l + r) / 2;

			// Recursively divide Part-1 array
			MergeSort(ar, l, mid);

			// Recursively divide Part-2 array
			MergeSort(ar, mid + 1, r);

			// Merge the two sorted parts
			Merge(ar, l, mid, r);
		}
	}

    // Function to merge two sorted subarrays into a single sorted array
	private static void Merge(int[] ar, int l, int mid, int r) {
		// Size of first and second subarrays
		int n1 = mid - l + 1;
		int n2 = r - mid;

		// Temporary arrays to hold the divided parts
		int larr[] = new int[n1];
		int rarr[] = new int[n2];

		// Copying elements into left array
		for (int x = 0; x < n1; x++) {
			larr[x] = ar[l + x];
		}

		// Copying elements into right array
		for (int x = 0; x < n2; x++) {
			rarr[x] = ar[mid + 1 + x];
		}

		// Initial indexes for left, right, and merged array
		int i = 0; // Index for left array
		int j = 0; // Index for right array
		int k = l; // Index for main array

		// Compare elements and merge into original array in sorted order
		while (i < n1 && j < n2) {
			if (larr[i] <= rarr[j]) {
				ar[k] = larr[i];
				i++;
			} else {
				ar[k] = rarr[j];
				j++;
			}
			k++;
		}

		// Copy remaining elements from left array, if any
		while (i < n1) {
			ar[k] = larr[i];
			i++;
			k++;
		}

		// Copy remaining elements from right array, if any
		while (j < n2) {
			ar[k] = rarr[j];
			j++;
			k++;
		}
	}

	public static void main(String[] args) {
		int[] ar = { 3, 5, 1, 4, 6, 2 };

		// Print original array
		System.out.println("Before Sorting:");
		for (int a : ar) {
			System.out.print(a + " ");
		}
		System.out.println();

		// Call merge sort
		MergeSort(ar, 0, ar.length - 1);

		// Print sorted array
		System.out.println("After Sorting:");
		for (int a : ar) {
			System.out.print(a + " ");
		}
	}
}
