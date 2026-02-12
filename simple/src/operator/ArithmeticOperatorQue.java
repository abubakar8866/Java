package operator;

public class ArithmeticOperatorQue {

	public static void main(String[] args) {
		
		//Write a program to add, subtract, multiply, divide two numbers.
		System.out.println(1+1);
		System.out.println(6-7);
		System.out.println(5*3);
		System.out.println(8/2);
		
		//Find remainder of two numbers using %.
		System.out.println(5%2);
		
		//Calculate simple interest using operators.formulae = (p*r*t)/100;
		System.out.println((1000*23.45*2)/100);
		
		//Find average of 3 numbers.
		System.out.println((1+2+3)/3);
		
		//Swap two numbers without using third variable.
		int a = 78;
		int b = 56;
		a  = a + b;
		b = a - b;
		a = a - b;
		System.out.println(a+" "+b);
		
		//Check whether a number is even or odd using %.
		System.out.println((8%2==0) ? "8 is even." : "8 is odd.");
		System.out.println((5%2==0) ? "5 is even." : "5 is odd.");
		
		//Convert days into years, weeks, and days.
		System.out.println("years = "+1025 / 365);
		System.out.println("weeks = "+(1025 % 365) / 7);
		System.out.println("Days = "+(1025 % 365) % 7);

	}

}
