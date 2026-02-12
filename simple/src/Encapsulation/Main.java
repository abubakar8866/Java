package Encapsulation;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your marks = ");
		int m = sc.nextInt();
		AddValidationSetter a = new AddValidationSetter();
		a.setMark(m);
		sc.close();
		
		/*ReadOnlyEncapsulatedClass r = new ReadOnlyEncapsulatedClass();
		System.out.println(r.getId());*/
		
		/*DataHiding d = new DataHiding();
		System.out.println(d.getId());
		System.out.println(d.getName());*/
	}

}
