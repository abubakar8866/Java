package collections.HashMaps;

import java.util.HashMap;
import java.util.Map;

public class Simple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//order not follow,allow only one null key, duplicate key not allowed,update value, multiple duplicate allowed null.
		//multiple get faster
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(null, null);
		map.put(null,"45");
		map.putIfAbsent(null, null);
		map.put(1, "abu");
		map.put(2, "sir");
		System.out.println(map);
		System.out.println(map.remove(1, "sir"));
		System.out.println(map.keySet());
		for(Integer k : map.keySet()) {
			System.out.println(k);
		}		
		System.out.println();
		System.out.println(map.values());
		for(String v: map.values()) {
			System.out.println(v);
		}
		for (Map.Entry<Integer, String> entry : map.entrySet()) {
			Integer key = entry.getKey();
			String val = entry.getValue();
			System.out.print(key+":"+val+" ");
		}
		System.out.println();
		System.out.println(map.getOrDefault(null, "0"));
	}

}
