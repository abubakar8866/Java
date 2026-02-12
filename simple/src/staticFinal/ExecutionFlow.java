package staticFinal;

public class ExecutionFlow {
	
	static {
		System.out.println("Static Block");
	}
	
	{
		System.out.println("Instance Block");
	}
	
	public ExecutionFlow() {
		// TODO Auto-generated constructor stub
		System.out.println("Constructor Block");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main Block"); // main called --> static block --> main block --> object created --> instance block --> constructor
		new ExecutionFlow();
	}

}
