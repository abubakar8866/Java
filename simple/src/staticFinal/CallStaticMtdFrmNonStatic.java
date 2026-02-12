package staticFinal;

public class CallStaticMtdFrmNonStatic {
	
	public void display() {
		s();
	}
	
	static void s() {
		System.out.println("Static method.....");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CallStaticMtdFrmNonStatic s = new CallStaticMtdFrmNonStatic();
		s.display();
	}

}
