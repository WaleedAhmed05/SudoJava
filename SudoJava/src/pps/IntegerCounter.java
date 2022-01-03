package pps;

public class IntegerCounter {
	
	public static long count(long num) {
		int counter=0;
		while(num>0) {
			num/=10;
			counter++;
		}
		
		return counter;
	}
	
	public static void main(String[] args) {
		
		System.out.println(count(1234912800)); // give any integer and it will return lenth
		
	}

}
