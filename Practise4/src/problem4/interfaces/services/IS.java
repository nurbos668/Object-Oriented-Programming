package problem4.interfaces.services;

import problem4.interfaces.model.SortingService;

public class IS implements SortingService {
	
	@Override
	public void countSort(int[] arr) {
		int[] counts = new int[11];
		
		for (int num : arr) {
			counts[num]++;
		}
		
		int targetIndex = 0;
		
		for (int i = 0; i < counts.length; i++) {
	        while (counts[i] > 0) {
	            arr[targetIndex] = i; 
	            targetIndex++;        
	            counts[i]--;          
	        }
	    }
	}
	
}
