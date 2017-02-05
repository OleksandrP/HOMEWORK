package core.less10.homeworkSet;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;

import core.less6.homeowork.Cab;
import core.less6.homeowork.Car;
import core.less6.homeowork.Helm;
import core.less6.homeowork.TypeWhiles;
import core.less6.homeowork.Wheels;

public class Main {

	private static final LinkedHashSet<Car> set = new LinkedHashSet<>();
	private static final Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		set.add(new Car("BMV", new Wheels(21, TypeWhiles.SUMMER), new Helm("Basic", 5,
				0.3), new Cab("RED")));
		set.add(new Car("Maserati", new Wheels(20, TypeWhiles.SUMMER), new Helm("Basic",
				5, 0.3), new Cab("BLACK")));
		set.add(new Car("Renault", new Wheels(18, TypeWhiles.SUMMER), new Helm("Basic",
				3, 0.4), new Cab("SILVER")));
		set.add(new Car("Peugeot", new Wheels(18, TypeWhiles.SUMMER), new Helm("Basic",
				6, 0.35), new Cab("BLACK")));
		set.add(new Car("Mersedes", new Wheels(18, TypeWhiles.SUMMER), new Helm("Basic",
				8, 0.35), new Cab("RED")));
		set.add(new Car("Porshe", new Wheels(21,TypeWhiles.SUMMER), new Helm("Basic",
				6, 0.3), new Cab("RED")));
		set.add(new Car("Audi", new Wheels(22, TypeWhiles.SUMMER), new Helm("Basic", 5,
				0.3), new Cab("WHITE")));
		set.add(new Car("Bugatti", new Wheels(23, TypeWhiles.SUMMER), new Helm("Skin",
				6, 0.4), new Cab("YELLOW")));
		set.add(new Car("Ford", new Wheels(24, TypeWhiles.SUMMER), new Helm("Basic", 5,
				0.3), new Cab("BLACK")));
		set.add(new Car("Tesla", new Wheels(18, TypeWhiles.SUMMER), new Helm("Basic", 6,
				0.4), new Cab("SILVER")));

		// 2. �������� ������, ������ ����� ���� ������ � �������� �������.
		// 3. ������ ������, �� ����� �������� ��� ��� �� ������ ���� ����
		// ������ � �������� �������.

		while (true) {
			Menu();
			switch (sc.next()) {
			case "1":
				ChangeWheels();
				break;
			case "2":
				deleteCar();
				break;
			case "3":
				ViewCar();
				break;
			default:
				break;
			}
		}

	}

	public static void Menu() {
		System.out
				.println("1. �������, �� ����� �������� ���� ������ �� �������� ������ ������, ������ ��� ��� �� ��������.");
		System.out
				.println("2. �������� ������, ������ ����� ���� ������ � �������� �������.");
		System.out
				.println("3. ������ ������, �� ����� �������� ��� ��� �� ������ ���� ���� ������ � �������� �������.");
	}

	public static void ChangeWheels() {
		System.out.println("������ ���� ������.");
		String color = sc.next().toUpperCase();
		System.out.println("������ ������� ������.");
		int Wheels = sc.nextInt();
		for (Car car : set) {
			if (car.getCab().getColorCab().toUpperCase().equals(color)
					&& car.getWheels().getDiameterWheels() == Wheels) {
				System.out.println(car);
				System.out.println("������ ����� ��� ����");
				car.setWheels(new Wheels(sc.nextDouble(), TypeWhiles.WINTER));
				System.out.println(car);
			}
		}
	}

	public static void deleteCar() {
		System.out.println("������ �������� �������� ������ ����.");
		Double min = sc.nextDouble();
		System.out.println("������ ����������� �������� ������ ����.");
		Double max = sc.nextDouble();
		Iterator<Car> iter = set.iterator();
		while (iter.hasNext()) {
			Car car = iter.next();
			if (car.getWheels().getDiameterWheels() > min
					&& car.getWheels().getDiameterWheels() < max) {
				iter.remove();
			}
		}
		set.forEach(System.out::println);
	}

	public static void ViewCar() {
		System.out.println("������ ��� ����.");
		String TypeWheels = sc.next().toUpperCase();
		System.out.println("������ �������� �������� ������ ����.");
		Double min = sc.nextDouble();
		System.out.println("������ ����������� �������� ������ ����.");
		Double max = sc.nextDouble();
		Iterator<Car> iter = set.iterator();
		while (iter.hasNext()) {
			Car car = iter.next();
			if (car.getWheels().getTypeWhiles().equals(TypeWheels)
					&& car.getWheels().getDiameterWheels() >= min
					&& car.getWheels().getDiameterWheels() <= max) {
				System.out.println(car);
			}
		}
	//	set.forEach(System.out::println);
	}

}
