package Maps;

import java.util.HashMap;
import java.util.Map;

public class wordMultiple {
	public Map<String, Boolean> wordMultiple(String[] strings) {
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		Map<String, Boolean> resultMap = new HashMap<String, Boolean>();
		
		for (int i = 0; i < strings.length; i++) {
			if (!map.containsKey(strings[i])) {
				map.put(strings[i], 1);
			}else {
				map.put(strings[i], map.get(strings[i])+1);
			}
		}
		
		for (int i = 0; i < strings.length; i++) {
			if ( map.get(strings[i]) >=2 ) {
				resultMap.put(strings[i], true);
			}else {
				resultMap.put(strings[i], false);
			}
		}
		
		return resultMap;
		  
	}

}
