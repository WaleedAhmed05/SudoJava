package l33tc0de;

//Difficulty: Easy.
//["X++","++X","--X","X--"]

public class ManualOperation {

	
	public static void main(String [] args) {
		
		
		
		
		String[] inp_operations=  {"X++","++X","--X","X--","X--"};
		
		int X=0;
		for(int i=0; i<inp_operations.length; i++) {
			
			if(inp_operations[i].equals("X++")) { 
			X++;
			}
			
			else if(inp_operations[i].equals("++X")) {
				++X;
				}
			
			else if(inp_operations[i].equals("--X")) {
				--X;
				}
			
			else {
				X--;
				}
			
			
		}
		System.out.println(X);
		
	}
}
