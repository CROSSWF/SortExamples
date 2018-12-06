
public class Down2UpMergeSort<T extends Comparable<T>> extends MergeSort<T>{

	@Override
	public void sort(T[] nums) {
		// TODO Auto-generated method stub
		int N = nums.length;
		aux = (T[]) new Comparable[N];
		
		for(int size = 1;size < N; size *= 2) {
			for(int lo = 0;lo < N-size; lo+= 2*size) {
				merge(nums,lo,lo+size-1,Math.min(lo + size + size - 1, N - 1));
			}
		}
	}
	
	

}
