package l33tc0de;

/*
 * 
 * Given a valid (IPv4) IP address, return a defanged version of that IP address.
 * A defanged IP address replaces every period "." with "[.]"
 * Input: address = "1.1.1.1"
 * Output: "1[.]1[.]1[.]1"
 */

import java.util.ArrayList;
public class DefangeIPAddress {
	
	
	public static String defangIPaddr(String address) {
		
		char[] tempchar= address.toCharArray();
		String result="";
		for(int i=0; i<tempchar.length; i++) {
			
			if(tempchar[i]=='.') {
				result+="[.]";
			}
			else
			result+=tempchar[i];
		}
		
		return result;
	
        
    }
	
	public static void main (String[] args) {
		System.out.println(defangIPaddr("255.100.50.0"));
	}
}
