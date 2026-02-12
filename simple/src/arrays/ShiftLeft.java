package arrays;

public class ShiftLeft {

	public static void main(String[] args) {
		
		// Shift array elements left by one position.
		
		int[] arr = {10,2,3,4,5,9,4,8};
		
		int first = arr[0];
		
		for(int i=0;i<arr.length-1;i++) {
			arr[i] = arr[i+1];
		}
		
		arr[arr.length-1] = first; 
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}

	}

}
