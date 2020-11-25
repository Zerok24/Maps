package Maps;

import java.util.Map;

public class mapShare {

	public Map<String, String> mapShare(Map<String, String> map) {
		
		if (map.get("a") != null) {
			map.put("b", map.get("a"));
			
			if (map.containsKey("c")) {
				map.remove("c");
			}
			
			
		}else if (map.containsKey("c")) {
			map.remove("c");
		}
		
		return map;
	}

	
	
	
}
