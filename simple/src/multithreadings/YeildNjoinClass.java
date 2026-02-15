package multithreadings;

public class YeildNjoinClass implements Runnable {
	
	//static int count = 0;
	//yield -- once current thread stop /sleep then quiclky add any random thread while wai/notify call that one thread which is waiting
	//join -- one by one
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 10; i++) {
			//count++;
			System.out.println(i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			Thread.yield();
		}
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		YeildNjoinClass y = new YeildNjoinClass();
		Thread t1 = new Thread(y);
		Thread t2 = new Thread(y);
		
		t1.start();
		t2.start();
		
//		t1.join();
//		t2.join();
		
//		t1.yield();
//		t2.yield();		
		
		//System.out.println("count ="+count);
	}	

}
