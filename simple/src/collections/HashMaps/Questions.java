package collections.HashMaps;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Questions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
			Q1.Count frequency of each word in a sentence using HashMap.
	
			Q2.Find the first non-repeating character in a string using HashMap.
			
			Q3.Store employeeId → salary mapping and increase salary by 10% for all employees using HashMap.
			
			Q4.Find duplicate elements in an array using HashMap.
			
			Q5.Find the most frequent element in a list using HashMap.
			
			Q6.Merge two HashMap objects and sum values if keys are same.
			
			Q7.Use HashMap to cache API responses (key = request, value = response).
			
			Q8.Convert HashMap into List of keys sorted by value.

			Q9.Remove all entries from HashMap where value is less than 1000.
			
			Q10.Store custom object as key in HashMap (override equals() & hashCode()).
		*/
		
		//Q1.Count frequency of each word in a sentence using HashMap.
		/*String sentence = "Java full stack java stack developement";
		String[] arr = sentence.split("\\s+");
	
		
		HashMap<String, Integer> wordCounter = new HashMap<String, Integer>();
		
		for (int i = 0; i < arr.length; i++) {
			//wordCounter.put(arr[i], wordCounter.getOrDefault(arr[i], 0)+1);
			if(wordCounter.containsKey(arr[i])) {
				wordCounter.put(arr[i], wordCounter.get(arr[i])+1);
			}else {
				wordCounter.put(arr[i], 1);
			}
		}
		
		System.out.println(wordCounter);*/
		
		//Q2.Find the first non-repeating character in a string using HashMap.
		/*String name = "abubakar";
		
		HashMap<Character, Integer> countNonRptChar = new HashMap<Character, Integer>();
		
		for (int i = 0; i < name.length(); i++) {
			countNonRptChar.put(name.charAt(i), countNonRptChar.getOrDefault(name.charAt(i), 0)+1);
		}
		
		for (int i = 0; i < name.length(); i++) {
			if(countNonRptChar.get(name.charAt(i)) == 1) {
				System.out.println("key = "+name.charAt(i)+",value = "+countNonRptChar.get(name.charAt(i)));
				break;
			}
		}*/
		
		//Q3.Store employeeId → salary mapping and increase salary by 10% for all employees using HashMap.
		/*HashMap<Integer, Double> empSal = new HashMap<Integer, Double>();
		empSal.put(1, 25000.00);
		empSal.put(2, 45000.00);
		empSal.put(3, 35000.00);
		empSal.put(4, 85000.00);
		empSal.put(5, 35000.00);
		
		for(Map.Entry<Integer, Double> temp : empSal.entrySet()) {
			Integer key = temp.getKey();
			Double val = temp.getValue();
			Double updatedSal = val + (val*10/100);
			empSal.put(key, updatedSal);
		}
		
		System.out.println(empSal);*/
		
		//Q4.Find duplicate elements in an array using HashMap.
		/*int[] arr = {1,2,2,3,4,4,5};
		
		HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
		
		for (int i = 0; i < arr.length; i++) {
			hashMap.put(arr[i], hashMap.getOrDefault(arr[i], 0)+1);
		}
		
		for(Map.Entry<Integer, Integer> map: hashMap.entrySet()) {
			Integer key = map.getKey();
			Integer val = map.getValue();
			if(val > 1) {
				System.out.print(key+" ");
			}
		}*/
		
		//Q5.Find the most frequent element in a list using HashMap.
		//List<Integer> list = new ArrayList<Integer>();
		/*List<Integer> list = List.of(1,2,3,2,4,2,5);
		
		HashMap<Integer, Integer> freq = new HashMap<Integer, Integer>();
		int maxVal = Integer.MIN_VALUE;
		int maxKey = Integer.MIN_VALUE;
		
		for (int i = 0; i < list.size(); i++) {
			freq.put(list.get(i), freq.getOrDefault(list.get(i), 0)+1);
		}
		
		for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
			Integer key = entry.getKey();
			Integer val = entry.getValue();
			if(maxVal < val) {
				maxVal = val;
				maxKey = key;
			}
		}
		
		System.out.println("Most frequent Element is "+maxKey+",count = "+maxVal);*/
		
		//Q6.Merge two HashMap objects and sum values if keys are same.
		/*HashMap<String, Integer> mark1 = new HashMap<String, Integer>();
		
		mark1.put("Abu", 25);
		mark1.put("bakar", 56);
		mark1.put("khan", 67);
		
		HashMap<String, Integer> mark2 = new HashMap<String, Integer>();
		
		mark2.put("Abu", 25);
		mark2.put("bakar", 56);
		mark2.put("khan", 67);
		mark2.put("new", 10);
		
		
		HashMap<String, Integer> mark3 = new HashMap<String, Integer>(mark1);
		
		for (Map.Entry<String, Integer> entry : mark2.entrySet()) {
			String key = entry.getKey();
			Integer val = entry.getValue();
			if(mark3.containsKey(key)) {				
				mark3.put(key, mark3.get(key)+val);
			}else {
				mark3.put(key, val);
			}
		}
		
		System.out.println(mark3);*/
		
		//Q7.Use HashMap to cache API responses (key = request, value = response).
		/*HashMap<String, String> cache = new HashMap<String, String>();
		
		cache.put("/user/78", "abubakar data...");
		cache.put("/order/78", "order data...");
		cache.put("/cart/78", "cart data...");
		
		System.out.println(cache);*/
		
		//Q8.Convert HashMap into List of keys sorted by value.
		/*HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("Java", 5);
        map.put("Python", 2);
        map.put("C++", 4);
        map.put("Go", 1);
        
        List<Map.Entry<String, Integer>> entryList = new ArrayList<Map.Entry<String,Integer>>(map.entrySet());
        
        Collections.sort(entryList,(e1,e2) -> e1.getValue().compareTo(e2.getValue()));
        
        List<String> keyList = new ArrayList<String>();
        for(Map.Entry<String, Integer> map2: entryList) {
        	keyList.add(map2.getKey());
        }
        
        System.out.println(keyList);*/
		
		//Q9.Remove all entries from HashMap where value is less than 1000.
		/*HashMap<String, Integer> student = new HashMap<>();

        student.put("Abu", 2347);
        student.put("bakar", 78);
        student.put("khan", 67);

        Iterator<Map.Entry<String, Integer>> itr =
                student.entrySet().iterator();

        while (itr.hasNext()) {
            Map.Entry<String, Integer> entry = itr.next();
            if (entry.getValue() < 1000) {
                itr.remove();
            }
        }

        System.out.println(student);*/
		
		//Q10.Store custom object as key in HashMap (override equals() & hashCode()).
		/*HashMap<Employee, Integer> map = new HashMap<Employee, Integer>();
		map.put(new Employee(1, "Abu"), 1);
		map.put(new Employee(2, "bakar"), 2);
		map.put(new Employee(3, "khan"), 3);
		
		for(Map.Entry<Employee, Integer> hmap : map.entrySet()) {
			System.out.println(hmap.getKey()+":"+hmap.getValue());
		}*/
		
		//11.Find Total vowels count in a sentence using hashMap.
		String sentence = "My name is khan.";
		HashMap<Character, Integer> vowelsCount = new HashMap<Character, Integer>();
		
		sentence = sentence.toLowerCase();
		
		vowelsCount.put('a', 0);
		vowelsCount.put('e', 0);
		vowelsCount.put('i', 0);
		vowelsCount.put('o', 0);
		vowelsCount.put('u', 0);
		
		for (int i = 0; i < sentence.length(); i++) {
			Character currChar = sentence.charAt(i);
			if(vowelsCount.containsKey(currChar)) {
				vowelsCount.put(currChar, vowelsCount.get(currChar)+1);
			}
			/*
			else{
				vowelsCount.put(currChar,1);
			}
			*/
		}
		
		for (Map.Entry<Character, Integer> entry : vowelsCount.entrySet()) {
			Character key = entry.getKey();
			Integer val = entry.getValue();
			System.out.println(key+":"+val);
		}
		
	}

}
