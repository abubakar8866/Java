package twoDArray;

import java.util.Scanner;

public class CntAppearance {

	public static void main(String[] args) {
		
		//Count how many times a number occurs in a matrix.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter row size = ");
		int row = sc.nextInt();
		
		System.out.println("Enter col size = ");
		int col = sc.nextInt();
		
		int[][] arr = new int[row][col];
		int ele = 2;
		int cnt = 0;
		
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
					cnt++;
				}
			}
			System.out.println();
		}
		
		System.out.println("Count = "+cnt);

	}

}
