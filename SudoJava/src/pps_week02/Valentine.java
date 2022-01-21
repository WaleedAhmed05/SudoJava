package pps_week02;

public class Valentine extends Card {

	private int kisses;
	
	public Valentine(String r, int k) {
		super(r, "Valentine");
		kisses=k;
	}
	
	public void greeting() {
		System.out.println("Dear "+ getRecipent());
		super.greeting();
		for (int i=0; i<kisses; i++) {
			System.out.print("X");
			
		}
		System.out.println("\n\n");
	}
	
}
