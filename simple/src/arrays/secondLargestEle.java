package arrays;

public class secondLargestEle {

	public static void main(String[] args) {
		//Find the second largest element.
		int[] arr = {1,200,3,4,-5,-200,100,75,-75};
		
		int second = Integer.MIN_VALUE;
		int first = Integer.MIN_VALUE;
		
		for (int i = 0; i < arr.length; i++) {
			
			if(first < arr[i] && arr[i] != second) {
				second = first;
				first = arr[i];
			}else if(second < arr[i] && second < first) {
				second = arr[i];
			}
			
		}
		System.out.println("Second largest ele = "+second);
		System.out.println("First largest ele = "+first);
	}

}
