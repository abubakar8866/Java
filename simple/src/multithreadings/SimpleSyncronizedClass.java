package multithreadings;

public class SimpleSyncronizedClass implements Runnable {
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName());
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		
	}

	//entry gate , main only command which want to go.
	synchronized static void display() {
		System.out.println(Thread.currentThread().getName());
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleSyncronizedClass s4 = new SimpleSyncronizedClass();
		Thread t1 = new Thread(s4);
		t1.setName("t1");
		Thread t2 = new Thread(s4);
		t2.setName("t2");
		t1.start();
		try {
			t2.sleep(1000);
			t2.start();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		}
		display();
	}	

}
