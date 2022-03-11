package lABS;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapAccess {
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		Scanner sc2= new Scanner(System.in);
		
		int noOfTimes=Integer.valueOf(sc.next());
		String[] lines= new String[noOfTimes];
		
		
		for(int i=0; i<noOfTimes; i++) {
			lines[i]= sc2.nextLine();
		}
	
	
		HashMap<String, Integer> map= new HashMap<String, Integer>();
		
		for( Map.Entry<String, Integer> s : map.entrySet() ){
			System.out.println(s.getKey());
			System.out.println(s.getValue());
		}
		
		
	}

}
