package core.less6.homeowork;

public class Cab { // кузов

	private String ColorCab;

public Cab(String ColorCab) {
	this.ColorCab = ColorCab;
}

public String getColorCab() {
	return ColorCab;
}

public void setColorCab(String ColorCab) {
	this.ColorCab = ColorCab;
}

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((ColorCab == null) ? 0 : ColorCab.hashCode());
	return result;
}

@Override
public boolean equals(Object obj) {
	if (this == obj) return true;
	if (obj == null) return false;
	if (!(obj instanceof Cab))
		return false;
	Cab other = (Cab) obj;
	if (ColorCab == null) {
		if (other.ColorCab != null)
			return false;
	} else if (!ColorCab.equals(other.ColorCab))
		return false;
	return true;
}

@Override
public String toString() {
	return "Cab [colorCab=" + ColorCab + "]";
}


	
}
