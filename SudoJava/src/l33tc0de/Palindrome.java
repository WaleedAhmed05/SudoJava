package l33tc0de;

/**
 * @author Waleed05
 * @description-
 * Given an integer x, return true if x is palindrome integer.
 * An integer is a palindrome when it reads the same backward as forward.
 * For example, 121 is a palindrome while 123 is not.
 * 
 * 
 * Input: x = 121
 * Output: true
 * Explanation: 121 reads as 121 from left to right and from right to left.
 * 
 */



public class Palindrome {
	
	public static  boolean isPalindrome(int x) {
		
	 char[] myarr= (x+"").toCharArray();
	 String someVar="";
	 
	for(int i=myarr.length-1; i>=0; i--) {
		someVar+=myarr[i];
	}
	
	 return (someVar.equalsIgnoreCase(x+"")) ?  true : false;
	}
	    
	
	
	public static void main (String [] args) {
		
	System.out.println(isPalindrome(121));

}
}
