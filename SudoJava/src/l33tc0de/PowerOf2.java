package l33tc0de;

public class PowerOf2 {
	
	 public boolean isPowerOfTwo(int n) {
	        
	        boolean flag=false;
		        
	    for(int i=0; i<33; i++) {
			 
			 int val = (int)Math.pow(2,i);
			 if(val==n) {
				 flag=true;
				 break;
				 			 
			 }
		 }
		 
				 
	        return flag;
	    }

}
