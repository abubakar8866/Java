package twoDArray;

import java.util.Scanner;

public class MultiplicationMatrix {

	public static void main(String[] args) {
		
		// Multiplication two matrix.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter row1 size = ");
		int row1 = sc.nextInt();
		
		System.out.println("Enter col1 size = ");
		int col1 = sc.nextInt();
		
		int[][] arr1 = new int[row1][col1];
		
		System.out.print("Enter row2 size = ");
		int row2 = sc.nextInt();
		
		System.out.println("Enter col2 size = ");
		int col2 = sc.nextInt();
		
		int[][] arr2 = new int[row2][col2];
		
		if(row1 != col2) {
			System.out.println("Muliplication not possible.");
			return;
		}
		
		for (int i = 0; i < row1; i++) {
			for (int j = 0; j < col1; j++) {
				System.out.print("Enter value = ");
				arr1[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Printing Elements of Array1:");
		for (int i = 0; i < row1; i++) {
			for (int j = 0;j < col1; j++) {
				System.out.print(arr1[i][j]+" ");
			}
			System.out.println();
		}
		
		for (int i = 0; i < row2; i++) {
			for (int j = 0; j < col2; j++) {
				System.out.print("Enter value = ");
				arr2[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Printing Elements of Array2:");
		for (int i = 0; i < row2; i++) {
			for (int j = 0;j < col2; j++) {
				System.out.print(arr2[i][j]+" ");
			}
			System.out.println();
		}
		
		int[][] mul = new int[row1][col1];
		
		for (int i = 0; i < row1; i++) {
			for (int j = 0;j < col1; j++) {
				for(int k = 0;k < col1;k++) {					
					mul[i][j] += arr1[i][k] * arr2[k][j];
				}
			}
		}
		
		System.out.println("Printing Elements After Multiplication:");
		for (int i = 0; i < row1; i++) {
			for (int j = 0;j < col1; j++) {
				System.out.print(mul[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
