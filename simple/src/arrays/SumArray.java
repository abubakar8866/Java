package arrays;

public class SumArray {

	public static void main(String[] args) {
		//Find the sum of all elements in a 1-D array.
		
		int sum = 0;
		int[] arr1 = {1,6};
		
		for(int i=0;i<arr1.length;i++) {
			sum += arr1[i];
		}
		
		System.out.println("Sum = "+sum);

	}

}
