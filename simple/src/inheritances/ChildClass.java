package inheritances;

public class ChildClass extends ParentCLass {
	
	public void print() {
		System.out.println("Running chid method...");
	}
	
	public static void methodHiding() {
		System.out.println("Static child method called....");
	}
	
}
