package collections.set;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

public class Simple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Hashset - getting value high,insertion and deletion low , not preserving order, duplicate not allowed
		//LinkedHashSet -  insertion and deletion high ,  getting value low , preserving order,dupliacate not allowed
		//TreeSet - ascending conversion automatically, not preserving order, duplicate not allowed
		Set<BigDecimal> set = new HashSet<>();
		
		set.add(BigDecimal.valueOf(45.78));
		set.add(BigDecimal.valueOf(Double.MAX_VALUE));
		
		
		System.out.println(set);
		
		double n =  Double.MAX_VALUE;
		System.out.println(n);
		
	}

}
