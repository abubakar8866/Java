package collections.LinkedHashMap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Questions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
			Q11.Maintain insertion order of elements using LinkedHashMap.
	
			Q12.Implement LRU Cache using LinkedHashMap.
			
			Q13.Remove eldest entry when map size exceeds 5 using LinkedHashMap.
			
			Q14.Convert a HashMap into a LinkedHashMap to maintain order.
			
			Q15.Track recently accessed users using LinkedHashMap.
		*/
		
		//Q11.Maintain insertion order of elements using LinkedHashMap.
		/*LinkedHashMap<String, Integer> map = new LinkedHashMap<>();

        map.put("Abu", 1);
        map.put("Bakar", 2);
        map.put("Khan", 3);

        System.out.println(map);*/
		
		//Q12.Implement LRU Cache using LinkedHashMap.
		
		/*LRUCache<String, Integer> cache = new LRUCache<String, Integer>(3);
		
		cache.put("cache1", 10);
		cache.put("cache2", 20);
		cache.put("cache3", 30);
		
		cache.get("cache1");
		
		cache.put("cache4", 40);
		
		System.out.println(cache);*/
		
		//Q13.Remove eldest entry when map size exceeds 5 using LinkedHashMap.
		LinkedHashMap<Integer, String> map = new LinkedHashMap<Integer, String>(){
			private static final long serialVersionUID = 1L;

			protected boolean removeEldestEntry(Map.Entry<Integer, String> eldest) {
				return size() > 5;
			}
		};
		
		map.put(1, "a");
		map.put(2, "b");
		map.put(3, "u");
		map.put(4, "b");
		map.put(5, "a");
		map.put(6, "k");
		
		System.out.println(map);
		
		//Q14.Convert a HashMap into a LinkedHashMap to maintain order.
		HashMap<String, Integer> hashMap = new HashMap<>();
		hashMap.put("Java", 1);
		hashMap.put("Python", 2);
		hashMap.put("Go", 3);

		LinkedHashMap<String, Integer> linkedMap =
		        new LinkedHashMap<>(hashMap);

		System.out.println(linkedMap);
		
	}

}
