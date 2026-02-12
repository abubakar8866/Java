package twoDArray;

import java.util.Scanner;

public class printLowerTrianguler {

	public static void main(String[] args) {
		
		// Print lower triangular matrix.
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
					}
				}
				
				System.out.println("Printing Elements in Lower trianguler mannar:");
				for (int i = 0; i < row; i++) {
					for (int j = 0;j < col; j++) {
						if(i < j) {
							System.out.print(0+" ");
						}else {
							System.out.print(arr[i][j]+" ");
						}
					}
					System.out.println();
				}
				
	}

}
