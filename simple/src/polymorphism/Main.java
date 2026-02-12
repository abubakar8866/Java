package polymorphism;

public class Main {

	public static void main(String[] args) {
		
		Parent p = new Parent();
		p.show();
		
		p = new Child(); //upcasting
		
		p.show(); //dynamic dispatch
		
		//p.childMethod(); //it store parent reference
		
		Child c = new Child();
		
		c.show();
		
		c.childMethod();
	}

}
