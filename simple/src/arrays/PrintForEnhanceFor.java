package arrays;

public class PrintForEnhanceFor {

	public static void main(String[] args) {
		/*Print array elements using:
		for loop
		enhanced for loop*/
		
		int[] arr3 = {1,2,3};
		
		for (int i = 0; i < arr3.length; i++) {
			System.out.print(arr3[i]+" ");
		}
		
		System.out.println("\n");
		
		for(int i : arr3) {
			System.out.print(i+" ");
		}

	}

}
