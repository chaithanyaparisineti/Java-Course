package oopsConcepts;

public class SmartLight extends SmartDevice {

	public SmartLight(int deviceId, String deviceName) {
		super(deviceId, deviceName);
	}
	@Override
	void turnon() {
		System.out.println("Turnon the light");
	}
	@Override
	void turnoff() {
		System.out.println("Turnoff the light");
	}

}
