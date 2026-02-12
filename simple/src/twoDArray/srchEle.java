package twoDArray;

import java.util.Scanner;

public class srchEle {

	public static void main(String[] args) {
		
		//Search a given element in a 2-D array.
		
				Scanner sc = new Scanner(System.in);
				System.out.print("Enter row size = ");
				int row = sc.nextInt();
				
				System.out.println("Enter col size = ");
				int col = sc.nextInt();
				
				int[][] arr = new int[row][col];
				int ele = 2;
				boolean rsl = false;
				
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
				
				for (int i = 0; i < row; i++) {
					for (int j = 0; j < col; j++) {
						if(ele == arr[i][j]) {
							rsl = true;
						}
					}
					System.out.println();
				}
				
				System.out.println((rsl) ? ele+" is found." : ele+" is not found.");

	}

}
