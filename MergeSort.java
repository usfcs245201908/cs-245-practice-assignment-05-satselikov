public class MergeSort implements SortingAlgorithm {
	private int[] arr;
	private int[] temp;
	private int length;

	public void sort(int inputArr[]) {
		this.arr = inputArr;
		this.length = inputArr.length;
		this.temp = new int[length];
		sort(0, length - 1);
	}

	private void sort(int low, int high) {

		if (low < high) {
			int mid = low + (high - low) / 2;
			sort(low, mid);
			sort(mid + 1, high);
			merge(low, mid, high);
		}
	}

	private void merge(int low, int mid, int high) {

		for (int i = low; i <= high; i++) {
			temp[i] = arr[i];
		}
		int i = low;
		int j = mid + 1;
		int k = low;
		while (i <= mid && j <= high) {
			if (temp[i] <= temp[j]) {
				arr[k] = temp[i];
				i++;
			} else {
				arr[k] = temp[j];
				j++;
			}
			k++;
		}
		while (i <= mid) {
			arr[k] = temp[i];
			k++;
			i++;
		}

	}
}