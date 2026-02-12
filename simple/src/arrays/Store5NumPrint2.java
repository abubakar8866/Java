package arrays;

public class Store5NumPrint2 {

	public static void main(String[] args) {
		//Write a program to store 5 numbers in an array and print them.
				int[] arr2 = new int[5];
				int a = 0;
				for(int i=0;i<arr2.length;i++) {
					arr2[i] = ++a;
					System.out.println(arr2[i]);
				}
	}

}
