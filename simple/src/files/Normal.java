package files;

import java.io.Serializable;

public class Normal implements Serializable{

	int id;
	String name;
	
	public Normal(int id,String name) {
		this.id = id;
		this.name = name;
	}
	
}
