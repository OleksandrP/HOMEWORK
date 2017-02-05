package core.less6.homeowork;

public class Main {

	public static void main(String[] args) {

		Car car = new Car("Porshe", new Wheels(21, TypeWhiles.SUMMER), new Helm("Basic", 5, 0.35),
				new Cab("red"));
		System.out.println(car);
		car.AddDiamertWheels();
		
		
	}

}
