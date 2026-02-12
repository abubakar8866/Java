package classes;

public class ConstructorChaining {
	
	public int n,d;
	
	public ConstructorChaining() {
		this(10);
		System.out.println("Default constructor calling...");
	}
	
	public ConstructorChaining(int n) {
		this(n,23);
		System.out.println("One Paramaterized cons = "+n);
	}
	
	public ConstructorChaining(int n,int d) {
		System.out.println("Two Paramaterized constructor:");
		System.out.println("Value of n = "+n+" and value of d = "+d);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorChaining cons = new ConstructorChaining();
	}

}
