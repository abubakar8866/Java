package twoDArray;

import java.util.Scanner;

public class CheckEqual {

	public static void main(String[] args) {
		
		//Check whether two 2-D arrays are equal or not.
		
				Scanner sc = new Scanner(System.in);
				System.out.print("Enter row size = ");
				int row = sc.nextInt();
				
				System.out.println("Enter col size = ");
				int col = sc.nextInt();
				
				int[][] arr = new int[row][col];
				int[][] arr2 = new int[row][col];
				boolean rsl = true;
				
				for (int i = 0; i < row; i++) {
					for (int j = 0; j < col; j++) {
						System.out.print("Enter value = ");
						arr[i][j] = sc.nextInt();
					}
				}
				
				System.out.println("Printing Elements in Original mannar of arr:");
				for (int i = 0; i < row; i++) {
					for (int j = 0; j < col; j++) {
						System.out.print(arr[i][j]+" ");
					}
					System.out.println();
				}
				
				for (int i = 0; i < row; i++) {
					for (int j = 0; j < col; j++) {
						System.out.print("Enter value = ");
						arr2[i][j] = sc.nextInt();
					}
				}
				
				System.out.println("Printing Elements in Original mannar of arr2:");
				for (int i = 0; i < row; i++) {
					for (int j = 0; j < col; j++) {
						System.out.print(arr2[i][j]+" ");
					}
					System.out.println();
				}
				
				if(arr.length != arr2.length) {
					rsl = false;
				}else {
					for (int i = 0; i < row; i++) {
						for (int j = 0; j < col; j++) {
							if(arr[i][j] != arr2[i][j]) {
								rsl = false;
								break;
							}
						}
					}
				}
				
				System.out.println((rsl) ? "Both Arrays are equal." : "Both are not equal.");

	}

}
