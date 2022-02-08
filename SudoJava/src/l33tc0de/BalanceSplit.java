package l33tc0de;

//Simple pushdown automata approach to catch balance substrings.
//if next element is different add +1 else -1;


/*Question:
 * Count all the balance substring in a string.
 * Constraint are:
 * Input will be between 1 to 1000
 * Only 'L' or 'R' input.
 * always balance input.
 * 
 */

public class BalanceSplit {
	
	public static void main (String[] args) {
		
		String inp= "RLLLLRRRLR";
		
		
		char[] char_array= new char[inp.length()];
		
		for(int i=0; i<char_array.length; i++) {
			char_array[i]=inp.charAt(i);
		}
	
		int pda=0;
		int answer=0;		
		for (int i=0; i<char_array.length; i++) {
		
		
			if(char_array[i]=='L') 
				pda++;
			
			else 
				pda--;
					
			if(pda==0) {
				answer++;
			}
		}
				
		System.out.println(answer);
		
		
	}

}
