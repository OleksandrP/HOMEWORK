package kidbook;

public class Car {

	public static void main(String[] args) {
		drive(24);
		JamesBondCar(12);
	}
	
	static void start(){}
	static void stop(){}
		
	static int drive(int howlong){
		int distanse= howlong*60;
		System.out.println(distanse);
		return distanse;
	}
	static void JamesBondCar(int howlong){
		int distance=howlong*180;
		System.out.println(distance);
	}
	
	
	
	
}
