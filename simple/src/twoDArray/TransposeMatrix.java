package twoDArray;

import java.util.Scanner;

public class TransposeMatrix {

	public static void main(String[] args) {
		
		// Print the transpose of a matrix.		
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
		
		System.out.println("Printing Elements in Original mannar:");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("Printing Elements in Transpose mannar:");
		for (int i = 0; i < col; i++) {
			for (int j = 0; j < row; j++) {
				System.out.print(arr[j][i]+" ");
			}
			System.out.println();
		}
		
	}

}
