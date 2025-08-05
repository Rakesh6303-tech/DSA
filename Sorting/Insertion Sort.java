// "Insertion Sort in Java"
// "Insertion Sort is a simple comparison-based sorting algorithm"
// "Time Complexity: Best - O(n), Worst - O(n^2), Average - O(n^2)"
// "Space Complexity: O(1) – In-place sorting"
// "Efficient for small or nearly sorted datasets"

public class Insetion {
  public static void main(String[] args) {

    int ar[] = {3, 2, 5, 1, 7}; // "Input array to be sorted"
    int size = ar.length;

    // "Print the original array before sorting"
    System.out.println("Before Sorting");
    for (int num : ar) {
      System.out.print(num + " ");
    }
    System.out.println();

    // "Insertion Sort logic starts here"
    for (int i = 1; i < size; i++) {

      int key = ar[i];         // "Take current element as key"
      int j = i - 1;

      // "Move elements of the sorted part greater than key one position ahead"
      while (j >= 0 && ar[j] > key) {
        ar[j + 1] = ar[j];     // "Shifting element to the right"
        j--;
      }

      // "Place key at its correct position"
      ar[j + 1] = key;

      // " Internal Process working Print array after each pass to show sorting progress"
      // for (int num : ar) {
      //   System.out.print(num + " ");
      // }
      // System.out.println();
    }

    // "Print the sorted array"
    System.out.println();
    System.out.println("After Sorting");
    for (int num : ar) {
      System.out.print(num + " ");
    }
  }
}
