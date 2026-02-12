package twoDArray;

import java.util.Scanner;

public class RowCnt {

	public static void main(String[] args) {
		
		// Find the sum of each row of a 2-D array.
		int[] rowCnt = new int[2];
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter row size = ");
		int row = sc.nextInt();
		
		System.out.println("Enter col size = ");
		int col = sc.nextInt();
		
		int[][] arr = new int[row][col];
		
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print("Enter value = ");
				arr[i][j] = sc.nextInt();
			}
		}
		
		for (int i = 0; i < row; i++) {
			int sum = 0;
			for (int j = 0; j < col; j++) {
				sum += arr[i][j];
			}
			rowCnt[i] = sum;
		}
		
		System.out.println("Printing Elements:");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("Printing sum row wise:");
		for (int i = 0; i < rowCnt.length; i++) {
			System.out.print(rowCnt[i]+" ");
		}

	}

}
