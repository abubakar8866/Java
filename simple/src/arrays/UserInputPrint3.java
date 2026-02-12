package arrays;

import java.util.Scanner;

public class UserInputPrint3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size = ");
		int size = sc.nextInt();
		int[] arr3 = new int[3];
		for (int i = 0; i < size; i++) {
			arr3[i] = sc.nextInt();
		}
		for (int i = 0; i < size; i++) {
			System.out.print(arr3[i]+" ");
		}

	}

}
