// Pick last element as pivot
// Move smaller elements to the left
// Place pivot at its correct index
// Recursively sort left and right partitions

// ⏱ Time Complexity (VERY IMPORTANT)
// Case	Time
// Best	O(n log n)
// Average	O(n log n)
// Worst	O(n²) ❗ (already sorted or reverse sorted)



public class QuickSort {

    static void quickSort(int[] arr, int low, int high) {

        if (low < high) {
            int pivotIndex = partition(arr, low, high);

            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }

    }

    static int partition(int[] arr, int low, int high) {

        int pivot = arr[high]; // last element as pivot
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;

                // swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // place pivot in correct position
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;

    }

    public static void main(String[] args) {

        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        quickSort(arr, 0, arr.length - 1);

        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
