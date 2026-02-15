package multithreadings;

public class SimpleDeamonThreads {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1 = new Thread(() -> {
			int n =10;
			while(n < 20 ) {
				System.out.println(n++);
			}
		});
		
		SimpleDeamonThreads d = new SimpleDeamonThreads();
		t1.setDaemon(true); //run 1 time then immidiatelly shutdown JVM. //primilarly used in GC.
		
		t1.start();
		
	}

}
