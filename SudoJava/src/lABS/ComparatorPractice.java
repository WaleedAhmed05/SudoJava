package lABS;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class StringCompare{
	String string1;
	String string2;
	
	
	StringCompare(String s1, String s2){
		s1=this.string1;
		s2=this.string2;
	}
}

class SortbyString implements Comparator<String>{
	
	public int compare(String x, String y) {
			
		return y.compareTo(x);
		//sorting in reverse order.
	}
	
}


public class ComparatorPractice {
	
	public static void main(String[] args) {
		
		List<String> mylist= new ArrayList<String>();
		mylist.add("XxxX");
		mylist.add("ZxXxX");
		mylist.add("XzzZX");
		
		
		Collections.sort(mylist, new SortbyString());
		
		//System.out.println("aaa".compareTo("ebncasajsjnnanx"));
		//compareTo func compares characters with asc value;
		
		for(String s: mylist) {
			System.out.println(s);
		}
		
	}

}
