package core.less4.homework;

public class MyMath {

	public static void main(String[] args) {
		
		System.out.println(mult(CONS_PI,CONS_E));
	}
	
	public static final double CONS_PI=3.141;
	public static final double CONS_E=2.718;
	public static final double CONS_LN2=0.693;

	static double add(double a, double b) {
		return a + b;
	}
	static double sub(double a, double b) {
		return a - b;
	}
	static double mult(double a, double b){
		return a * b;
	}
	static double div(double a, double b) {
		return a / b;
	}
	
	
	
}
