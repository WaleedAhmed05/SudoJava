package l33tc0de;


/*
 * Reverse string without using any DS.
 */
public class ReverseString {
public void reverseString(char[] s) {
      
	int j=s.length-1;
	
	for(int i=0; i<s.length; i++) {
		if(i>=j)
			break;
		char ch = s[i];
		s[i]=s[j];
		s[j]=ch;
		
		j--;
		
	}
	
	
	
	for(char x: s) {
		System.out.print(x+" ");
	}
        
    }

}