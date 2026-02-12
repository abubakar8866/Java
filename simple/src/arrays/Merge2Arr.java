package arrays;

public class Merge2Arr {

	public static void main(String[] args) {
		
		// Merge two arrays into one
		int[] arr1 = {1,2,3,4,5};
		int[] arr2 = {6,7,8,9,10};
		int size = arr1.length + arr2.length;
		int[] arr3 = new int[size];
		int j =0;
		
		for (int i = 0; i < arr3.length; i++) {
			if(i<arr1.length) {
				arr3[i] = arr1[i];
			}else{
				arr3[i] = arr2[j++];
			}
		}
		
		for (int i = 0; i < arr3.length; i++) {
			System.out.print(arr3[i]+" ");
		}
		

	}

}
