package multithreadings;

public class BankAccount {

	public int balance = 1000;
	
	public void withdraw(int amount) throws InterruptedException {
		if(balance >= amount) {
			System.out.println(Thread.currentThread().getName()+" is withdrawing "+amount);
			
			Thread.sleep(100);
			balance = balance - amount;
			System.out.println(Thread.currentThread().getName()+" completed withdraw and remaining balance = "+balance);
			
		}else {
			System.out.println(Thread.currentThread().getName()+" saying insufficient balance...");
		}
	}
	
}
