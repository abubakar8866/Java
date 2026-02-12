package interfaces;

public class MAin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Create an interface Vehicle with method run() and implement it in Car and Bike.
		/*Bike bike = new Bike();
		bike.run();
		Car car = new Car();
		car.run();*/
		
		//Use an interface reference to call implemented class methods.
		//Vehicle vehicle = new Bike();
		//vehicle.run();
		
		//Override a default method of an interface.
		Implementing2Interfaces im = new Implementing2Interfaces();
		im.brake();
	}

}
