package arrays;

public class secsmlEle {

	public static void main(String[] args) {
		// Find the second smallest element.		
		int[] arr = {11,12,3,4};
		int smallest = Integer.MAX_VALUE;
		int secondSmallest = Integer.MAX_VALUE;
		
		for (int i = 0; i < arr.length; i++) {
			if(smallest > arr[i] && arr[i] != secondSmallest) {
				secondSmallest = smallest;
				smallest = arr[i];
			}else if(secondSmallest > arr[i] && secondSmallest > smallest) {
				secondSmallest = arr[i];
			}
		}
		
		System.out.println("Second smallest element = "+secondSmallest);
		System.out.println("Smallest element = "+smallest);

	}

}
