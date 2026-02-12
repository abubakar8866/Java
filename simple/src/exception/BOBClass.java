package exception;

public class BOBClass {

	public void credit(double amt) throws BankBalanceException {
		if(amt <= 0) {
			throw new BankBalanceException("Amount must be greater than 0");
		}
	}
	
}
