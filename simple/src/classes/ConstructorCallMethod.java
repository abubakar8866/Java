package classes;

public class ConstructorCallMethod {
	
	public ConstructorCallMethod() {
		this.mtd();
	}
	
	public void mtd() {
		System.out.println("Method Called successfully from constructor....");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorCallMethod c = new ConstructorCallMethod();
	}

}
