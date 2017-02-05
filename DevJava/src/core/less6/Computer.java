package core.less6;

public class Computer {

	private String vendor;  // have E
	
	private Cpu cpu;   //агрегація коли ком не може жити буз cpu, композиція коли комп може працювати без CPU,
	
	private Ram ram;
	
	private Hdd Hdd;

	public Computer(String vendor, Cpu cpu, Ram ram, Hdd hdd) {
		this.vendor = vendor;
		this.cpu = cpu;
		this.ram = ram;
		this.Hdd = hdd;
	}
	
	public Computer(String vendor, double cpuFrequency, int count, int ramFrequency, int volume, int capacity) {
		this.vendor = vendor;
		this.cpu = new Cpu (cpuFrequency,  count);
		this.ram = new Ram(ramFrequency, volume);
		this.Hdd = new Hdd(capacity) ;
	}
	
	
	

	public void turboBoost() { // метод обгортка/ делегування -  патерн фасад
		cpu.turboBoost();
	}




	public String getVendor() {
		return vendor;
	}

	public void setVendor(String vendor) {
		this.vendor = vendor;
	}

	public Cpu getCpu() {
		return cpu;
	}

	public void setCpu(Cpu cpu) {
		this.cpu = cpu;
	}

	public Ram getRam() {
		return ram;
	}

	public void setRam(Ram ram) {
		this.ram = ram;
	}

	public Hdd getHdd() {
		return Hdd;
	}

	public void setHdd(Hdd hdd) {
		Hdd = hdd;
	}

	@Override
	public String toString() {
		return "Computer [vendor=" + vendor + ", cpu=" + cpu + ", ram=" + ram
				+ ", Hdd=" + Hdd + "]";
	}

	
	
}
