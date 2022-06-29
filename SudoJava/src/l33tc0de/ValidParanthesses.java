package l33tc0de;

/**
 * @author Waleed05
 * @description-
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 * An input string is valid if:
 * Open brackets must be closed by the same type of brackets.
 * Open brackets must be closed in the correct order.
 * 
 * Input: s = "()[]{}" Output: true
 * Input: s = "(]" Output: false
 * 
 */

import java.util.EmptyStackException;
import java.util.Stack;

public class ValidParanthesses {
	
	 public static boolean isValid(String s) {
	        
		 char[] mychar= s.toCharArray();
		 Stack<Character> mystack= new Stack<Character>();
		 boolean wrongEmpty=false;
		 boolean finalflag=false;
		 for(int i=0; i<s.length(); i++) {
			 
			 
			 if(mychar[i]=='[' || mychar[i]=='{' || mychar[i]=='(') {
				 
				 if(mychar[i]=='[')
				 mystack.push(']');
				 
				 else if(mychar[i]=='{')
					 mystack.push('}');
				 
				 else
					 mystack.push(')');
				 
			 }
				 //mystack.add('(');
			 
			 if(mychar[i]==']' || mychar[i]=='}' || mychar[i]==')') {
				 try {
				 if((char)mystack.peek()==mychar[i]) {
					 mystack.pop();}
				 
				 else {
					 finalflag=false;
					 break;
				 }
				 }
				 catch(EmptyStackException e) {
					 finalflag=false;
					 wrongEmpty=true;
					 
				 }
				 
		 }
			 
			 
		 }
		 
		 if(mystack.empty() && wrongEmpty==false)
			 finalflag=true;
		 
		 
		 return finalflag;
	    }
	 
	 public static void main(String [] args) {
		 
		System.out.println(isValid("(])"));
		System.out.println(isValid("(())"));
		 
	 } 

}
