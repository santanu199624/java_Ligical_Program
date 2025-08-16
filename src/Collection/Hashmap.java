package Collection;

import java.util.HashMap;

public class Hashmap {

	public static void main(String[] args) {
		// 1. Which data structure HashMap represents?
				// Ans: HashTable (The underline data structure of HashMap). data store in key value pair.
				
				// 2. Which data structure is used to implement HashMap in java?
				// Ans: Array and LinkedList
				
				// 3. Is HashMap thread-safe in java?
				// Ans: No
				
				HashMap<String, Integer> map = new HashMap<>();
				map.put("Krish", 101);
				map.put("Krish1", 102);
				map.put(null, null);
				map.put(null, 103);
				System.out.println(map);

	}

}
