package arrays;

import java.util.Scanner;

public class CntEvnOdd {

	public static void main(String[] args) {
		
		// Count even and odd numbers in an array.
		
		int evnCount = 0;
		int oddCount = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter size = ");
		
		int size = sc.nextInt();		
		
		int[] arr = new int[size];
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print("Enter value at "+i+" index = ");
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Printing ele:");
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]%2==0) {
				evnCount++;
			}else {
				oddCount++;
			}
		}
		
		System.out.println("Even = "+evnCount);
		System.out.println("Odd = "+oddCount);

	}

}
