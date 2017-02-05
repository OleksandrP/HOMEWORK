package hw8;

public class Steer {
	private boolean buttons;
	private int diameter;
	
	public Steer(boolean buttons, int diameter) {
		this.buttons = buttons;
		this.diameter = diameter;
	}
	
	public boolean isButtons() {
		return buttons;
	}

	public void setButtons(boolean buttons) {
		this.buttons = buttons;
	}

	public int getDiameter() {
		return diameter;
	}
	public void setDiameter(int diameter) {
		this.diameter = diameter;
	}

	@Override
	public String toString() {
		return "Steer [buttons=" + buttons + ", diameter=" + diameter + "]";
	}
	
}