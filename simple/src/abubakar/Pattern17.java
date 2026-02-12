package abubakar;

import java.util.Scanner;

public class Pattern17 {

	public static void main(String[] args) {
		System.out.print("Enter value = ");
		 
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i=1;i<=n;i++) {			
			for(int j=1;j<=i;j++) {
				if(i==j || j==1 || i==n) {					
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		sc.close();
	}

}
