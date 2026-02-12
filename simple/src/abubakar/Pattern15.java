package abubakar;

import java.util.Scanner;

public class Pattern15 {

	public static void main(String[] args) {
		System.out.print("Enter value = ");
		 
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int c = 2;
		int d = (n*2)-2;
		
		for(int i=1;i<=n;i++) {			
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			for(int sp=1;sp<=d;sp++) {
				System.out.print(" ");
			}
			d -= 2;
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=1;i<=n-1;i++) {			
			for(int j=n-1;j>=i;j--) {
				System.out.print("*");
			}
			for(int sp=1;sp<=c;sp++) {
				System.out.print(" ");
			}
			c += 2;
			for(int j=n-1;j>=i;j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();
	}

}
