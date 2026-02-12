package operator;

public class IncOrdecOperator {

	public static void main(String[] args) {
		
		//Find output of:
		int a = 5;
		System.out.println(a++ + ++a+"\n");
		
		//Difference between pre-increment and post-increment.
		int num = 7;
		System.out.println(num++);
		System.out.println(++num+"\n");
		
		//Print numbers from 1 to 10 using ++.
		for(int i=1;i<=10;i=i+2) {
			System.out.println(i);
		}
		
		System.out.println();
		
		//Decrease value from 10 to 1 using --.
		for(int i=10;i>=1;i--) {
			System.out.println(i);
		}

	}

}
