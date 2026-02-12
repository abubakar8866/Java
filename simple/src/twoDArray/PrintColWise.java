package twoDArray;

import java.util.Scanner;

public class PrintColWise {

	public static void main(String[] args) {
		//print col wise matrix.
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
				
				System.out.println("Printing Elements in col wise mannar:");
				for (int j = 0; j < col; j++) {
					for (int i = 0;i < row; i++) {
						System.out.print(arr[i][j]+" ");
					}
					System.out.println();
				}

	}

}
