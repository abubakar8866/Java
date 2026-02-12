package arrays;

public class IndxFinder {

	public static void main(String[] args) {
		
		// Find the index of a given element.
		int[] arr = {7,90,3,7};
		int ele = 30;
		int inx = -1;
		
		for (int i = 0; i < arr.length; i++) {
			if(ele == arr[i]) {
				inx = i;
			}
		}
		
		System.out.println((inx == -1) ? ele+" is not found." : ele+" is found at "+inx+" index.");

	}

}
