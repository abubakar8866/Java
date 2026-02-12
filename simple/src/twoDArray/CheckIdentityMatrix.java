package twoDArray;

import java.util.Scanner;

public class CheckIdentityMatrix {

	public static void main(String[] args) {
		
		// Check whether a matrix is an identity matrix.
		
				Scanner sc = new Scanner(System.in);
				System.out.print("Enter row1 size = ");
				int row1 = sc.nextInt();
				
				System.out.println("Enter col1 size = ");
				int col1 = sc.nextInt();
				
				int[][] arr1 = new int[row1][col1];
				
				if(row1 != col1) {
					System.out.println("Not an Identity Matrix.");
					return;
				}
				
				for (int i = 0; i < row1; i++) {
					for (int j = 0; j < col1; j++) {
						System.out.print("Enter value = ");
						arr1[i][j] = sc.nextInt();
					}
				}
				
				System.out.println("Printing Elements of Array1:");
				for (int i = 0; i < row1; i++) {
					for (int j = 0;j < col1; j++) {
						System.out.print(arr1[i][j]+" ");
					}
					System.out.println();
				}
				
				for (int i = 0; i < row1; i++) {
					for(int j =0;j< col1; j++) {
						if(i == j && arr1[i][j] != 1) {
							System.out.println("Not an Identity Matrix.");
							return;
						}else if(i != j && arr1[i][j] != 0) {
							System.out.println("Not an Identity Matrix.");
							return;
						}
					}
				}
				
				System.out.println("Identity Matrix.");
				
	}

}
