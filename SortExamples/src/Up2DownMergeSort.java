
public class Up2DownMergeSort<T extends Comparable<T>> extends MergeSort<T> {

	@Override
	public void sort(T[] nums) {
		// TODO Auto-generated method stub
		aux = (T[]) new Comparable[nums.length];
		
		sort(nums,0,nums.length-1);
		
	}

	private void sort(T[] nums, int l, int h) {
		// TODO Auto-generated method stub
		if(h <= l) return;
		
		int mid = (h + l)/2;
		sort(nums,l,mid);
		sort(nums,mid+1,h);
		merge(nums,l,mid,h);
	}

	
}
