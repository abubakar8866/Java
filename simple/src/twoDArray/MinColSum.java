package twoDArray;

import java.util.Scanner;

public class MinColSum {

	public static void main(String[] args) {
		
		//Find the col with minimum sum.
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter row size = ");
		int row = sc.nextInt();

		System.out.print("Enter col size = ");
		int col = sc.nextInt();

		int[][] arr = new int[row][col];
		int[] colSum = new int[col];

		int min = Integer.MAX_VALUE;
		int inx = -1;

		// Input
		for (int i = 0; i < row; i++) {
		    for (int j = 0; j < col; j++) {
		        System.out.print("Enter value = ");
		        arr[i][j] = sc.nextInt();
		    }
		}

		// Print matrix
		System.out.println("Original Matrix:");
		for (int i = 0; i < row; i++) {
		    for (int j = 0; j < col; j++) {
		        System.out.print(arr[i][j] + " ");
		    }
		    System.out.println();
		}

		// Column sum
		for (int j = 0; j < col; j++) {
		    int sum = 0;
		    for (int i = 0; i < row; i++) {
		        sum += arr[i][j];
		    }
		    colSum[j] = sum;

		    if (sum < min) {
		        min = sum;
		        inx = j;
		    }
		}

		// Print column sums
		System.out.println("Column sums:");
		for (int i = 0; i < colSum.length; i++) {
		    System.out.print(colSum[i] + " ");
		}
		System.out.println();

		System.out.println((inx + 1) + " is the column with minimum sum (" + min + ")");

	}

}
