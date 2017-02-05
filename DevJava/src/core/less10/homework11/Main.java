package core.less10.homework11;

//4. Посортувати по всьому (при натисканні повинне випасти меню, яке запропонує по якому полю посортувати. Після вибору поля обрати напрям сортування). Створити усі необхідні компаратори. 

import static core.less10.homework11.Menu.Menu;
import static java.util.Comparator.comparing;
import static java.util.Comparator.comparingInt;
import static java.util.stream.Collectors.toList;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {

	static final Scanner SC = new Scanner(System.in);
	static final List<Commodity> list = new ArrayList<>();

	public static void main(String[] args) {
		list.add(new Commodity("2IN1", 25, 10.5, "12.12.2016"));
		list.add(new Commodity("2IN1", 50, 15.5, "11.12.2016"));
		list.add(new Commodity("2IN1", 100, 18.5, "11.12.2016"));
		list.add(new Commodity("2IN1", 150, 22.5, "11.12.2016"));
		list.add(new Commodity("EXTRA2IN1", 25, 10.5, "11.12.2016"));
		list.add(new Commodity("EXTRA2IN1", 50, 15.5, "11.12.2016"));
		list.add(new Commodity("EXTRA2IN1", 100, 18.5, "11.12.2016"));
		list.add(new Commodity("EXTRA2IN1", 150, 22.5, "12.12.2016"));
		list.add(new Commodity("EXTRAWHITE", 25, 10.5, "11.12.2016"));
		list.add(new Commodity("EXTRAWHITE", 50, 15.5, "12.12.2016"));
		list.add(new Commodity("EXTRAWHITE", 100, 18.5, "11.12.2016"));
		list.add(new Commodity("EXTRAWHITE", 150, 22.5, "12.12.2016"));
		list.add(new Commodity("PRO", 25, 20.5, "11.12.2016"));
		list.add(new Commodity("PRO", 50, 25.5, "11.12.2016"));
		list.add(new Commodity("PRO", 100, 28.5, "11.12.2016"));
		list.add(new Commodity("PRO", 150, 29.5, "11.12.2016"));
		list.add(new Commodity("EXTRA", 25, 20.5, "12.12.2016"));
		list.add(new Commodity("EXTRA", 50, 25.5, "12.12.2016"));
		list.add(new Commodity("EXTRA", 100, 28.5, "12.12.2016"));
		list.add(new Commodity("EXTRA", 150, 29.5, "12.12.2016"));

		Menu();
		boolean isRun = true;
		while (isRun) {
			switch (SC.next()) {
			case "1":
				AddList(list);
				Menu();
				break;
			case "2":
				Find.findCommodity();
				break;
			case "3":
				Change();
				break;
			case "4":
				Find.ChangeCommodity(list);
				break;
			case "0":
				isRun = false;
				break;

			default:
				SC.close();
				break;
			}
		}
	}

	public static Commodity AddList(List<Commodity> list) {
		System.out.println("Введіть назву товару.");
		String Name1 = SC.next();
		System.out.println("Введіть масу тари.");
		int Masa1 = SC.nextInt();
		System.out.println("Веведіть вартість продукції.");
		Double Prise1 = SC.nextDouble();
		System.out.println("Введіть дату.");
		String Date1 = SC.next();
		Commodity commodity = new Commodity(Name1, Masa1, Prise1, Date1);
		list.add(commodity);
		for (Commodity commodity2 : list) {
			System.out.println(commodity2);
		}
		return commodity;
	}

	public static void Change() {
		System.out.println("Введіть назву товару.");
		String Name1 = SC.next().toUpperCase();
		System.out.println("Введіть масу тари.");
		int Masa1 = SC.nextInt();
		System.out.println("Веведіть вартість продукції.");
		Double Prise1 = SC.nextDouble();
		System.out.println("Введіть дату.");
		String Date1 = SC.next().toUpperCase();
		Iterator<Commodity> iter = list.iterator();
		while (iter.hasNext()) {
			Commodity commodity = iter.next();
			if (Name1.equals(commodity.getName())
					&& Masa1 == commodity.getMasa()
					&& Prise1 == commodity.getPrise()
					&& Date1.equals(commodity.getDate())) {
				System.out.println(commodity);
				System.out
						.println("Товар за всіма введеними критеріями видалений");
				iter.remove();
				AddList(list);
			}
		}
	}
}
