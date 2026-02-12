package arrays;

public class AvgArrEle {

	public static void main(String[] args) {
		
		// Find the average of array elements.
		int[] arr = {1,2,3,4,5};
		
		double avg = 0;
		
		int sum = 0;
		
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		
		avg = sum/arr.length;
		
		System.out.println(avg);

	}

}
