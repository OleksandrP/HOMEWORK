package core.less10.homework11;

public class Commodity implements Comparable<Commodity>{

	private String Name; 
	
	private int masa;
	
	private double Prise;

	private String Date;

	public  Commodity(String name, int masa,
			double prise, String date) {
		Name = name;
		this.masa = masa;
		Prise = prise;
		Date = date;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getMasa() {
		return masa;
	}

	public  void setMasa(int masa) {
		this.masa = masa;
	}


	public double getPrise() {
		return Prise;
	}

	public void setPrise(double prise) {
		Prise = prise;
	}

	public String getDate() {
		return Date;
	}

	public void setDate(String date) {
		Date = date;
	}

	@Override
	public String toString() {
		return "Commodity [Name=" + Name + ", masa=" + masa +", Prise=" + Prise + ", Date=" + Date + "]";
	}
	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Date == null) ? 0 : Date.hashCode());
		result = prime * result + ((Name == null) ? 0 : Name.hashCode());
		long temp;
		temp = Double.doubleToLongBits(Prise);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + masa;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (!(obj instanceof Commodity)) return false;
		Commodity other = (Commodity) obj;
		if (Date == null) {
			if (other.Date != null)
				return false;
		} else if (!Date.equals(other.Date))
			return false;
		if (Name == null) {
			if (other.Name != null)
				return false;
		} else if (!Name.equals(other.Name))
			return false;
		if (Double.doubleToLongBits(Prise) != Double
				.doubleToLongBits(other.Prise))
			return false;
		if (masa != other.masa)
			return false;
		return true;
	}

	@Override  // як сортувати
	public int compareTo(Commodity arg0){
		return Name.compareTo(arg0.getName());
	}
	
}

