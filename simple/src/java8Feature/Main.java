package java8Feature;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Simple simple = () -> { System.out.println("done"); };
		 * 
		 * simple.display();
		 */
		
		/*
		Create a functional interface Calculator with method int operate(int a, int b) and implement:
		Addition using lambda		
		Subtraction using lambda
		
		Create a functional interface MessageService with method send(String message) and implement:		
		Email sender		
		SMS sender
		
		Create a PaymentProcessor interface and implement:		
		CreditCard payment		
		UPI payment
		
		Create a functional interface to validate login credentials.
		
		Create a StringFormatter interface to format strings differently (uppercase, lowercase).

		*/
		
		/*
		Create a functional interface Calculator with method int operate(int a, int b) and implement:
		Addition using lambda		
		Subtraction using lambda
		*/
		/*
		 * Calculator calculator = (int a,int b) -> { System.out.println(a-b); };
		 * calculator.addOrSub(1, 2);
		 */
		
		/*
		 * Create a functional interface MessageService with method send(String message)
		 * and implement: Email sender SMS sender
		 */
		/*
		 * MessageService messageService = (String eml) -> {
		 * System.out.println(eml+" is email sender"); };
		 * messageService.emailSender("abu@gmail.com");
		 */
		
		/*
		 * Create a PaymentProcessor interface and implement: CreditCard payment UPI
		 * payment
		 */
		/*
		 * PaymentProcessor paymentProcessor = (id, name) -> {
		 * System.out.println(id+" "+name); return id; }; int n
		 * =paymentProcessor.paymentProcess(1, "abu"); System.out.println(n);
		 */
		
		//Create a functional interface to validate login credentials.
		/*
		 * Login login = (user,pass) -> { if(user.equals("abu")&&pass.equals("pass"))
		 * return true; return false; }; System.out.println(login.valid("abu", "pass"));
		 */
		
		//Create a StringFormatter interface to format strings differently (uppercase, lowercase).
		/*
		 * StringFormatter stringFormatter = (str) -> {
		 * System.out.println(str.toLowerCase()); };
		 * stringFormatter.toLowerCases("ABU");
		 */
		
	}	

}
