package staticFinal;

public final class FinalInitialiation {
	
	final int n;
	
	public FinalInitialiation(int n) {
		// TODO Auto-generated constructor stub
		this.n = n;
	}
	
	public final void display() {
		//this.n = 10;
		System.out.println(this.n);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FinalInitialiation f = new FinalInitialiation(23);
		f.display();
	}

}
