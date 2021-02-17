import java.util.ArrayList;


public class BinarySearch {
	
	private ArrayList<Integer> al = new ArrayList<Integer>();
	
	public BinarySearch(ArrayList<Integer> al) {
		this.al = al;
	}
	
	public boolean startSearching(int value) {
		//create a copy of the original array, so the original wont be sorted 
		ArrayList<Integer> copyAl = new ArrayList<Integer>(al);
		QuickSort quickSort = new QuickSort(copyAl);
    	quickSort.startQuickSort(0, copyAl.size() - 1); 
		
    	
    	int low = 0;
		int high = copyAl.size() - 1;
		while(low <= high) {
			int mid = low + (high - low) / 2;
			if(copyAl.get(mid) == value) {
				return true;
			}
			else if(copyAl.get(mid) < value) {
				low = mid +1;
			}
			else {
				high = mid - 1;
			}
		}
		return false;
	}

	
	
}

