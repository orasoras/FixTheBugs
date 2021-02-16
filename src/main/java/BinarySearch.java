import java.util.ArrayList;

public class BinarySearch {
	private ArrayList<Integer> al = new ArrayList<Integer>();
	
	public BinarySearch(ArrayList<Integer> al) {
		this.al = al;
	}
	
	public boolean startSearching(int value) {
		
		QuickSort quickSort = new QuickSort(al);
		
		//sorting the arrayList before start searching
    	        quickSort.startQuickSort(0, al.size() - 1); 
		
    	
    	        int low = 0;
		int high = al.size() - 1;
		while(low <= high) {
			int mid = low + (high - low) / 2;
			if(al.get(mid) == value) {
				return true;
			}
			else if(al.get(mid) < value) {
				low = mid +1;
			}
			else {
				high = mid - 1;
			}
		}
		return false;
	}
}

