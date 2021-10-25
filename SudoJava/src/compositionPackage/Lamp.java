package compositionPackage;

public class Lamp {
	private String style;
	private boolean battery;
	private int globRating;
	
	public Lamp(String style, boolean battery, int globRating) {
		//contructor
		this.style=style;
		this.battery=battery;
		this.globRating=globRating;
		//giving value through parameters
		
	}
	
	public void turnOn(){
		System.out.println("Lamp is being turned on!");
	}
	
	public String getStyle() {
		return style;
	}
	
	public boolean isBattery() {
		return battery;
		
	}
	
	public int getglobRating() {
		return globRating;
	}

}
