package abubakar;

import java.util.Scanner;

public class Pyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int c = 1;
		
		System.out.println("Enter value = ");
		 
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();

		for(int i = 1;i<=n;i++) {
			
			for(int sp = n;sp >i;sp--) {
				System.out.print(" ");
			}
			
			for(int j = 1;j<=c;j++) {
				System.out.print("*");
			}
			c += 2;
			
			System.out.println();
			
		}
		
		sc.close();
		
	}

}
