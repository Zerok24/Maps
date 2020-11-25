package Maps;

import java.util.Map;



public class mapAB {
	
	public Map<String, String> mapAB(Map<String, String> map) {
		
		String newString;
		
		if (map.containsKey("a") && map.containsKey("b")) {
			newString = map.get("a") + map.get("b");
			map.put("ab", newString);
			
			
		}
		
		return map;
		  
	}


}
