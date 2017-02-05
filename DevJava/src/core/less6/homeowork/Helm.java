package core.less6.homeowork;

public class Helm { // руль
	
	private String Justhelm;
	
	private int Buttom;
	
	private double DiameterHelm;

	public Helm(String justhelm, int buttom, double diameterHelm) {
		Justhelm = justhelm;
		Buttom = buttom;
		DiameterHelm = diameterHelm;
	}

	public String getJusthelm() {
		return Justhelm;
	}

	public void setJusthelm(String justhelm) {
		Justhelm = justhelm;
	}

	public int getButtom() {
		return Buttom;
	}

	public void setButtom(int buttom) {
		Buttom = buttom;
	}

	public double getDiameterHelm() {
		return DiameterHelm;
	}

	public void setDiameterHelm(double diameterHelm) {
		DiameterHelm = diameterHelm;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Buttom;
		long temp;
		temp = Double.doubleToLongBits(DiameterHelm);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result
				+ ((Justhelm == null) ? 0 : Justhelm.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (!(obj instanceof Helm)) return false;
		Helm other = (Helm) obj;
		if (Buttom != other.Buttom)
			return false;
		if (Double.doubleToLongBits(DiameterHelm) != Double
				.doubleToLongBits(other.DiameterHelm))
			return false;
		if (Justhelm == null) {
			if (other.Justhelm != null)
				return false;
		} else if (!Justhelm.equals(other.Justhelm))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Helm [Justhelm=" + Justhelm + ", Buttom=" + Buttom
				+ ", DiameterHelm=" + DiameterHelm + "]";
	}

	

}	
