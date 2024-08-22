
public class Merge_sort {
	
	
	    // Main method to sort an array
	    public void sort(int arr[]) {
	        if (arr.length < 2) {
	            return;
	        }

	        // Divide the array into two halves
	        int mid = arr.length / 2;
	        int[] left = new int[mid];
	        int[] right = new int[arr.length - mid];

	        // Copy the data into the left and right arrays
	        for (int i = 0; i < mid; i++) {
	            left[i] = arr[i];
	        }
	        for (int i = mid; i < arr.length; i++) {
	            right[i - mid] = arr[i];
	        }

	        // Recursively sort both halves
	        sort(left);
	        sort(right);

	        // Merge the sorted halves
	        merge(arr, left, right);
	    }

	    // Method to merge two subarrays left[] and right[] into arr[]
	    void merge(int[] arr, int[] left, int[] right) {
	        int i = 0, j = 0, k = 0;

	        // Merge elements back into the original array
	        while (i < left.length && j < right.length) {
	            if (left[i] <= right[j]) {
	                arr[k++] = left[i++];
	            } else {
	                arr[k++] = right[j++];
	            }
	        }

	        // Copy remaining elements of left[], if any
	        while (i < left.length) {
	            arr[k++] = left[i++];
	        }

	        // Copy remaining elements of right[], if any
	        while (j < right.length) {
	            arr[k++] = right[j++];
	        }
	    }

	    // Method to print the array
	    public static void printArray(int arr[]) {
	        int n = arr.length;
	        for (int i = 0; i < n; ++i) {
	            System.out.print(arr[i] + " ");
	        }
	        System.out.println();
	    }

	    // Main method to test the algorithm
	    public static void main(String args[]) {
	        int arr[] = {38, 27, 43, 3, 9, 82, 10};

	        System.out.println("Given Array:");
	        printArray(arr);

	        Merge_sort mergeSort = new Merge_sort();
	        mergeSort.sort(arr);

	        System.out.println("Sorted array:");
	        printArray(arr);
	    }
	}



