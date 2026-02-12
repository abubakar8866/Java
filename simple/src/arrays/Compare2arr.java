package arrays;

public class Compare2arr {

	public static void main(String[] args) {
		// Compare two arrays for equality.
		int[] arr1 = {1,2,3,4};
		int[] arr2 = {1,2,3,4};
		boolean isEqual = true;
		
		if(arr1.length != arr2.length) {
			isEqual = false;
		}else {
			for(int i=0;i<arr1.length;i++) {
				if(arr1[i] !=arr2[i]) {
					isEqual = false;
					break;
				}
			}
		}
		
		System.out.println((isEqual) ? "arr1 and arr2 are equal." : "arr1 and arr2 are not equal with each other.");
		
				
	}

}
