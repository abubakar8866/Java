package java8Feature;

class Emp {
    String name;
    String department;
    double salary;
    
    public Emp(String name,String department,double salary) {
    	this.name = name;
    	this.department = department;
    	this.salary = salary;
    }

    public String getDepartment() { return department; }

	@Override
	public String toString() {
		return "Emp [name=" + name + ", department=" + department + ", salary=" + salary + "]";
	}
    
}
