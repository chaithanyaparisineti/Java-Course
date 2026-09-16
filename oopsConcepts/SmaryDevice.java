package oopsConcepts;
abstract class SmartDevice {
	int DeviceId;
	String DeviceName;
	//constructor
	public SmartDevice(int deviceId, String deviceName) {
		super();
		DeviceId = deviceId;
		DeviceName = deviceName;
	}
	void display() {
		System.out.println("Device Id:"+DeviceId);
		System.out.println("Device Name:"+DeviceName);
		}
	
	//Abstract methods
abstract void turnon();

abstract void turnoff();
}
