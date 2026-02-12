package classes;

public class ReverseNumber {
	
	public static void reverseNum(int n) {
		
		if(n >= 0 && n <= 9) {
			System.out.println(n);
			return;
		}
		
		int ans = 0;
		
		while(n > 0) {
			int lastEle = n % 10;
			ans = ans * 10 + lastEle;
			n = n/10;
		}
		
		System.out.println(ans);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		reverseNum(56);
	}

}
