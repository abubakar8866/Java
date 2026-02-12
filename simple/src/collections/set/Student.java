package collections.set;

import java.util.Objects;

public class Student {

	public int id;
	public String name;
	
	public Student(int id,String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if (this == obj) {
			return true;
		}
		
		if(obj == null || getClass() != obj.getClass()) {
			return false;
		}
		
		Student other = (Student) obj;
		return id == other.id && name.equals(other.name);
		
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(id,name);
	}
	
}
