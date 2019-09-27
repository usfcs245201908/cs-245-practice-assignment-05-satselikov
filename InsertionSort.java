public class InsertionSort implements SortingAlgorithm {

	public void sort(int[] a) {
		// TODO Auto-generated method stub
		for(int i = 0;i<a.length;i++)
		{
			int temp = a[i];
			int j = i-1;
			while(j>=0 && a[j]>temp)
			{
				a[j+1]= a[j];
				j-=1;
			}
			a[j+1] = temp;
				
		}

	}

}
