package polymorphism;

public class Child extends Parent {

	public void show() {
		System.out.println("Child method run....");
	}
	
	public void childMethod() {
		System.out.println("I am run only by Child reference.");
	}
	
}
