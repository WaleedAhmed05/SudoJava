package pps_week02;

public class Crypto {

	
	public static void main(String[] args) {
		
		BombCoin bc= new BombCoin(4200, 99999);
		ScamCoin sc= new ScamCoin(5500, 88888);
		sc.latestUpdate();
		System.out.println(sc.coinName);
		//System.out.println(bc.latestUpdate());
	}
}
