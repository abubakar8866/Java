package exception;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Parent p = new Parent();
		try {
			p.mtd();
		}/* catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}*//* catch (MethodNotFoundException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}*/
		BOBClass bob = new BOBClass();
		try {
			bob.credit(-2);
		} catch (BankBalanceException | RuntimeException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		System.out.println("Program is continue to run....");
	}

}
