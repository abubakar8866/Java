package ThreeDArray;

import java.util.Scanner;

public class SrchELe {

	public static void main(String[] args) {
		
		// Search an Element
		
				Scanner sc = new Scanner(System.in);
				
				System.out.print("Enter layer = ");
				int layer = sc.nextInt();
				
				System.out.print("Enter row = ");
				int row = sc.nextInt();
				
				System.out.print("Enter col = ");
				int col = sc.nextInt();
				
				int[][][] arr = new int[layer][row][col];
				int ele = 4;
				int[] indx = new int[3];
				boolean isFound = false;
				
				for (int i = 0; i < layer; i++) {
					for (int j = 0; j < row; j++) {
						for (int k = 0; k < col; k++) {
							System.out.print("Enter value = ");
							arr[i][j][k] = sc.nextInt();
							if(arr[i][j][k] == ele) {
								isFound = true;
								indx[0] =i;
								indx[1] =j;
								indx[2] = k;
								break;
							}
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
				
				System.out.println((isFound) ? ele+" is found at layer = "+indx[0]+" ,row = "+indx[1]+",col = "+indx[2] : ele+" is not found.");
				

	}

}
