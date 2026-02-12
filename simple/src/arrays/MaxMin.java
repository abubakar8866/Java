package arrays;

public class MaxMin {

	public static void main(String[] args) {
		
		// Find the maximum and minimum element in an array.
		int[] arr = {1,2,3,4,-5};
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		
		for (int i = 0; i < arr.length; i++) {
			
			if(max < arr[i]) {
				max = arr[i];
			}
			
			if(min > arr[i]) {
				min = arr[i];
			}
			
		}
		
		System.out.println("Max = "+max+" , Min = "+min);

	}

}
