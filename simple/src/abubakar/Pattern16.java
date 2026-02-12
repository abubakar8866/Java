package abubakar;

import java.util.Scanner;

public class Pattern16 {

	public static void main(String[] args) {
		System.out.print("Enter value = ");
		 
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int d = 0;
		
		for(int i=1;i<=n;i++) {			
			for(int j=n;j>=i;j--) {
				System.out.print("*");
			}
			for(int sp=1;sp<=d;sp++) {
				System.out.print(" ");
			}
			d += 2;
			for(int j=n;j>=i;j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		d -= 2;
		
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
		sc.close();
	}

}
