package hw8;

public class Vehicle {
	private String brand;
	private Body body;
	private Steer steer;
	private Wheel wheel;

	public Vehicle(String brand, Body body, Steer steer, Wheel wheel) {
		this.brand = brand;
		this.body = body;
		this.steer = steer;
		this.wheel = wheel;
	}
	public Vehicle(String brand, String bodyColor, String bodyType, boolean steerButtons, int steerDiameter, int wheelDiameter, int wheelWidth){
		this.brand = brand;
		this.body = new Body(bodyColor, bodyType);
		this.steer = new Steer(steerButtons, steerDiameter);
		this.wheel = new Wheel(wheelDiameter, wheelWidth);
	}
	
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public Body getBody() {
		return body;
	}

	public void setBody(Body body) {
		this.body = body;
	}

	public Steer getSteer() {
		return steer;
	}

	public void setSteer(Steer steer) {
		this.steer = steer;
	}

	public Wheel getWheel() {
		return wheel;
	}

	public void setWheel(Wheel wheel) {
		this.wheel = wheel;
	}
	@Override
	public String toString() {
		return "Vehicle [brand=" + brand + ", body=" + body + ", steer="
				+ steer + ", wheel=" + wheel + "]";
	}

}

