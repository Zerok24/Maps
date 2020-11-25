package Maps;

import java.util.HashMap;
import java.util.Map;

public class wordCount {
	public Map<String, Integer> wordCount(String[] strings) {
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		int count = 0;
		
		for (int i = 0; i < strings.length; i++) {
			for (int j = 0; j < strings.length; j++) {
				if (strings[i].equals(strings[j])) {
					count++;
				}
			}
			
			map.put(strings[i], count);
			count = 0;
		}
		
		return map;
		  
	}

}
