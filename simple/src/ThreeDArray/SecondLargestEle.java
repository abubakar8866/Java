package ThreeDArray;

import java.util.Scanner;

public class SecondLargestEle {

	public static void main(String[] args) {
		
		//Find second largest element in a 3D array.

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter layer = ");
		int layer = sc.nextInt();
		
		System.out.print("Enter row = ");
		int row = sc.nextInt();
		
		System.out.print("Enter col = ");
		int col = sc.nextInt();
		
		int[][][] arr = new int[layer][row][col];
		int first = Integer.MIN_VALUE;
		int second = Integer.MIN_VALUE;
		
		for (int i = 0; i < layer; i++) {
			for (int j = 0; j < row; j++) {
				for (int k = 0; k < col; k++) {
					System.out.print("Enter value = ");
					arr[i][j][k] = sc.nextInt();
					if(first < arr[i][j][k] && arr[i][j][k] != second) {
						second = first;
						first = arr[i][j][k];
					}else if(second < arr[i][j][k] && first > arr[i][j][k]) {
						second = arr[i][j][k];
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
		
		System.out.println("Largest Element = "+first);
		System.out.println("Second Largest Element = "+second);
	
	}

}
