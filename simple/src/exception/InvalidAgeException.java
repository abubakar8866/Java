package exception;

public class InvalidAgeException extends RuntimeException {

	public int age;
	public String msg;
	
	public InvalidAgeException(int age,String msg) {
		// TODO Auto-generated constructor stub
		super(String.format("%s : %d",msg,age));
		this.age = age;
		this.msg = msg;
	}
	
	
}
