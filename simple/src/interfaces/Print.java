package interfaces;

public class Print implements Simple,Sum {	

	@Override
	public void inter() {
		// TODO Auto-generated method stub
		System.out.println("I am interfaces method and now I am defining...");
	}
	
	@Override
	public void mtd() {
		System.out.println("Run");
	}
	
	/*public void printSum(int a,int b) {
		//giveSum(a,b);
	}*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Print p = new Print();
		p.inter();
		p.mtd();
		p.printSum(10, 50);
		Sum.run();
		main(7);
	}
	
	public static void main(int v) {
		System.out.println(v);
	}

}
