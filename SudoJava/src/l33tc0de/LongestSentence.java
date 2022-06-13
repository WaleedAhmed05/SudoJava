package l33tc0de;

public class LongestSentence {
	
	

	    public static int mostWordsFound(String[] sentences) {
	        
	        int count=0;
	        int maxCount=0;
	        for(int i=0; i<sentences.length; i++){
	           
	        	
	        	String[] temp=sentences[i].split(" ");
	        	count=temp.length;
	        	
	        	if(count>maxCount)
	        		maxCount=count;
	           	            
	        }
	        
	        return maxCount;
	        
	    }
	
	    
	    public static void main(String args[]) {
	    	
	    	String[] sentence={"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
	    	
	    	System.out.println(mostWordsFound(sentence));
	    	
	    }

}
