package inheritances;

public class ImplSingleIn extends SingleIn {
	
	public int a,b;
	
	public int subtract(int a,int b) {
		return b - a;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ImplSingleIn s = new ImplSingleIn();
		System.out.println(s.sum(1, 2));
		System.out.println(s.subtract(1, 2));
	}

}
