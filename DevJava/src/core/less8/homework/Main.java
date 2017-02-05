package core.less8.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import core.less6.homeowork.Cab;
import core.less6.homeowork.Car;
import core.less6.homeowork.Helm;
import core.less6.homeowork.TypeWhiles;
import core.less6.homeowork.Wheels;


public class Main {

	public static final Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
				
		List <Car> list = new ArrayList<>(); 
		list.add(new Car("BMV", new Wheels(21, TypeWhiles.SUMMER), new Helm("Basic", 5, 0.3), new Cab("RED"))); 
		list.add(new Car("Maserati",new Wheels(20, TypeWhiles.SUMMER), new Helm("Basic", 5, 0.3), new Cab("BLACK"))); 
		list.add(new Car("Renault",new Wheels(18, TypeWhiles.SUMMER), new Helm("Basic", 3, 0.4), new Cab("SILVER"))); 
		list.add(new Car("Peugeot",new Wheels(18, TypeWhiles.SUMMER), new Helm("Basic", 6, 0.35), new Cab("BLACK"))); 
		list.add(new Car("Mersedes",new Wheels(18,TypeWhiles.SUMMER), new Helm("Basic", 8, 0.35), new Cab("RED")));
		list.add(new Car("Porshe",new Wheels(21,TypeWhiles.SUMMER), new Helm("Basic", 6, 0.3), new Cab("RED")));
		list.add(new Car("Audi",new Wheels(22,TypeWhiles.SUMMER), new Helm("Basic", 5, 0.3), new Cab("WHITE")));
		list.add(new Car("Bugatti",new Wheels(23, TypeWhiles.SUMMER), new Helm("Skin", 6, 0.4), new Cab("YELLOW")));
		list.add(new Car("Ford",new Wheels(24, TypeWhiles.SUMMER), new Helm("Basic", 5, 0.3), new Cab("BLACK")));
		list.add(new Car("Tesla",new Wheels(18, TypeWhiles.SUMMER), new Helm("Basic",6, 0.4), new Cab("SILVER")));
		
		
		System.out.println("1.  Знайти машини, які мають введений діаметр коліс.");
		System.out.println("2.  Знайти машини, які мають введений діаметр коліс та колір кузова.");
		System.out.println("2.2 Знайти машини, які мають введений діаметр коліс та колір кузова.");
		System.out.println("3.  Замінити в усіх машинах, які мають червоний колір кузова, кермо на інше.");
		System.out.println("4.  Збільшити діаметр коліс вдвічі, якщо кермо має кнопочки.");
		System.out.println("5.  Замінити усі машини, які мають колеса діаметром менші за введене значення, на інші машини.");
		while (true){
		switch (sc.next()) {  
			case "1": 
				System.out.println("Ведіть діаметр колеса:"); 
				double diametrWheels = sc.nextDouble(); 
				diametrWheels(diametrWheels,list); 
			break;
			case "2": 
				System.out.println("Ведіть діаметр колеса, а потім колір кузова"); 
				double diametrWheels1 = sc.nextDouble(); 
				diametrWheels(diametrWheels1,list);
				String ColorCab = sc.next().toUpperCase();
				Cabs(ColorCab,list); 
			break;
			case "2.2": 
				System.out.println("Ведіть діаметр колеса, а потім колір кузова"); 
				double diametrWheels2 = sc.nextDouble();
				ColorCab = sc.next().toUpperCase();
				ColorCab ( diametrWheels2, ColorCab, list);
			case "3": 
				System.out.println("Ведіть колір кузова, для заміни керма"); 
				String changeColorCab = sc.next().toUpperCase();
				changeColorCab(changeColorCab, list, new Helm ("Skin", 6, 0.35));
				
			break;
			case "4": 
				System.out.println("Ведіть кількість кнопочок,та у виведній машині діаметр колеса збільшиться вдвічі"); 
				int Buttom = sc.nextInt(); 
				changeDiametr(Buttom, list); 
			break;
			case "5": 
				Change(list);
				
			break;
			default:
				sc.close();
				break;
			}
	}
	}		
		public static double diametrWheels(double diametrWheels, List<Car> cars) { 
		for (int i= 0;i<cars.size();i++) { 
			Car car = cars.get(i); 
			if(diametrWheels==car.getWheels().getDiameterWheels()) { 
				System.out.println(car); 
				} 
			} 
			return diametrWheels; 
		}
		
		public static String Cabs(String ColorCab, List<Car> cars) { 
			for (int i= 0;i<cars.size();i++) {
				Car car = cars.get(i); 
				if(ColorCab.equals(car.getCab().getColorCab())) { 
					System.out.println(car); 
					} 
				}
				return  ColorCab; 
			}
		
		public static void ColorCab(double diametrWheels, String ColorCab, List<Car> cars) { 
		for (Car car : cars) { 
		if (diametrWheels == car.getWheels().getDiameterWheels() && ColorCab.equals(car.getCab().getColorCab())) { 
		System.out.println(car); 
				} 
			} 
		}

//		public static void SetHelm(String ColorCab, List<Car> cars){
//			for (int i= 0;i< cars.size();i++) {
//			Car car = cars.get(i); 
//				if(ColorCab.equals(car.getCab().getColorCab())) { 
//						if(ColorCab.equals("RED")){
//							car.setHelm(new Helm("skin"));
//							 
//					} System.out.println(cars);	
//				}	
//			}
//		}
		public static void changeColorCab(String ColorCab, List<Car> cars, Helm helm) { 
			List<Car> result = new ArrayList<>(); 
			for (Car car : cars) { 
				if (ColorCab.equals(car.getCab().getColorCab())) { 
					System.out.println("Зі старим кермом: "); 
					System.out.println(car); 
					car.setHelm(new Helm ("Skin", 5, 0.35)); 
					result.add(car); 	// патерн НВС.
				} 
			} 
			System.out.println("З новим кермом: "); 
			result.forEach(System.out::println); 
		}
		
		
		public static void changeDiametr(int Buttom , List<Car> cars) { 
			for(Car car : cars) { 
			if(Buttom == car.getHelm().getButtom()) { 
			System.out.println("Машина яка має стільки кнопочок: "); 
				}
			Wheels wheels = car.getWheels(); 
				wheels.setDiameterWheels(wheels.getDiameterWheels() * 2); 
			System.out.println(car); 
				} 
			}
		
		public static void Change(List<Car> cars){
		List <Car> result = new ArrayList<>();
		//list2.add(new Car("Ford",new Wheels(24, "SUMMER"), new Helm("Basic", 5, 0.3), new Cab("BLACK")));
		System.out.println("Введіть діаметр колеса.");
		double DiameterWheels = sc.nextDouble();
		for(Car car : cars){
			if(DiameterWheels>car.getWheels().getDiameterWheels()){
				System.out.println(car); 
				//car.setBrand(new Brand(sc.next())); 
				System.out.println("Введіть нові колеса");
				car.setWheels(new Wheels(sc.nextInt(), TypeWhiles.WINTER)); 
				System.out.println("Введіть параметри нового керса.");
				car.setHelm(new Helm(sc.next(),sc.nextInt(), sc.nextInt()) ); 
				System.out.println("Введіть колір кузова.");
				car.setCab(new Cab(sc.next() )); 
				result.add(car); 
				//cars.set(1,(Car) list2);
				
			}System.out.println("Нові характеритики машин"); 
			System.out.println(result); 
		}
		}
		
}