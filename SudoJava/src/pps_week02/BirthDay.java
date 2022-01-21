package pps_week02;

public class BirthDay extends Card {
	
	private int age;
	
	public BirthDay(String recipent, int age) {
		super(recipent, "BirthDay");	
		this.age=age;
	}
	
	public void greeting() {
		System.out.println("Dear " + getRecipent());
		super.greeting();
		System.out.println("Happy "+ age+ "Birthday ");
	}

}
