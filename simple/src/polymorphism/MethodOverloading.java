package polymorphism;

public class MethodOverloading {
	
	public static int sum(int a,int b) {
		return a+b;
	}
	
	public static int sum(int a,int b,int c) {
		return a+b+c;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sum(10,20));
		System.out.println(sum(10,20,30));
	}

}
