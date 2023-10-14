import java.util.*;

public class PancakeSort {
	// Reverses arr[0..i]
	static void flip(int arr[], int i)
	{
		int temp, start = 0;
		while (start < i) {
			temp = arr[start];
			arr[start] = arr[i];
			arr[i] = temp;
			start++;
			i--;
		}
	}

	// Recursive function to sort the array using pancake
	// sort
	static void pancakeSort(int arr[], int n)
	{
		// Base case: If the array is already sorted or has
		// only one element, return
		if (n == 1)
			return;

		// Find the index of the maximum element in the
		// unsorted portion of the array
		int mi = 0;
		for (int i = 0; i < n; i++) {
			if (arr[i] > arr[mi]) {
				mi = i;
			}
		}

		// Move the maximum element to the front of the
		// array if it's not already there
		if (mi != 0) {
			flip(arr, mi);
		}

		// Flip the entire array to move the maximum element
		// to its correct position
		flip(arr, n - 1);

		// Recursively sort the remaining unsorted portion
		// of the array
		pancakeSort(arr, n - 1);
	}

	// Driver program to test above function
	public static void main(String args[])
	{
		int arr[] = { 23, 10, 20, 11, 12, 6, 7 };
		int n = arr.length;

		pancakeSort(arr, n);

		System.out.print("Sorted Array: ");
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}
