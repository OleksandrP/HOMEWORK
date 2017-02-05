package core.less6.homeowork;

public class Car {

	private String Brand;
	
	private Wheels wheels;
	
	private Helm helm;
	
	private Cab cab;

	public Car(String brand, Wheels wheels, Helm helm, Cab cab) {
		Brand = brand;
		this.wheels = wheels;
		this.helm = helm;
		this.cab = cab;
	}	
	public Car(String brand, double DiameterWheels,TypeWhiles typeWhiles,String Justhelm, int Buttom, double DiameterHelm, String ColorCab) {
		Brand = brand;
		this.wheels =  new Wheels(DiameterWheels, typeWhiles);
		this.helm = new Helm(Justhelm, Buttom,DiameterHelm);
		this.cab = new Cab(ColorCab);
	}
	

	public void AddDiamertWheels(){
		wheels.AddDiamertWheels();
	}
	
	public void SubDiamertWheels(){
		wheels.SubDiamertWheels();
	}
	public String getBrand() {
		return Brand;
	}
	public void setBrand(String brand) {
		Brand = brand;
	}
	public Wheels getWheels() {
		return wheels;
	}
	public void setWheels(Wheels wheels) {
		this.wheels = wheels;
	}
	public Helm getHelm() {
		return helm;
	}
	public void setHelm(Helm helm) {
		this.helm = helm;
	}
	public Cab getCab() {
		return cab;
	}
	public void setCab(Cab cab) {
		this.cab = cab;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Brand == null) ? 0 : Brand.hashCode());
		result = prime * result + ((cab == null) ? 0 : cab.hashCode());
		result = prime * result + ((helm == null) ? 0 : helm.hashCode());
		result = prime * result + ((wheels == null) ? 0 : wheels.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (!(obj instanceof Car)) return false;
		Car other = (Car) obj;
		if (Brand == null) {
			if (other.Brand != null)
				return false;
		} else if (!Brand.equals(other.Brand))
			return false;
		if (cab == null) {
			if (other.cab != null)
				return false;
		} else if (!cab.equals(other.cab))
			return false;
		if (helm == null) {
			if (other.helm != null)
				return false;
		} else if (!helm.equals(other.helm))
			return false;
		if (wheels == null) {
			if (other.wheels != null)
				return false;
		} else if (!wheels.equals(other.wheels))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Car [Brand=" + Brand + ", wheels=" + wheels + ", helm=" + helm
				+ ", cab=" + cab + "]";
	}

	
	
	
	
}

	
	