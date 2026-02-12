package arrays;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter size = ");
		
		int size = sc.nextInt();
		
		int[] arr1 = new int[size];
		
		for(int i=0;i<size;i++) {
			arr1[i] = sc.nextInt();
		}
		
		for(int i=0;i<size;i++) {
			System.out.print(arr1[i]+" ");
		}
		
	}

}
