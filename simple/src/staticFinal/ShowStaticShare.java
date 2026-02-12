package staticFinal;

public class ShowStaticShare {
	
	static int count;
	
	public ShowStaticShare() {
		// TODO Auto-generated constructor stub
		count++;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShowStaticShare s = new ShowStaticShare();
		ShowStaticShare s2 = new ShowStaticShare();
		System.out.println(ShowStaticShare.count);
	}

}
