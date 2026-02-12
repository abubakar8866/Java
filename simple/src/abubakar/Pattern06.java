package abubakar;

import java.util.Scanner;

public class Pattern06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter value = ");
		 
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			
			for(int j=n;j>=i;j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=1;i<=n-1;i++) {
					
			for(int j=1;j<=i+1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		sc.close();
	}

}
