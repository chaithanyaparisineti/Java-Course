package myprojectworkspace;

public class Recharge {
	String planName="unlimited";
	int validity=28;
	Double date=1.5;
	String calls="unlimited";
	int amount=299;
	void showplanDetails() {
		System.out.println("current Recharge plan");
		System.out.println("planName:"+planName);
		System.out.println("validity:"+validity+"days");
		System.out.println("date:"+date+"date");
		System.out.println("calls:"+calls);
		System.out.println("amount:"+299);
		System.out.println("Recharge successful");
	}
	public static void main(String[] args) {
		Recharge R1=new Recharge();
		R1.showplanDetails();
	}

}
