package twoDArray;

import java.util.Scanner;

public class CntEle {

	public static void main(String[] args) {
		
		// Count total number of elements in a 2-D array.
		int cnt = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter row size = ");
		int row = sc.nextInt();
		
		System.out.println("Enter col size = ");
		int col = sc.nextInt();
		
		int[][] arr = new int[row][col];
		
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print("Enter value = ");
				arr[i][j] = sc.nextInt();
				cnt ++;
			}
		}
		
		System.out.println(cnt);

	}

}
