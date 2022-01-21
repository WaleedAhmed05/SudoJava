package pps_week02;

public class Card {
	
	private String recipent, occasion;
	
	
	public String getRecipent() {
		return recipent;
	}
	public void setRecipent(String recipent) {
		this.recipent=recipent;
	}
	
	public String getOccasion() {
		return occasion;
	}
	
	public void setOccasion(String occasion) {
		this.occasion=occasion;
	}
	
	public Card(String recipent, String occasion ) {
		this.recipent=recipent;
		this.occasion=occasion;
		
	}
	
	public void greeting() {
		System.out.println("Happy "+ occasion);
		
		
	}

}
