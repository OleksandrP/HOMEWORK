package core.less9.homework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

import core.less6.homeowork.Cab;
import core.less6.homeowork.Car;
import core.less6.homeowork.Helm;
import core.less6.homeowork.TypeWhiles;
import core.less6.homeowork.Wheels;


public class Main {

	private static final List<Car> list = new ArrayList<>();
	private static final Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {

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
		while(true){
			System.out.println("1. Знайти машини, які використовують введений тип кузова.");
			System.out.println("2. Видалити з списку усі машини, які мають введений колір кузова.");
			System.out.println("3. Замінити усім машинам, діаметр коліс яких лежить у введеному діапазоні шини на зимові."); // як попасти до Руля 
			System.out.println("4. Видалити усі машини, які мають введений тип кузова та введений діапазон діаметра керма.");
			System.out.println("5. Запам'ятати індекси машин, які мають введений тип кузова.");
		switch (sc.next()) {
			case "1":
				find();
				break;
			case "2":
				remove();				
				break;
			case "3":
				findWheels();	
				break;
			case "4":
				removeCab();	
				break;
			case "5":
				findIndexes();
				break;
					
			default:
				break;
			}
		}
		
	}
	static void find(){
	System.out.println("Введіть колір кузова");
	String color = sc.next().toUpperCase();
	for (Car car : list) {
		if(car.getCab().getColorCab().toUpperCase().contains(color)){
			System.out.println(car);
		}
	}
}
	static void remove(){
		System.out.println("Введіть колір кузова");
		String color = sc.next().toUpperCase();
		Iterator<Car> iter = list.iterator();
		while (iter.hasNext()) {
			Car car = iter.next();
			if(car.getCab().getColorCab().toUpperCase().contains(color)){
				iter.remove();
			}
		}
		list.forEach(System.out::println);
	}
	
		static void findWheels(){
			System.out.println("Введіть мінімальний діметр колеса.");
			int min = sc.nextInt();
			System.out.println("Введіть максимальний діметр колеса.");
			int max = sc.nextInt();
			Iterator<Car> iter = list.iterator();
			while (iter.hasNext()) {
				Car car = iter.next();
				if(car.getWheels().getDiameterWheels()> min && car.getWheels().getDiameterWheels()<max){
					car.setWheels(new Wheels(car.getWheels().getDiameterWheels(),TypeWhiles.WINTER)); 
				}
			}
			list.forEach(System.out::println);
		}
	
	
	static void removeCab(){   //незабудь про кому а не крапку.
		System.out.println("Введіть колір кузова.");
		String color = sc.next().toUpperCase();
		System.out.println("Введіть діаметр керма(0,3-0,4).");
		double diameter =sc.nextDouble();
		Iterator<Car> iter = list.iterator();
		while (iter.hasNext()) {
			Car car = iter.next();
			if(car.getCab().getColorCab().toUpperCase().contains(color) && car.getHelm().getDiameterHelm()==(diameter)){
				iter.remove();
			}
		}
		list.forEach(System.out::println);
	}
		
		
	
	static void findIndexes(){
		System.out.println("Введіть колір кузова");
		String color = sc.next().toUpperCase();
		List<Integer> res = new ArrayList<>();
		ListIterator<Car> iter = list.listIterator(list.size());
		while(iter.hasPrevious()){
			if(iter.previous().getCab().getColorCab().toUpperCase().contains(color)){
				res.add(iter.previousIndex()+1);
			}
		}
		System.out.println(res);
	}
}
