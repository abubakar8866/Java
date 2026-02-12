package twoDArray;

import java.util.Scanner;

public class LargestEle {

	public static void main(String[] args) {
		
		// Find the largest element in a 2-D array.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter row size = ");
		int row = sc.nextInt();
		
		System.out.println("Enter col size = ");
		int col = sc.nextInt();
		int max = Integer.MIN_VALUE;
		
		int[][] arr = new int[row][col];
		
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print("Enter value = ");
				arr[i][j] = sc.nextInt();
				if(max < arr[i][j]) {
					max = arr[i][j];
				}
			}
		}
		
		System.out.println("Printing Elements:");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("Max = "+max);

	}

}
