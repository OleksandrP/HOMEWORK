package core.less10.homework121;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {

	public static final List<Commodity> list = new ArrayList<>();
	public static Scanner SC = new Scanner(System.in);

	public static void main(String[] args) {
		list.add(new Commodity("Хліб", 5, 2));
		list.add(new Commodity("Молоко", 10, 2));
		list.add(new Commodity("Курка", 5, 2.5));
		list.add(new Commodity("Сир", 8, 1.2));
		list.add(new Commodity("Ковбаса", 4, 3.5));
		list.add(new Commodity("Чай", 5, 2.5));
		list.add(new Commodity("Сир", 8, 1.2));
		list.add(new Commodity("Риба", 3, 4.5));

		while (true) {
			System.out.println();
			System.out.println("--------------------------------------------");
			System.out.println("||Нажміть 1 щоб додати товар в ліст. ||");
			System.out.println("||Нажміть 2 щоб Видалити товар з ліста ||");
			System.out.println("||Нажміть 3 щоб Замінити товар в лісті. ||");
			System.out.println("||Нажміть 4 щоб посортувати по всьому ||");
			System.out.println("--------------------------------------------");
			System.out.println("Ведіть номер пункту : ");

			switch (SC.next()) {

			case "1":
				System.out.println("Додайте товар за певними критеріями");
				System.out.println("Ведіть назву товару");
				String nazvaTovary1 = SC.next();
				System.out.println("Ведіть кількість товару");
				int kilkistTovary1 = SC.nextInt();
				System.out.println("Ведіть вагу товару");
				double vagaTovary1 = SC.nextDouble();
				Functional.addTovar(nazvaTovary1, kilkistTovary1, vagaTovary1,
						list);
				
				break;

			case "2":
				Find.findCommodity();
				break;

			case "3":
				//Replace.replaceCommodity();
				break;

			case "4":
				sortByNameAsc().forEach(System.out::println);
				break;

			default:
				break;
			}

		}
	}
	static Stream<Commodity> sortByNameAsc(){   // implanment  в personi/ 6урок 
		List<Commodity> commoditys=new ArrayList<>(list);
		commoditys.sort(null);
		return list.stream().sorted();
		}
	
	
	
}