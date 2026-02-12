package multithreadings;

public class SimpleSyncronized implements Runnable {
	
	/* syncronized method
	synchronized public void run() {
		for (int i = 0; i <= 10; i++) {
			System.out.println(i);
		}
	} 
	 */

	//Syncronized block
	public void run() {
		Object obj = new Object();
		synchronized(obj) {
			System.out.println("obj is entering.");
			synchronized (this) {
				System.out.println("Thread entry:"+Thread.currentThread().getName());
				for (int i = 0; i <= 10; i++) {
					System.out.println(i);
				}
				System.out.println("Thread exit:"+Thread.currentThread().getName());
			}
			System.out.println("obj is exit"+Thread.currentThread().getName());
		}		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleSyncronized s3 = new SimpleSyncronized();
		Thread t1 = new Thread(s3);
		Thread t2 = new Thread(s3);
		t1.start();
		t2.start();
	}

}
