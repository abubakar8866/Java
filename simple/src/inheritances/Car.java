package inheritances;

public class Car {
	
	Engine e = new Engine();
	
	public void moving() {
		e.start();
		System.out.println("Car is moving....");
	}
	
}
