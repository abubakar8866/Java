package ThreeDArray;

import java.util.Scanner;

public class RevrseEle {

	public static void main(String[] args) {
		
		//Reverse Elements of 3D Array

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter layer = ");
		int layer = sc.nextInt();
		
		System.out.print("Enter row = ");
		int row = sc.nextInt();
		
		System.out.print("Enter col = ");
		int col = sc.nextInt();
		
		int[][][] arr = new int[layer][row][col];
		
		for (int i = 0; i < layer; i++) {
			for (int j = 0; j < row; j++) {
				for (int k = 0; k < col; k++) {
					System.out.print("Enter value = ");
					arr[i][j][k] = sc.nextInt();
				}
			}
		}
		
		System.out.println("Printing Elements of array in reverse order:");		
		for (int i = layer-1; i >= 0; i--) {
			for (int j = row-1; j >= 0; j--) {
				for (int k = col-1; k >= 0; k--) {
					System.out.print(arr[i][j][k]+" ");
				}
				System.out.println();
			}
			System.out.println();
		}
	
	}

}
