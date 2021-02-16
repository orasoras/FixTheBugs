import java.util.ArrayList;
import java.util.Random;

public class QuickSort {
	
	private static ArrayList<Integer> inputArray = new ArrayList<Integer>();
	
	public QuickSort(ArrayList<Integer> inputArray) {
		QuickSort.inputArray = inputArray;
	}
	
	public void startQuickSort(int start, int end) {
		int q;
		if(start < end) {
			q = partition(start, end);
			startQuickSort(start, q);
			startQuickSort(q + 1, end);
		}
	}
	
	public ArrayList<Integer> getSortedArray(){
		return QuickSort.inputArray;
	}

	
	//finding the random number from a given range
	static int nextIntInRange(int min, int max, Random r) {
		if(min > max) {
			throw new IllegalArgumentException("invalid range");
		}
		
		int diff = max - min;
		if(diff >= 0 && diff != Integer.MAX_VALUE) {
			return (min + r.nextInt(diff + 1));
		}
		
		int i;
		do {
			i = r.nextInt();
		}while (i < min || i> max);
		
		return i;
	}
	private int partition(int start, int end) {
		int begin = start;
		int length = end;
		
		Random r = new Random();
		int pivotIndex = nextIntInRange(start,end,r);
		int pivot = inputArray.get(pivotIndex);
		
		while(true) {
			while(inputArray.get(length) > pivot && length > start) {
				length--;
			}
			
			while(inputArray.get(begin) < pivot && begin < end) {
				begin++;
			}
			
			if(begin < length) {
				int temp;
				temp = inputArray.get(begin);
				inputArray.set(begin,  inputArray.get(length));
				inputArray.set(length, temp);
				length--;
				begin++;
			}
			
			else {
				return length;
			}
		}// end outer while loop
		
	}	

}
