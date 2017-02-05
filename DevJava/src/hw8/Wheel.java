package hw8;

public class Wheel {
	private int wheelDiameter;
	private int width;
	
	public Wheel(int wheelDiameter, int width) {
		this.wheelDiameter = wheelDiameter;
		this.width = width;
	}

	public int getWheelDiameter() {
		return wheelDiameter;
	}

	public void setWheelDiameter(int wheelDiameter) {
		this.wheelDiameter = wheelDiameter;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	@Override
	public String toString() {
		return "Wheel [wheelDiameter=" + wheelDiameter + ", width=" + width
				+ "]";
	}

	
	
}

