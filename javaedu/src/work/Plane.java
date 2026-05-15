package work;

abstract public class Plane {
	private String planeName;
	private int fuelSize;
	
	public Plane() {
		
	}
	
	public Plane(String planeName, int fuelSize) {
		this.planeName = planeName;
		this.fuelSize = fuelSize;
	}
	
	public String getPlaneName() {
		return planeName;
	}
	
	public int getFuelSize() {
		return fuelSize;
	}
	
	public void setFuelSize(int fuel) {
		fuelSize -=fuel;
	}
	
	public void refuel(int fuel) {
		fuelSize+=fuel;
	}
	
	abstract public void flight(int distance);
}
