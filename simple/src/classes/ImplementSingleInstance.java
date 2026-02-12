package classes;

public class ImplementSingleInstance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingleInstance s1 = SingleInstance.getInstance();
		SingleInstance s2 = SingleInstance.getInstance();
		SingleInstance s3 = SingleInstance.getInstance();
	}

}
