package operator;

public class RelationalOperatorQue {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		//Check whether two numbers are equal or not.
		System.out.println((23 == 23) ? "Numbers are equal" : "Numbers are not equal");
		
		//Find the greater number between two numbers.
		System.out.println((67 > 56) ? "67 is bigger than 56" : "56 is grater than 67");
		
		//Check whether a number is positive, negative, or zero.
		if(56 > 0) {
			System.out.println("56 is positive number.");
		}else if(56 < 0) {
			System.out.println("56 is negative number.");
		}else {
			System.out.println("zero number is entered.");
		}
		
		//Compare length of two strings using relational operators.
		String str1 = "abu";
		String str2 = "bakar";
		
		System.out.println((str1.length() > str2.length()) ? str1+" is greater than "+str2 : str2+" is greater than "+str1);
		
		//Check whether a person is eligible to vote.
		System.out.println((21>18) ? "you are aligible for voting since "+(21-18)+" years before." : "you are not aligible for voting, after "+(18-17)+" years,you are eligible..");
		
		

	}

}
