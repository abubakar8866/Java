package arrays;

public class SearchEle {

	public static void main(String[] args) {
		
		// Search an element in an array
		
		int[] arr = {1,2,3,4};
		int ele = 3;
		boolean search = false;
		
		for (int i = 0; i < arr.length; i++) {
			if(ele == arr[i]) {
				search = true;
				break;
			}
		}
		
		System.out.println((search) ? ele+" is found." : ele+" is not found.");

	}

}
