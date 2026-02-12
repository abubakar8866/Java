package classes;

public class Construct {
	
	public int n;
	
	public int meth(int n) {
		this.n = n;
		return n;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Construct con = new Construct();
		System.out.println(con.meth(3));
		
		Construct con2 = new Construct();
		
	}
	
	public Construct() {
		System.out.println("Contructor is running.");
		System.out.println(n);
	}

}
