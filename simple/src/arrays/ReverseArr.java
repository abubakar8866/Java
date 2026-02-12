package arrays;

public class ReverseArr {

	public static void main(String[] args) {
		
		// Reverse a 1-D array.
		int[] arr = {1,2,3,4,5,6,9,7,3};
		int n = arr.length;
		int median = n/2;
		
		for (int i = 0; i < median; i++) {
			int temp = arr[i];
			arr[i] = arr[n-1-i];
			arr[n-1-i] = temp;
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}

	}

}
