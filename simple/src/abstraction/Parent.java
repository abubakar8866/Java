package abstraction;

public abstract class Parent {

	private int id;
	
	public Parent(int id) {
		this.id = id;
	}
	
	public int getId() {
		return this.id;
	}
	
	public void run() {
		System.out.println("Parent method run...");
	}
	
}
