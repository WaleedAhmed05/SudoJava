package l33tc0de;

public class DeciBinary {
	
	 public static int minPartitions(String n) {
		 
		 char[] num_arry=n.toCharArray();
		 
		 int max=1;
		 for(int i=0; i<num_arry.length; i++ ) {
			 if(Integer.parseInt(num_arry[i]+"")>max)
				 max=Integer.parseInt(num_arry[i]+"");			 
		 }
		 
		 return max;
		 
	    }
	
	public static void main (String [] args) {
		
		System.out.println(minPartitions("27346209830709182346"));
	}

}
