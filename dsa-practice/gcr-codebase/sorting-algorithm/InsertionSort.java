// Insertion Sort is a simple comparison-based sorting algorithm that:
//
// Builds the sorted array one element at a time
// Takes one element and inserts it into its correct position
// Similar to how we sort playing cards in our hand
//
// ✔ Stable
// ✔ In-place (no extra memory)
// ✔ Adaptive (fast for nearly sorted arrays)
// ❌ Not efficient for large datasets
//
//
// When the array has 0 or 1 element, it is already sorted
//
//
// Case                Time
// Best Case        O(n)        → when array is already sorted
// Average Case     O(n²)
// Worst Case       O(n²)       → when array is reverse sorted
//
//
// Space Complexity: O(1) → no extra space used
//
//
// Why Insertion Sort is stable?
// → Equal elements are not swapped unnecessarily, so order is preserved
//
//
// Why Insertion Sort is efficient for small inputs?
// → Minimal comparisons and shifts
//
//
// Real-life analogy:
// → Sorting cards in hand by picking one card and placing it correctly



public class InsertionSort {

    static void insertionSort(int[] arr) {
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {9, 5, 1, 4, 3};

        insertionSort(arr);
        printArray(arr);
    }
}
