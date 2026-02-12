package twoDArray;

import java.util.Scanner;

public class MaxRowSum {

	public static void main(String[] args) {
		
				//Find the row with maximum sum.
		
				Scanner sc = new Scanner(System.in);
				System.out.print("Enter row size = ");
				int row = sc.nextInt();
				
				System.out.println("Enter col size = ");
				int col = sc.nextInt();
				
				int[][] arr = new int[row][col];
				int[] rowSum = new int[row];
				int max = Integer.MIN_VALUE;
				int inx = -1;
				
				for (int i = 0; i < row; i++) {
					for (int j = 0; j < col; j++) {
						System.out.print("Enter value = ");
						arr[i][j] = sc.nextInt();
					}
				}
				
				System.out.println("Printing Elements in Original mannar:");
				for (int i = 0; i < row; i++) {
					int sum = 0;
					for (int j = 0; j < col; j++) {
						System.out.print(arr[i][j]+" ");
						sum += arr[i][j];
					}
					rowSum[i] = sum;
					System.out.println();
				}
				
				for (int i = 0; i < rowSum.length; i++) {
					if(max < rowSum[i]) {
						max = rowSum[i];
						inx = i;
					}
				}
				
				System.out.println((inx+1)+" is the row with maximum sum ("+max+").");

	}

}
