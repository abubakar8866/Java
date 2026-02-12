package polymorphism;

public class OverloadMain {

	public static void main(String[] args) {
		System.out.println("Main method running...");
		main(10);
		main("Abubakar");
	}
	
	public static void main(int a) {
		System.out.println(a);
	}
	
	public static void main(String name) {
		System.out.println(name);
	}

}
