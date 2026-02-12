package classes;

public class ConstOverloading {
	
	//Can we overload constructor
	
	public int id;
	public String name;
	
	public ConstOverloading(int id) {
		System.out.println("Contsructor 1 is calling.");
		this.id = id;
	}
	
	public ConstOverloading(int id,String name) {
		System.out.println("Contsructor 2 is calling.");
		this.id = id;
		this.name = name;
	}
	
	public void printAll() {
		System.out.println(id);
		System.out.println(name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstOverloading con = new ConstOverloading(4);
		con.printAll();
		ConstOverloading con2 = new ConstOverloading(9, "str");
		con2.printAll();
	}

}
