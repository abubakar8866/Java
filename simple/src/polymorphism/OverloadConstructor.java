package polymorphism;

public class OverloadConstructor {
	
	public int a,b;
	
	public OverloadConstructor() {
		System.out.println("Default constructor is running....");
	}
	
	public OverloadConstructor(int a) {
		this.a = a;
		System.out.println("Value of a = "+this.a);
	}
	
	public OverloadConstructor(int a,int b) {
		this.a=a;
		this.b=b;
		System.out.println("Addition = "+(this.a+this.b));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverloadConstructor o1 = new OverloadConstructor();
		OverloadConstructor o2 = new OverloadConstructor(10);
		OverloadConstructor o3 = new OverloadConstructor(10, 20);
	}

}
