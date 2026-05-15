public class MergeSortTutorial {
     /**
     * Merges two sorted subarrays of arr[].
     *
     * First subarray:  arr[left .. mid]
     * Second subarray: arr[mid+1 .. right]
     */
    static void merge(int arr[], int left, int mid, int right) {
        // sizes of the two subarrays to be merged
        int leftSize = mid - left + 1;
        int rightSize = right - mid;

        // temporary arrays
        int leftArr[] = new int[leftSize];
        int rightArr[] = new int[rightSize];

        // copy data to temporary arrays
        for (int i = 0; i < leftSize; ++i) {
            leftArr[i] = arr[left + i];
        }
        for (int j = 0; j < rightSize; ++j) {
            rightArr[j] = arr[mid + 1 + j];
        }

        // merge the temporary arrays back into arr[left..right]

        int i = 0;   // index for leftArr
        int j = 0;   // index for rightArr
        int k = left; // index for the main array

        // interleave the two sorted subarrays
        while (i < leftSize && j < rightSize) {
            if (leftArr[i] <= rightArr[j]) {
                arr[k] = leftArr[i];
                i++;
            } else {
                arr[k] = rightArr[j];
                j++;
            }
            k++;
        }

        // copy remaining elements of leftArr, if any
        while (i < leftSize) {
            arr[k] = leftArr[i];
            i++;
            k++;
        }

        // copy remaining elements of rightArr, if any
        while (j < rightSize) {
            arr[k] = rightArr[j];
            j++;
            k++;
        }
    }

    /**
     * Sorts arr[left..right] using mergeSort.
     */
    static void mergeSort(int arr[], int left, int right) {
        if (left < right) {
            // find the middle point
            int mid = left + (right - left) / 2;

            // sort first half
            mergeSort(arr, left, mid);

            // sort second half
            mergeSort(arr, mid + 1, right);

            // merge the sorted halves
            merge(arr, left, mid, right);
        }
    }

    // driver code
    public static void main(String args[]) {
        int arr[] = {38, 27, 43, 10};

        mergeSort(arr, 0, arr.length - 1);

        for (int i = 0; i < arr.length; ++i) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
