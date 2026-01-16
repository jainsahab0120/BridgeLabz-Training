// Merge Sort is a Divide and Conquer based comparison sorting algorithm that:

// Divides the array into smaller subarrays

// Sorts each subarray recursively

// Merges the sorted subarrays to produce the final sorted array

// ✔ Stable
// ✔ Guaranteed O(n log n)
// ❌ Uses extra memory


// When subarray has 0 or 1 element, it is already sorted


// Case	           Time
// Best Case	O(n log n)
// Average Case	O(n log n)
// Worst Case	O(n log n)


// space complexity: O(n) due to the temporary array used for merging

// Why Merge Sort is stable? → Preserves order

// Why linked list friendly? → No shifting


public class MergeSort {

    // A bookstore maintains a list of book prices in an array
    // here arr is list of book prices 
    

    // recursion 
    static void MergeSort(int[] arr , int left , int right ){

        if(left >= right) return;

        int mid = (left + right) / 2;

        MergeSort(arr , left , mid  );
        MergeSort(arr , mid+1  , right );
        merge(arr , left , mid , right );

    }
    static void merge(int[] arr , int left , int mid , int right ){

         
        int[] temp = new int[right - left + 1];
        int i = left;       
        int j = mid + 1;    
        int k = 0;         

        while (i <= mid && j <= right) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        while (j <= right) {
            temp[k++] = arr[j++];
        }

        for (int idx = 0; idx < temp.length; idx++) {
            arr[left + idx] = temp[idx];
        }

    }


    public static void main(String[] args){

        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        MergeSort(arr , 0 , arr.length -1);
        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

}