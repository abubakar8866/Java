package multithreadings;

public class Buffer {

	private int data;
	private boolean hasData = false;
	
	public synchronized void produce(int data) throws InterruptedException {
		
		while(hasData) {
			wait();
		}
		
		this.data = data;
		this.hasData = true;
		System.out.println("Produced data: "+data);
		notify();
	}
	
	public synchronized void consume() throws InterruptedException {
		
		while(!hasData) {
			wait();
		}
		
		System.out.println("Consumed data: "+data);
		this.hasData = false;
		notify();
	}
	
}
