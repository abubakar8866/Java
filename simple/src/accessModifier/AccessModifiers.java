package accessModifier;

public class AccessModifiers {
	
	private void mtd1() {
		System.out.println("Private method");
	}
	
	void mtd2() {
		System.out.println("Default method.");
	}
	
	protected void mtd3() {
		System.out.println("Protected method.");
	}
	
	public void mtd4() {
		System.out.println("public method");
	}

}
