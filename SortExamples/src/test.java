
public class test {
	
	public static void main(String[] args) {
		Integer[] a = { 3, 4, 5, 2, 1, 3, 6 , 2};
		//Selection<Integer> sort = new Selection<>();
		//Bubble<Integer> sort = new Bubble<>();
		//Insertion<Integer> sort = new Insertion<>();
		//Shell<Integer> sort = new Shell<>();
		//Up2DownMergeSort<Integer> sort = new Up2DownMergeSort<>();
		//Down2UpMergeSort<Integer> sort = new Down2UpMergeSort<>();
		//QuickSort<Integer> sort = new QuickSort<>();
		ThreeWayQuickSort<Integer> sort = new ThreeWayQuickSort<>();

		sort.sort(a);
		for(int t:a) {
			System.out.print(t + " ");
		}
	}
}
