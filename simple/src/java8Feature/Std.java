package java8Feature;

public class Std {

	int id;
	String name;
	String department;
	
	public Std(int id,String name,String department) {
		this.id = id;
		this.name = name;
		this.department = department;
	}

	@Override
	public String toString() {
		return "Std [id=" + id + ", name=" + name + ", department=" + department + "]";
	}
	
}
