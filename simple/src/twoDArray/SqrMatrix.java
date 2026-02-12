package twoDArray;

import java.util.Scanner;

public class SqrMatrix {

	public static void main(String[] args) {
		
		// Check whether a matrix is a square matrix.		
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
				
				System.out.println("Printing Elements:");
				for (int i = 0; i < row; i++) {
					for (int j = 0; j < col; j++) {
						System.out.print(arr[i][j]+" ");
					}
					System.out.println();
				}
				
				int rowCnt = arr.length;
				int colCnt = arr[0].length;
				
				System.out.println((rowCnt == colCnt) ? "Both are sqaure matrix." : "Not a square matrix.");
				
				

	}

}
