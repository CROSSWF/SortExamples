
public class QuickSort<T extends Comparable<T>> extends Sort<T>{

	@Override
	public void sort(T[] nums) {
		// TODO Auto-generated method stub
		sort(nums,0,nums.length - 1);
	}

	protected void sort(T[] nums, int l, int h) {
		// TODO Auto-generated method stub
		if(h <= l) return;
		int j = partition(nums,l,h);
		sort(nums,0,j-1);
		sort(nums,j+1,h);
	}

	protected int partition(T[] nums, int l, int h) {
		// TODO Auto-generated method stub
		/* T k = nums[l];
		while(l < h) {
			System.out.println(l + " " + h);

			while(l<h && less(k,nums[h])) h--;
			nums[l] = nums[h]; 
			while(l<h && !less(k,nums[l])) l++;
			nums[h] = nums[l];
		}
		nums[l] = k;

		return l;	*/
		
		 int i = l + 1, j = h;
		    T v = nums[l];
		    while (true) {
		        //while (less(nums[i], v) && i != h) i++;
		        //while (less(v, nums[j]) && j != l) j--;
		        while (!less(v,nums[i]) && i != h) i++;
		        while (!less(nums[j],v) && j != l) j--;
		        if (i >= j)
		            break;
		        swap(nums, i, j);
		    }
		    swap(nums, l, j);
		    return j;
	}

	
}
