package twoDArray;

import java.util.Scanner;

public class ColCnt {

	public static void main(String[] args) {
		
		// Find the sum of each col of a 2-D array.
				Scanner sc = new Scanner(System.in);
				System.out.print("Enter row size = ");
				int row = sc.nextInt();
				
				System.out.println("Enter col size = ");
				int col = sc.nextInt();
				int[] colCnt = new int[col];
				
				int[][] arr = new int[row][col];
				
				for (int i = 0; i < row; i++) {
					for (int j = 0; j < col; j++) {
						System.out.print("Enter value = ");
						arr[i][j] = sc.nextInt();
					}
				}
				
				int cols = arr[0].length;
				System.out.println(cols);
				
				System.out.println("Printing Elements:");
				for (int i = 0; i < row; i++) {
					int sum = 0;
					for (int j = 0; j < col; j++) {
						System.out.print(arr[i][j]+" ");
					}
					System.out.println();
				}
				
				for (int i = 0; i < col; i++) {
					int sum = 0;
					for (int j = 0; j < row; j++) {
						sum += arr[j][i];
					}
					colCnt[i] = sum;
				}
				
				System.out.println("Printing sum col wise:");
				for (int i = 0; i < colCnt.length; i++) {
					System.out.print(colCnt[i]+" ");
				}

	}

}
