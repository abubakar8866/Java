package classes;

public class FindMaximum {
	
	public static int findMaximum(int[] arr) {
		
		if(arr.length == 0) return -1;
		
		if(arr.length == 1) return arr[0];
		
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		
		return max;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,6,4,5};
		//int[] arr = {1};
		
		System.out.println(findMaximum(arr));
	}

}
