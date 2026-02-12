package classes;

import java.util.Scanner;

public class ArrayParameter {

	//Write a program where constructor takes array as parameter.
	public int[] arr;	
	
	Scanner sc = new Scanner(System.in);
	
	public ArrayParameter(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print("Enter value at "+i+" index = ");
			arr[i] = sc.nextInt();
		}
		System.out.println("Exit..");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter size = ");
		int size = s.nextInt();
		int[] arr = new int[size];
		ArrayParameter arrP = new ArrayParameter(arr);
	}

}
