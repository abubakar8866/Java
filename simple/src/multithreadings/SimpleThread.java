package multithreadings;

public class SimpleThread extends Thread {
	
	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//new Simple().start();
		new SimpleThread().start();
		SimpleThread simple1 = new SimpleThread();
		simple1.start();
	}

}
