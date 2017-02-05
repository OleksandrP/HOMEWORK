package core.less10.homework11;

import java.util.Iterator;

import static core.less10.homework11.Main.*;

public class Finder{ 
	static void DeleteAll(){
	System.out.println("Введіть назву товару");
	String Name1 = SC.next().toUpperCase();
	System.out.println("Введіть вагу товару");
	int Masa1 = SC.nextInt();
	System.out.println("Введіть ціну товару");
	double Prise1 = SC.nextDouble();
	System.out.println("Введіть дату товару");
	String Date1 = SC.next().toUpperCase();
	Iterator<Commodity> iter = list.iterator();
	while (iter.hasNext()) {
		Commodity commodity = iter.next();
		if (Name1.equals(commodity.getName())
				&& Masa1 == commodity.getMasa()
				&& Prise1 == commodity.getPrise()
				&& Date1.equals(commodity.getDate())) {
			System.out.println(commodity);
			System.out.println("Товар за всіма введеними критеріями видалений");
			iter.remove();
			}
		}list.forEach(System.out::println);
	}
	
	static void DeleteName(){
		System.out.println("Ведіть назву товару");
		String Name2 = SC.next().toUpperCase();
		Iterator<Commodity> iter = list.iterator();
		while (iter.hasNext()) {
			Commodity commodity = iter.next();
			if(commodity.getName().equals(Name2) ){
				iter.remove();
			}
		}
		list.forEach(System.out::println);
	}
	static void DeleteMasa(){
		System.out.println("Ведіть вагу товару");
		int Masa2 = SC.nextInt();
		Iterator<Commodity> iter = list.iterator();
		while (iter.hasNext()) {
			Commodity commodity = iter.next();
			if(commodity.getMasa() == Masa2){
				iter.remove();
			}
		}
		list.forEach(System.out::println);
	}
	static void DeletePrise(){
		System.out.println("Ведіть ціну товару");
		Double Prise2 = SC.nextDouble();
		Iterator<Commodity> iter = list.iterator();
		while (iter.hasNext()) {
			Commodity commodity = iter.next();
			if(commodity.getPrise() == Prise2){
				iter.remove();
			}
		}
		list.forEach(System.out::println);
	}
	
	static void DeleteDate(){
		System.out.println("Ведіть дату товару");
		String Date2 = SC.next().toUpperCase();
		Iterator<Commodity> iter = list.iterator();
		while (iter.hasNext()) {
			Commodity commodity = iter.next();
			if(commodity.getDate().equals(Date2) ){
				iter.remove();
			}
		}
		list.forEach(System.out::println);
	}
	
}
	