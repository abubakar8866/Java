package staticFinal;

public class CallNonStatictFrmStatic {
	
	public void display() {
		System.out.println("Non-static method...");
	}
	
	static void s() {
		CallNonStatictFrmStatic c = new CallNonStatictFrmStatic();
		c.display();
		//this.dislay();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CallNonStatictFrmStatic.s();
	}

}
