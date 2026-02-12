package twoDArray;

import java.util.Scanner;

public class SubtractTwoMatrix {

	public static void main(String[] args) {
		
		// Subtraction two matrix.
		
				Scanner sc = new Scanner(System.in);
				System.out.print("Enter row size = ");
				int row = sc.nextInt();
				
				System.out.println("Enter col size = ");
				int col = sc.nextInt();
				
				int[][] arr1 = new int[row][col];
				int[][] arr2 = new int[row][col];
				
				for (int i = 0; i < row; i++) {
					for (int j = 0; j < col; j++) {
						System.out.print("Enter value = ");
						arr1[i][j] = sc.nextInt();
					}
				}
				
				System.out.println("Printing Elements of Array1:");
				for (int i = 0; i < row; i++) {
					for (int j = 0;j < col; j++) {
						System.out.print(arr1[i][j]+" ");
					}
					System.out.println();
				}
				
				for (int i = 0; i < row; i++) {
					for (int j = 0; j < col; j++) {
						System.out.print("Enter value = ");
						arr2[i][j] = sc.nextInt();
					}
				}
				
				System.out.println("Printing Elements of Array2:");
				for (int i = 0; i < row; i++) {
					for (int j = 0;j < col; j++) {
						System.out.print(arr2[i][j]+" ");
					}
					System.out.println();
				}
				
				System.out.println("Printing Elements After Subtraction:");
				for (int i = 0; i < row; i++) {
					for (int j = 0;j < col; j++) {
						System.out.print(arr1[i][j]-arr2[i][j]+" ");
					}
					System.out.println();
				}
				
	}

}
