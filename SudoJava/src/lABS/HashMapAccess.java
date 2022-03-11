package lABS;

import java.util.HashMap;
import java.util.Map;

public class HashMapAccess {
	
	public static void main(String[] args) {
		
		HashMap<String, Integer> map= new HashMap<String, Integer>();
		
		for( Map.Entry<String, Integer> s : map.entrySet() ){
			System.out.println(s.getKey());
			System.out.println(s.getValue());
		}
		
		
	}

}
