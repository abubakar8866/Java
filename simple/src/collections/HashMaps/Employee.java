package collections.HashMaps;

import java.util.Objects;

public class Employee {

	public int id;
	public String name;
	
	public Employee(int id,String name) {
		this.id = id;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Employee{id="+this.id+",name="+this.name+"}";
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		
		if(obj == null || this.getClass() != obj.getClass()) {
			return false;
		}
		
		Employee other = (Employee) obj;
		
		return this.id == other.id && Objects.equals(other.name, name);
		
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(id,name);
	}
	
}
