package Maps;

import java.util.HashMap;
import java.util.Map;

public class word0 {
	public Map<String, Integer> word0(String[] strings) {
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		for (int i = 0; i < strings.length; i++) {
			map.put(strings[i], 0);
		}
		
		
		return map;
		  
	}


}
