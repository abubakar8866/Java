package classes;

public class MthodOverloading {
	
	public void method1(int a) {
		System.out.println(a);
	}
	
	public void method1(int a,int b) {
		System.out.println(a+b);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MthodOverloading m = new MthodOverloading();
		m.method1(3);
		m.method1(5, 9);
	}	

}
