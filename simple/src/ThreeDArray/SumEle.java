package ThreeDArray;

import java.util.Scanner;

public class SumEle {

	public static void main(String[] args) {
		
		//Find Sum of All Elements

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter layer = ");
		int layer = sc.nextInt();
		
		System.out.print("Enter row = ");
		int row = sc.nextInt();
		
		System.out.print("Enter col = ");
		int col = sc.nextInt();
		
		int[][][] arr = new int[layer][row][col];
		int sum = 0;
		
		for (int i = 0; i < layer; i++) {
			for (int j = 0; j < row; j++) {
				for (int k = 0; k < col; k++) {
					System.out.print("Enter value = ");
					arr[i][j][k] = sc.nextInt();
					sum += arr[i][j][k];
				}
			}
		}
		
		System.out.println("Printing Elements:");		
		for (int i = 0; i < layer; i++) {
			for (int j = 0; j < row; j++) {
				for (int k = 0; k < col; k++) {
					System.out.print(arr[i][j][k]+" ");
				}
				System.out.println();
			}
			System.out.println();
		}
		
		System.out.println("Sum = "+sum);
		
	}

}
