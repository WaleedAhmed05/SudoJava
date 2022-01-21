package pps_week02;

public class BombCoin {
	
	private int value;
	private long marketCap;
	String coinName="BigCoin";
	
	public int getValue(int value) {
		return value;
	}
	
	public void setValue(int value) {
		this.value=value;
	}
	
	public long getMarketCap(long marketCap) {
		return marketCap;
	}

	public BombCoin(int value, long marketCap) {
		this.value=value;
		this.marketCap=marketCap;
	}
	
	public void latestUpdate() {
		System.out.println("Latest Market Value is: "+marketCap);
	}
}
