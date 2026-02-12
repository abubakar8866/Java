package interfaces;

public class Implementing2Interfaces implements Vehicle,AnotherVehicle {

	public void run() {
		System.out.println("Running.....");
	}
	
	@Override
	public void brake() {
		//Vehicle.super.brake();
		//AnotherVehicle.super.brake();
		System.out.println("Overriding default method....");
	}
	
}
