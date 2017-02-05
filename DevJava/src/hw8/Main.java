package hw8;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
	private static final List<Vehicle> list = new ArrayList<>();
	private static final Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		list.add(new Vehicle("Nissan","Gray","Sedan",false,280,16,185));
		list.add(new Vehicle("Mazda","Red","Hatchback",true,260,17,185));
		list.add(new Vehicle("Lexus","White","Crossover",true,300,21,215));
		list.add(new Vehicle("BMW","Darkblue","Sedan",true,280,18,195));
		list.add(new Vehicle("Mercedes","Black","Crossover",true,290,20,205));
		list.add(new Vehicle("Renault","Darkgray","Minivan",true,280,18,195));
		list.add(new Vehicle("Seat","White","Hatchback",false,260,16,185));
		list.add(new Vehicle("Skoda","Orange","Sedan",false,270,16,175));
		list.add(new Vehicle("Ford","Gray","Sedan",false,280,16,195));
		list.add(new Vehicle("Mitsubishi","Black","Sedan",true,250,17,175));	
		while(true){
			switch (sc.next()) {
			
			case "1":
				System.out.println("   ");
				wheelDiameter(sc.nextInt(), list);
				break;

			default:
				sc.close();
				break;
			}
		}
	/*
	 * 1) Знайти машини, які мають введений діаметр коліс.
	 * 
	 * 2) Знайти машини, які мають введений діаметр коліс та колір кузова.
	 * 
	 * 3) Замінити в усіх машинах, які мають червоний колір кузова, кермо на
	 * інше.
	 * 
	 * 4) Збільшити діаметр коліс вдвічі, якщо кермо має кнопочки.
	 * 
	 * 5) Замінити усі машини, які мають колеса діаметром менші за введене
	 * значення, на інші машини.
	 */
	}
	static int wheelDiameter(int wheelDiameter, List<Vehicle> cars){
		System.out.println("Enter wheel diameter");
		for (int i= 0;i<cars.size();i++){
		Vehicle vehicle = cars.get(i);
		if(wheelDiameter==vehicle.getWheel().getWheelDiameter()){
			System.out.println(vehicle);
		}
		}
		return wheelDiameter;
	}
	
}