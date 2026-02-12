package ThreeDArray;

import java.util.Scanner;

public class convert3DTo1DArr {

	public static void main(String[] args) {
		
		//Convert a 3D array into a 1D array.

				Scanner sc = new Scanner(System.in);
				
				System.out.print("Enter layer = ");
				int layer = sc.nextInt();
				
				System.out.print("Enter row = ");
				int row = sc.nextInt();
				
				System.out.print("Enter col = ");
				int col = sc.nextInt();
				
				int[][][] arr = new int[layer][row][col];
				int size = layer * row * col;
				int[] arr2 = new int[size];
				int indx = 0;
				
				for (int i = 0; i < layer; i++) {
					for (int j = 0; j < row; j++) {
						for (int k = 0; k < col; k++) {
							System.out.print("Enter value = ");
							arr[i][j][k] = sc.nextInt();
							arr2[indx++] = arr[i][j][k];
						}
					}
				}
				
				System.out.println("Printing 3D Array Elements:");		
				for (int i = 0; i < layer; i++) {
					for (int j = 0; j < row; j++) {
						for (int k = 0; k < col; k++) {
							System.out.print(arr[i][j][k]+" ");
						}
						System.out.println();
					}
					System.out.println();
				}
				
				System.out.println("Printing 1D Array Elements:");		
				for (int i = 0; i < size; i++) {
					System.out.print(arr2[i]+" ");
				}
				
	}

}
