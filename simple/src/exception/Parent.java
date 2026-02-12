package exception;

public class Parent {

	void mtd() throws MethodNotFoundException {
		throw new MethodNotFoundException("Method is not completed....");
	}
	
}
