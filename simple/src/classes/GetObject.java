package classes;

public class GetObject {
	
	public static Student getStudent() {
		Student st = new Student(14, "Abu");
		return st;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student st = getStudent();
		
		System.out.println(st.id);
		System.out.println(st.name);
	}

}
