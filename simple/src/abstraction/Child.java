package abstraction;

public class Child extends Parent {

	private String name;
	
	public Child(int id,String name) {
		super(id);
		this.name = name;
	}
	
	public void printAll() {
		System.out.println("Id = "+super.getId());
		System.out.println("Name = "+this.name);
	}
	
	public void run() {
		System.out.println("Child method run.");
	}
	
}
