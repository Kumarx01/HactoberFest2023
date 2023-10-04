import java.io.*;

class BubbleSort {
	
	void bubbleSort(int arr[])
	{
		int i, j, temp;
		boolean swapped;
		for (i = 0; i < arr.length - 1; i++) {
			swapped = false;
			for (j = 0; j < arr.length - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					swapped = true;
				}
			}

			if (swapped == false)
				break;
		}
	}

	void printArray(int arr[])
	{
		int i;
		for (i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

	public static void main(String args[])
	{
	BubbleSort sort = new BubbleSort();
		int arr[] = { 64, 34, 25, 12, 22, 11, 90 };
		
		sort.bubbleSort(arr);
		System.out.println("Sorted array: ");
		sort.printArray(arr);
	}
}
