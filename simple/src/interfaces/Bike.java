package interfaces;

public class Bike implements Vehicle{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Bike is moving fast...");
	}
	
	@Override
	public void brake() {
		Vehicle.super.brake();
	}
	
}
