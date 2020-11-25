package Maps;

import java.util.HashMap;
import java.util.Map;

public class wordAppend {
	
	public String wordAppend(String[] strings) {
		
		String[] accumulate =  new String[strings.length] ;
		String result = "";
		int counter = 0;
		
		for (int i = 0; i < strings.length; i++) {
			accumulate[i] = strings[i];
			
			for (int j = 0; j < accumulate.length; j++) {
				if (strings[i].equals(accumulate[j])) {
					counter++;
				}
			}
			if (counter % 2 == 0 ) {
				result += strings[i];
			}
			counter = 0;
		}
		return result;
	}
	
	public String appenc2(String[] strings ) {
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		String result = "";
		
		for (int i = 0; i < strings.length; i++) {
			if (!map.containsKey(strings[i])) {
				map.put(strings[i], 1);
			}
			else {
				map.put(strings[i], map.get(strings[i])+1);
			}
			
			if (map.get(strings[i]) %2 == 0) {
				result += strings[i];
			}
		}
		return result;
	}
	
	
	public static void main(String[] args) {
	System.out.println( 5 % 2 );	
	}

}
