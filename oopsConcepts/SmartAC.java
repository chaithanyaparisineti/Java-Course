package oopsConcepts;

public class SmartAC extends SmartDevice{

	public SmartAC(int deviceId, String deviceName) {
		super(deviceId, deviceName);
	}
	@Override
	void turnon() {
		System.out.println("Turnon the AC");
	}
	@Override
	void turnoff() {
		System.out.println("Turnoff the AC");
	}

}
