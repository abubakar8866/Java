package collections.TreeMaps;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class Questions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
			Q16.Store employee data and sort by employeeId using TreeMap.
			
			Q17.Sort map by keys in descending order using TreeMap.
			
			Q18.Find highest and lowest key using TreeMap.
			
			Q19.Get range of keys (between 101 and 103) using TreeMap.
			
			Q20.Store city → temperature and get top hottest cities using TreeMap.
		*/
		
		//Q16.Store employee data and sort by employeeId using TreeMap.
		TreeMap<Integer, String> employees = new TreeMap<>();

        employees.put(103, "Abu");
        employees.put(101, "Bakar");
        employees.put(105, "Khan");

        System.out.println(employees);
		
		//Q17.Sort map by keys in descending order using TreeMap.
		System.out.println(employees.reversed());
		
		//Q18.Find highest and lowest key using TreeMap.
		System.out.println("first key = "+employees.firstKey());
		System.out.println("last key = "+employees.lastKey());
		
		//Q19.Get range of keys (between 101 and 103) using TreeMap.
		System.out.println(employees.subMap(101, 105));
		
		//Q20.Store city → temperature and get top hottest cities using TreeMap.
		TreeMap<Integer, String> cityTemp =
		        new TreeMap<>(Collections.reverseOrder());

		cityTemp.put(45, "Ahmedabad");
		cityTemp.put(38, "Pune");
		cityTemp.put(42, "Delhi");
		cityTemp.put(35, "Bangalore");
		
		int count = 0;
		for (Map.Entry<Integer, String> entry : cityTemp.entrySet()) {
		    System.out.println(entry.getValue() + " : " + entry.getKey() + "°C");
		    count++;
		    if (count == 2) break;
		}

		
	}

}
