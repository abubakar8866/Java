package staticFinal;

public class StaticFinalVariable {

	final static double pi = 3.14;
	final int n;
	static int c;
	
	public StaticFinalVariable(int n) {
		// TODO Auto-generated constructor stub
		this.n = n;
		c += n;
		System.out.println("n = "+this.n);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(StaticFinalVariable.pi);
		System.out.println(pi);
		new StaticFinalVariable(20);
		new StaticFinalVariable(40);
		System.out.println("static value = "+c);
	}

}
