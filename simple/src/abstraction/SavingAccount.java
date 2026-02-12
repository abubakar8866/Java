package abstraction;

public class SavingAccount extends Account {

	public double amt;
	
	@Override
	void deposit(double amt) {
		// TODO Auto-generated method stub
		if(amt < 1) {
			System.out.println("Please enter valid amount.");
			return;
		}
		
		this.amt = amt;
		System.out.println("Amount addedd successfully..");
		
	}

	@Override
	double withdraw(double amt) {
		// TODO Auto-generated method stub
		if(amt > this.amt) {
			System.out.println("Insufficient Balance.");
			return -1;
		}
		this.amt=this.amt - amt;
		return this.amt;
	}
	
}
