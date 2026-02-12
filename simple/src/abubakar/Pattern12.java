package abubakar;

import java.util.Scanner;

public class Pattern12 {

	public static void main(String[] args) {
		System.out.print("Enter value = ");
		 
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int c = (n*2)-1;
		
		for(int i=1;i<=n;i++) {
			
			for(int sp=1;sp<i;sp++) {
				System.out.print(" ");
			}
			
			for(int j=1;j<=c;j++) {
				System.out.print("*");
			}
			c -= 2;
			System.out.println();
		}
		
		c = 3;
		
		for(int i=1;i<=n-1;i++) {
			
			for(int sp=n-1;sp>i;sp--) {
				System.out.print(" ");
			}
			
			for(int j=1;j<=c;j++) {
				System.out.print("*");
			}
			c += 2;
			System.out.println();
		}
		sc.close();
	}

}
