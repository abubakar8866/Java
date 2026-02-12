package staticFinal;

public class ShowMethodHiding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child.mtd();
		Parent.mtd();
		Parent p = new Child();
		p.mtd();
	}

}
