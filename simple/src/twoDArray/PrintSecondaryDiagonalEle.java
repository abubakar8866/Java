package twoDArray;

import java.util.Scanner;

public class PrintSecondaryDiagonalEle {

	public static void main(String[] args) {
		
		//Print secondary diagonal elements.	
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter row size = ");
		int row = sc.nextInt();
		
		System.out.println("Enter col size = ");
		int col = sc.nextInt();
		
		int[][] arr = new int[row][col];
		int n = arr.length;
		
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
		
		System.out.println("Printing Elements in Secondary Diagonal mannar:");
		for (int i = 0; i < row; i++) {
			System.out.print(arr[i][n-1-i]+" ");
		}

	}

}
