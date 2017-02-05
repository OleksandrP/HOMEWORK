package core.less11.homework;

import java.io.Serializable;
import java.util.List;

public class Pet implements Serializable{


	private static final long serialVersionUID = -8245775339800009245L;

	String namePet;
	
	int agePet;
	
	String classPet;
	
	public Pet(String namePet, int agePet, String classPet) {
		this.namePet = namePet;
		this.agePet = agePet;
		this.classPet = classPet;
	}
	
	public String getNamePet() {
		return namePet;
	}


	public void setNamePet(String namePet) {
		this.namePet = namePet;
	}


	public int getAgePet() {
		return agePet;
	}


	public void setAgePet(int agePet) {
		this.agePet = agePet;
	}


	public String getClassPet() {
		return classPet;
	}


	public void setClassPet(String classPet) {
		this.classPet = classPet;
	}


	@Override
	public String toString() {
		return "Pet [NamePet=" + namePet + ", AgePet=" + agePet + ", ClassPet="
				+ classPet + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + agePet;
		result = prime * result
				+ ((classPet == null) ? 0 : classPet.hashCode());
		result = prime * result + ((namePet == null) ? 0 : namePet.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Pet))
			return false;
		Pet other = (Pet) obj;
		if (agePet != other.agePet)
			return false;
		if (classPet == null) {
			if (other.classPet != null)
				return false;
		} else if (!classPet.equals(other.classPet))
			return false;
		if (namePet == null) {
			if (other.namePet != null)
				return false;
		} else if (!namePet.equals(other.namePet))
			return false;
		return true;
	}
}
