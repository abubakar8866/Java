package multithreadings;

public class SimpleVolatileKeyword {

	volatile boolean vol = true;

	public static void main(String[] args) {
		SimpleVolatileKeyword  s=new SimpleVolatileKeyword();
		Thread t1 = new Thread(() -> {
			while (s.vol) {

			}
			System.out.println("Loop closed.");
		});
		t1.start();
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		s.vol = false;
		
		/*while(vol) {
			System.out.println(vol);
		}
		vol = false;*/
	}

}
