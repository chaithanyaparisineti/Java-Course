package oopsConcepts;
public class SmartFan extends SmartDevice{

	public SmartFan(int deviceId, String deviceName) {
		super(deviceId, deviceName);
	}
	@Override
	void turnon() {
		System.out.println("Turnon the Fan");
	}
	@Override
	void turnoff() {
		System.out.println("Turnoff the Fan");
	}

}
