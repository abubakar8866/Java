package classes;

public class MethodCalledConstructor {
	
	public MethodCalledConstructor() {
		System.out.println("Method called Constructor....");
	}
	
	public static void mt() {
		MethodCalledConstructor ct = new MethodCalledConstructor();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mt();
	}

}
