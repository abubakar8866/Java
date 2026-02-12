package interfaces;

public interface Sum {
	
	void mtd();
	
	default void printSum(int a,int b) {
		System.out.println(giveSum(a, b));
	}
	
	private int giveSum(int a,int b) {
		return a + b;
	}
	
	static void run() {
		System.out.println("I am running...");
	}
	
	
	/*static void mtd1() {
		System.out.println("Running..");
	}
	
	public static void main(String[] args) {
		mtd1();
	}*/
	
}
