package multithreadings;

public class SimpleDeadlock {
	
	static Object obj1 = new Object();
	static Object obj2 = new Object();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1 = new Thread(()->
		{
			synchronized (obj1) {
				System.out.println(obj1.getClass().getName());	
				try {
					obj2.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					System.out.println("handled");
				}
				synchronized (obj2) {
					//in this deadlock
					/*try {
						obj2.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}*/
					System.out.println("Something printing from 1 thread...");
					for (int i = 11; i <= 20; i++) {
						System.out.println(i);
					}
				}
			}
		}
				);
		Thread t2 = new Thread(()->
		{
			synchronized (obj1) {
				System.out.println(obj1.getClass().getName());
				synchronized (obj2) {
					obj2.notify();
					System.out.println("Something printing 2 thread...");
					for (int i = 1; i <= 10; i++) {
						System.out.println(i);
					}
				}
			}
		}
				);
		
		t1.start();
		t2.start();
		
	}

}
