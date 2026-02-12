package interfaces;

public interface Vehicle {

	void run();
	
	public default void brake() {
		System.out.println("Applying brake from vehicle interface...");
	}
	
}
