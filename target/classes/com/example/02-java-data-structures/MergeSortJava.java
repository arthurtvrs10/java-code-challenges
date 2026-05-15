public class MergeSortJava {

    /**
     * Sorts the given array using merge sort.
     */
    public void mergeSort(int[] array) {
        // stop condition
        if (array.length <= 1) {
            return;
        }

        int middle = array.length / 2;

        // ---------- left-hand side ----------
        int[] left = new int[middle];
        for (int i = 0; i < middle; i++) {
            left[i] = array[i];
        }

        // ---------- right-hand side ----------
        int[] right = new int[array.length - middle];
        for (int i = middle; i < array.length; i++) {
            right[i - middle] = array[i];
        }

        // recursion
        mergeSort(left);
        mergeSort(right);

        // merge
        merge(array, left, right);
    }

    /**
     * Merges two sorted arrays (left and right) into the original array.
     */
    public void merge(int[] array, int[] left, int[] right) {
        int i = 0;  // index for left array
        int j = 0;  // index for right array
        int k = 0;  // index for the original array

        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                array[k] = left[i];
                i++;
            } else {
                array[k] = right[j];
                j++;
            }
            k++;
        }

        // copy remaining elements from left, if any
        while (i < left.length) {
            array[k] = left[i];
            i++;
            k++;
        }

        // copy remaining elements from right, if any
        while (j < right.length) {
            array[k] = right[j];
            j++;
            k++;
        }
    }
}