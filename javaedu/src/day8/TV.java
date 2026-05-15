package day8;

public class TV {
	private String model;
	private int size;
	private int channel;
	
	public TV() {}
	public TV(String model, int size, int channel) {
		this.model = model;
		this.size = size;
		this.channel = channel;
	}
	public void channelUp() {
		channel = (channel + 1 > 10) ? 1 : channel + 1;
	}
	public void channelDown() {
		channel = (channel - 1 < 1) ? 10 : channel - 1;
	}
	public int getChannel() {
		return channel;
	}
	public String getModel() {
		return model;
	}
	public int getSize() {
		return size;
	}
}
