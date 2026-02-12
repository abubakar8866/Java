package classes;

import java.util.Scanner;

public class CheckPrimeNumber {
	
	public static boolean isPrime(int n) {
		if(n <= 1) {
			return false;
		}
		
		for(int i=2;i*i<=n;i++) {
			if(n % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static void findPrimeNumber(int[] arr) {
		
		if(arr.length == 0) {System.out.println("Nothing to find."); return;}
		
		int primeCount = 0,nonPrimeCount = 0;
		
		
		for (int i = 0; i < arr.length; i++) {
			if(isPrime(arr[i])) {
				primeCount++;
			}else {
				nonPrimeCount++;
			}
		}
		
		int[] prime = new int[primeCount];
		int[] nonPrime = new int[nonPrimeCount];
		
		int p=0,n = 0;
		
		for (int i = 0; i < arr.length; i++) {
			if(isPrime(arr[i])) {
				prime[p++] = arr[i];
			}else {
				nonPrime[n++] = arr[i];
			}
		}
		
		if(prime.length > 0) {
			System.out.println("Printing Prime Numbers:");
			for (int i = 0; i < prime.length; i++) {
				System.out.print(prime[i]+" ");
			}
			System.out.println("Count = "+primeCount+"\n");
		}else {
			System.out.println("No prime number is found.");
		}
		
		if(nonPrime.length > 0) {
			System.out.println("Printing Non Prime Numbers:");
			for (int i = 0; i < nonPrime.length; i++) {
				System.out.print(nonPrime[i]+" ");
			}
			System.out.println("Count = "+nonPrimeCount+"\n");
		}else {
			System.out.println("No non-prime number is found.");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] arr = {1,2,3,4,5,6,7,8,9};
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size = ");
		int size = sc.nextInt();
		
		int[] arr = new int[size];
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print("Enter value = ");
			arr[i] = sc.nextInt();
		}
		findPrimeNumber(arr);
	}

}
