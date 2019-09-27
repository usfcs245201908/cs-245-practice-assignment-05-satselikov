public class QuickSort implements SortingAlgorithm {

	private int arr[];
	private int length;

	public void sort(int[] inputArr) {

		if (inputArr == null || inputArr.length == 0) {
			return;
		}
		this.arr = inputArr;
		length = inputArr.length;
		quickSort(0, length - 1);
	}

	private void quickSort(int low, int high) {

		int i = low;
		int j = high;
		int p = arr[low + (high - low) / 2];
		while (i <= j) {
			while (arr[i] < p) {
				i++;
			}
			while (arr[j] > p) {
				j--;
			}
			if (i <= j) {
				swap(i, j);
				i++;
				j--;
			}
		}
		if (low < j)
			quickSort(low, j);
		if (i < high)
			quickSort(i, high);
	}

	private void swap(int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

}
