package Maps;

import java.util.HashMap;
import java.util.Map;

public class firstChar {
	public Map<String, String> firstChar(String[] strings) {
		
		String firstString = "";
		 Map<String, String> map = new HashMap<String, String>();
		 
		for (int i = 0; i < strings.length; i++) {
			firstString = strings[i].substring(0,1);
			if (!map.containsKey(firstString)) {
				map.put(firstString, strings[i]);
			}else {
				map.put(firstString , map.get(firstString) + strings[i] );
			}
		}
		
		return map;
	}
}
