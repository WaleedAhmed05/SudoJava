package l33tc0de;

public class BuddyString {
	
	public static boolean mainfunc(String s, String goal) {

		
		boolean statement=false;
		
		
		
		if(s.length()==goal.length() && !s.equals(goal)) {
			
			
			char[] s_array=new char[s.length()];
			char[] goal_array=new char[goal.length()];
			
			
			//loop for making String to char array.
			for (int i=0; i<s_array.length; i++) {
				
				s_array[i]=s.charAt(i);
				goal_array[i]=goal.charAt(i);
				}
			
			
			for(int i=0; i<s_array.length-1; i++) {
				if(s_array[i]==goal_array[i]) {
					System.out.println("Equal");
				}
				
				else {
					char x=s_array[i];
					s_array[i]=s_array[i+1];
					s_array[i+1]=s_array[i];
				}
			}
			
			
			if(s_array.equals(goal_array))
			statement=true;
			
			else
				statement =false;
			//TODO
			
		}
		
		else {
			statement= false;
		}
		
		return statement;
	}
	
	
	public static void main (String[] args) {
		
		
		System.out.println(mainfunc("aab","aaa"));
		
	}

}
