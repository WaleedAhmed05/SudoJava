package l33tc0de;


/*
 * Input: s = "abbaca"
 * Output: "ca"
 * Explanation: For example, in "abbaca" we could remove "bb" since the letters are adjacent and equal,
 * and this is the only possible move.  The result of this move is that the string is "aaca",
 * of which only "aa" is possible, so the final string is "ca".
 * 
 */
public class RemoveAdjacentDuplicates {
	
    public static String removeDuplicates(String s) {
    	
    	if(s.length()==0)
    		return s;
    	
    	if(!hasDuplicates(s)) {
    		return s;
    	}
    	
    	else {
    		char[] tempchar=s.toCharArray();
    		String result="";
    		//System.out.println(tempchar.length);
        	for(int i=0; i<tempchar.length-1; i++) {
        		
        		//System.out.println(i);
        		//char temp=tempchar[i-1];
        		if(tempchar[i]==tempchar[i+1]) {
        			tempchar[i]='0';
        			tempchar[i+1]='0';
        			}
        		else {
        			
        			result+=tempchar[i];
        		}
        		
        		
        	}
        	result="";
        	for(char c:tempchar) {
        		if(c!='0')
        		result+=c+"";
        		//System.out.print(c+" ");
        		
        	}
        	return removeDuplicates(result);
    	}
    	
    	
        
    }
    
    public static boolean hasDuplicates(String s) {
    	char[] tempchar=s.toCharArray();
    	boolean result=false;
    	
    	if(s.length()==0)
    		return result;
    	
    	else {
    	char temp=tempchar[0];
    	for(int i=1; i<tempchar.length; i++) {
    		
    		if(tempchar[i]==tempchar[i-1]) {
    			result=true;
    			break;
    			
    			}
    		
    		
    	}
    	}
    	
    	return result;
    }

public static void main(String args[]) {
	
	String s="xyyxzsxzxx";
	System.out.println(removeDuplicates(s));
	
	
}

}
