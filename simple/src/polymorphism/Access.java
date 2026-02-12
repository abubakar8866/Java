package polymorphism;

import accessModifier.AccessModifiers;

public class Access extends AccessModifiers {
	
	public Access() {
		// TODO Auto-generated constructor stub
		super.mtd3();
	}
	
	/*protected void mtd3() {
		super.mtd3();
		System.out.println("Protected method override.");
	}*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccessModifiers a = new AccessModifiers();
		a.mtd4();
		
		Access acc = new Access();
		acc.mtd3();
		
	}

}
