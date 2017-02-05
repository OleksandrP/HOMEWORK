package core.less6.homeowork;


public class Wheels {

	private double diameterWheels;
	
	private TypeWhiles typeWhiles;

	
	public void AddDiamertWheels(){
		diameterWheels+=0.5;
	}
	public void SubDiamertWheels(){
		diameterWheels-=0.5;
	}
	public Wheels(double diameterWheels, TypeWhiles typeWhiles) {
		this.diameterWheels = diameterWheels;
		typeWhiles = typeWhiles;
	}
	public double getDiameterWheels() {
		return diameterWheels;
	}
	public void setDiameterWheels(double diameterWheels) {
		this.diameterWheels = diameterWheels;
	}
	public TypeWhiles getTypeWhiles() {
		return typeWhiles;
	}
	public void setTypeWhiles(TypeWhiles typeWhiles) {
		typeWhiles = typeWhiles;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((typeWhiles == null) ? 0 : typeWhiles.hashCode());
		long temp;
		temp = Double.doubleToLongBits(diameterWheels);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (!(obj instanceof Wheels))
			return false;
		Wheels other = (Wheels) obj;
		if (typeWhiles == null) {
			if (other.typeWhiles != null)
				return false;
		} else if (!typeWhiles.equals(other.typeWhiles))
			return false;
		if (Double.doubleToLongBits(diameterWheels) != Double
				.doubleToLongBits(other.diameterWheels))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Wheels [diameterWheels=" + diameterWheels + ", TypeWhiles="
				+ typeWhiles + "]";
	}
	

}
