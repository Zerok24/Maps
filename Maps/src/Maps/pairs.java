package Maps;

import java.util.HashMap;
import java.util.Map;

public class pairs {

	public Map<String, String> pairs(String[] strings) {
		
		Map<String, String> map = new HashMap<String, String>();
		
		for (int i = 0; i < strings.length; i++) {
			String firstString = strings[i].substring(0,1);
			String lastString = strings[i].substring(strings[i].length()-1);
			map.put(firstString , lastString);
			
		}
		
		return map;
		  
	}

}
