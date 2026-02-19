package generics;

public class Simple<T extends Number,V> {

	private T id;
	private V name;
	
	public Simple(T id,V name) {
		this.id = id;
		this.name = name;
	}
	
	public T getId() {
		return id;
	}
	
	public V getName() {
		return name;
	}
	
}
