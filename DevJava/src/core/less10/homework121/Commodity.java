package core.less10.homework121;

public class Commodity {
	private String nazvaTovary;
	private int kilkistTovary;
	private double vaga;

	public Commodity(String nazvaTovary, int kilkistTovary, double vaga) {
		this.nazvaTovary = nazvaTovary;
		this.kilkistTovary = kilkistTovary;
		this.vaga = vaga;
	}

	public String getNazvaTovary() {
		return nazvaTovary;
	}

	public void setNazvaTovary(String nazvaTovary) {
		this.nazvaTovary = nazvaTovary;
	}

	public int getKilkistTovary() {
		return kilkistTovary;
	}

	public void setKilkistTovary(int kilkistTovary) {
		this.kilkistTovary = kilkistTovary;
	}

	public double getVaga() {
		return vaga;
	}

	public void setVaga(double vaga) {
		this.vaga = vaga;
	}

	@Override
	public String toString() {
		return "Commodity [nazvaTovary=" + nazvaTovary + ", kilkistTovary="
				+ kilkistTovary + ", vaga=" + vaga + "Í„" + "]";
	}

}