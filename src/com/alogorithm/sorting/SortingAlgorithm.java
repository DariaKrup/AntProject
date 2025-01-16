package com.alogorithm.sorting;

public class SortingAlgorithm {

	/**
	 * Sort collection with Bubble Sort algorithm.
	 * 
	 * @param dataCollection
	 *            unsorted collection
	 * @return sorted collection
	 */
	public static int[] sortInBubbleSort(int[] dataCollection) {

		int len = dataCollection.length;
		int key = 0;
		int i = 0;
		for (int j = 1; j < len; j++) {
			key = dataCollection[j];
			i = j - 1;
			while (i >= 0 && dataCollection[i] > key) {
				dataCollection[i + 1] = dataCollection[i];
				i = i - 1;
				dataCollection[i + 1] = key;
			}
		}
		return dataCollection;

	}

	/**
	 * Sort collection with Quick Sort algorithm.
	 * 
	 * @param dataCollection
	 *            unsorted collection of values
	 * @return sorted collection
	 */
	public static int[] sortInQuickSort(int[] dataCollection) {
		int dataLength = dataCollection.length;
		int pivotValue = 0;
		int middleIndex = dataLength / 2;
		int i, leftArrayIndex = 0, rightArrayIndex = 0;
		if (dataLength < 2) {
			return dataCollection;
		} else {
			int[] leftSubArray = new int[dataLength];
			int[] rightSubArray = new int[dataLength];
			int[] sorted = new int[dataLength];
			pivotValue = dataCollection[middleIndex]; // take the most middle value as the pivot value.

			for (i = 0; i < dataLength; i++) {
				if (i != middleIndex) {
					if (dataCollection[i] < pivotValue) { // less values are stored in leftSubArray
						leftSubArray[leftArrayIndex] = dataCollection[i];
						leftArrayIndex++;
					} else { // higher or equal values are stored in rightSubArray
						rightSubArray[rightArrayIndex] = dataCollection[i];
						rightArrayIndex++;
					}
				}
			}

			// Arrays to hold the sorted sub lists
			int[] sortedLeftArray = new int[leftArrayIndex];
			int[] sortedRightArray = new int[rightArrayIndex];

			System.arraycopy(leftSubArray, 0, sortedLeftArray, 0, leftArrayIndex);
			System.arraycopy(rightSubArray, 0, sortedRightArray, 0, rightArrayIndex);

			// Recursive calls to get the sorted list
			sortedLeftArray = sortInQuickSort(sortedLeftArray);
			sortedRightArray = sortInQuickSort(sortedRightArray);

			// constructing the sorted final list from the sub lists
			System.arraycopy(sortedLeftArray, 0, sorted, 0, leftArrayIndex);
			sorted[leftArrayIndex] = pivotValue;
			System.arraycopy(sortedRightArray, 0, sorted, leftArrayIndex + 1, rightArrayIndex);

			return sorted;
		}

	}
}
