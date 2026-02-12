package classes;

public class SingleInstance {

	private static SingleInstance obj;
	
	private SingleInstance() {
		System.out.println("Constructor called...");
	}
	
	public static SingleInstance getInstance() {
		if(obj == null) {
			obj = new SingleInstance();
		}
		return obj;
	}

}
