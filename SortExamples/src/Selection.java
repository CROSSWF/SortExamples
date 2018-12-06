
public class Selection<T extends Comparable<T>> extends Sort<T> {

	@Override
	public void sort(T[] nums) {
		// TODO Auto-generated method stub
		int N = nums.length;
		for(int i = 0;i < N;i++) {
			int min = i;
			for(int j = i;j < N;j++)
				if(less(nums[j],nums[min]))
					min = j;
			swap(nums,i,min);
		}
	}

}
