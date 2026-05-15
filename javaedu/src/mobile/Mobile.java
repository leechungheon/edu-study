package mobile;

abstract public class Mobile {
	private String mobileName;
	private int batterySize;
	private String osType;

	public Mobile(){
		
	}
	
	public Mobile(String mobileName, int batterySize, String osType){
		this.mobileName = mobileName;
		this.batterySize = batterySize;
		this.osType = osType;
	}
	
	abstract public void operate(int time);
	abstract public void charge(int time);
	
	public String getMobileName() {
		return mobileName;
	}
	public int getBatterySize() {
		return batterySize;
	}
	public void setBatterySize(int battery) {
		this.batterySize = battery;
	}
	public String getOsType() {
		return osType;
	}
}
