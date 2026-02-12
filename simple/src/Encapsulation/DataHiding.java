package Encapsulation;

public class DataHiding {
	
	private int id = 1;
	private double salary = 45;
	private String name = "Abu";
	
	public int getId() {
		return this.id;
	}
	
	public String getName() {
		return this.name;
	}
	
	private double getSalary() {
		return this.salary;
	}

}
