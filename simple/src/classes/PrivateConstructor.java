package classes;

public class PrivateConstructor {
	
	//create private constructor and count total objects that are created.
	
	public int n;
	public static int c;
	
	private PrivateConstructor(int n) {
		this.n = n;
		c++;
	}
	
	public void countObjects() {
		System.out.println(c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrivateConstructor pCons1 = new PrivateConstructor(8);
		PrivateConstructor pCons2 = new PrivateConstructor(8);
		PrivateConstructor pCons3 = new PrivateConstructor(8);
		PrivateConstructor pCons4 = new PrivateConstructor(8);
		pCons4.countObjects();
	}

}
