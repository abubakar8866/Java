package abubakar;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter value of 1 num = ");
		
		int num1 = sc.nextInt();
		
		System.out.println("Value of num1 = "+num1);
		
		System.out.print("Enter value of 2 num = ");
		
		int num2 = sc.nextInt();
		
		System.out.println("Value of num2 = "+num2);
		
		System.out.println("Enter + for Addition.");
		
		System.out.println("Enter - for Subtraction.");
		
		System.out.println("Enter * for Multiplication.");
		
		System.out.println("Enter / for Division.");
		
		System.out.print("Enter your choice = ");
		
		char ch = sc.next().charAt(0); 
		
		switch(ch){
		
			case '+' :
					System.out.println("Addition of "+num1+" and "+num2+" = "+(num1+num2));
					break;
					
			case '-' :
					System.out.println("Subtraction of "+num1+" and "+num2+" = "+(num1-num2));
					break;
					
			case '*' :
					System.out.println("Multiplication of "+num1+" and "+num2+" = "+(num1*num2));
					break;
					
			case '/' :
					System.out.println("Division of "+num1+" and "+num2+" = "+(num1/num2));
					break;
					
			default:
					System.out.println("Enter valid symbol.");
		
		}
		
		sc.close();

	}

}
