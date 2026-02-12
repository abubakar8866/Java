package multithreadings;

public class SimpleRunnables implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleRunnables s2 = new SimpleRunnables();
		Thread t1 = new Thread(s2);
		//t1.start();
		Thread t2 = new Thread(s2);
		//t2.start();
		System.out.println(t1.getState());
		
	}	

}
