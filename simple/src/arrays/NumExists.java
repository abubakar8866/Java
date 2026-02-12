package arrays;

public class NumExists {

	public static void main(String[] args) {
		
		// Check whether a number exists in the array or not.		
		int[] arr = {1,8,4,0};
		int ele = 8;
		int lastIndex = arr.length-1;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] == ele) {
				System.out.println(ele+" is exists.");
				break;
			}else if((i == lastIndex) && (arr[lastIndex] != ele)) {
				System.out.println(ele+" is not exists.");
			}
		}

	}

}
