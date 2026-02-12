package ThreeDArray;

import java.util.Scanner;

public class Boundry3DArr {

	public static void main(String[] args) {
		
		//Print only boundary elements of a 3D array.

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
		
		System.out.println("\nBoundary Elements (Layer-wise):");

		for (int i = 0; i < layer; i++) {

		    System.out.println("Layer " + i + ":");

		    for (int j = 0; j < row; j++) {
		        for (int k = 0; k < col; k++) {

		            if (
		                j == 0 || j == row - 1 ||
		                k == 0 || k == col - 1) {

		                System.out.print(arr[i][j][k] + " ");
		            } else {
		                System.out.print("  "); 
		            }
		        	
		        	//System.out.print(arr[i][j][k]+" ");
		        }
		        System.out.println();
		    }
		    System.out.println();
		}

	
	}

}
