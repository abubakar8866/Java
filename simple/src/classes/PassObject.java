package classes;

public class PassObject {
	
	public static void passStudent(Student st) {
		System.out.println(st.id);
		System.out.println(st.name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student st = new Student(12, "Abubakar");
		passStudent(st);
	}

}
