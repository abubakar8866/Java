package exception;

import java.util.Scanner;

public class UserInputAge {
	
	void mtd(int age) throws InvalidAgeException{
		if(age < 18) {
			throw new InvalidAgeException(age,"Please Enter age greater than 18.");
		}
	}

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter age = ");
		int age = sc.nextInt();
		UserInputAge user = new UserInputAge();
		try {
			user.mtd(age);			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		sc.close();
	}

}
