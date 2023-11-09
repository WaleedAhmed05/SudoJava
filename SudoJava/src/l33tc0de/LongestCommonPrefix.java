package l33tc0de;

public class LongestCommonPrefix {
	
	public static String longestCommonPrefix(String[] strs) {
		
		boolean flag=false;
		
		int shortest=strs[0].length();
		String shortest_word=strs[0];
		for(int i=0; i<strs.length; i++){
			if(strs[i].length()<shortest) {
				shortest=strs[i].length();
			    shortest_word=strs[i];
			}
		}

		String same="";
		for(int i=0; i<shortest_word.length(); i++) {
			if(flag==true) {
				break;
				}
			
				shortest_word.charAt(i); //word to compare.
				
						
			for(int j=0; j<strs.length; j++) {
				
				if(shortest_word.charAt(i)!=strs[j].charAt(i)) {
					flag=true;
				break;
				}
				if(j==strs.length-1)
				same=same+shortest_word.charAt(i);
		}
	
	}
		return same;
	}
	public static void main (String [] args) {
		
		String[] strs = {"flower","flow","flight"};
		System.out.println(longestCommonPrefix(strs));
	}

}
