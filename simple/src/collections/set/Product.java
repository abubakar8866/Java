package collections.set;

import java.util.Objects;

public class Product {

	public int id;
	public String name;
	
	public Product(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Product {id='" +id+"',name='"+name+"'}";
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if(obj == null || this.getClass() != obj.getClass()) {
			return false;
		}
		Product other = (Product) obj;
		return this.id == other.id;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	
}
