package warpperClassess;

public class ManualBoxing {

	public static void main(String[] args) {
		//Manual Boxing
		int n = 20;
		Integer ni = new Integer(n);
		
		//AutoBoxing primitive -- Object
		n = 78;
		Integer ny = n;
		
		//UnBoxing Object -- primitive
		Integer v = 56;
		int p = v;
		
		
		//ValueOf --> value add
		//convert value to wrapper object
		//same as parseInt()
		Integer yu = Integer.valueOf(123);
		
		//Inside string only decimal number.
		yu = Integer.valueOf("123");
		//System.out.println(yu);
		
		int i = Integer.parseInt("100");
		
		Integer iyu = 20;
		String s = iyu.toString();
		System.out.println(s);
		
		float sy = 0.7f;
		System.out.println(sy);
	}

}
