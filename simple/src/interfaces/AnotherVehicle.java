package interfaces;

public interface AnotherVehicle {
	
	public default void brake() {
		System.out.println("Applying brake from Another interface...");
	}
	
}
