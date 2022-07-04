package l33tc0de;


/**
 * @author Waleed05
 * @description-
 * Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, 
 *  or -1 if needle is not part of haystack
 * 
 * Input: haystack = "hello", needle = "ll"
 * Output: 2
 * 
 */


public class ImplementSTR {
	public static int strStr(String haystack, String needle) {
        

		 if(needle.isEmpty() || needle.length()>haystack.length())
			 return 0;
		 
		 if(haystack.equals(needle))
			 return 0;
		 
		 char[] mychar=haystack.toCharArray();
		 char[] mychar2=needle.toCharArray();
		 
		 int counter=0;
		 int size=mychar2.length;
		 int result=-1;
		 	 
		 for(int i=0; i<mychar.length; i++) {
			 
			 counter=i;
			 for(int j=0; j<mychar2.length; j++) {
				 			 
				 if(mychar.length-i>=mychar2.length && mychar[counter]==mychar2[j]) {
					 counter++;
					 size--;
					 
					 if(size==0) {
						 size=0;
						 break; //early end
					 }
				 }
				 else {
					
					 size=mychar2.length;
					 break; //early end for inner loop
				 }
				 
			 } 
			 			 
			 if(size==0){
				 result=counter-mychar2.length;
				 break; //early end for outer loop
				 
				 }			 
		 }
		 return result;
	    }
	
	 
	 public static void main(String[] args) {
		 
		 String haystack = "abc";
		 String needle = "c";
		 
//		 String haystack = "hello";
//		 String needle = "ll";
	

		 
		 System.out.println(strStr(haystack,needle));
		 
	 }

}
