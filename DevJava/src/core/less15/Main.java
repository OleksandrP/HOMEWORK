package core.less15;

import java.util.ArrayList;
import java.util.List;

import core.less5.Circle;
import core.less5.Geometric;
import core.less5.Rectangle;

public class Main {

	public static void main(String[] args) {

		Container<String> container = new Container<>("Ivan");
		// System.out.println(((String)container.getElement()).charAt(0)); //
		// щбєкт загальний тип для джави
		System.out.println(container.getElement());

		Container<Integer> container2 = new Container<>(5);
		System.out.println(container2.getElement());

		List<Geometric> list = new ArrayList<>(); // маски для ? extends
		list.add(new Rectangle(3, 4));
		print(list);
		add(list, new Circle(5));
		// List<Rectangle> list = new ArrayList<>(); //маски для ? extends метод
		// консюмер
		// list.add(new Rectangle(3, 4));
		// print(list);
	}

	static void add(List<? super Geometric> list, Geometric geometric) { // продюсер . використовує супер
		list.add(geometric);
	}

	static void print(List<? extends Geometric> list) {
		for (Geometric geometric : list) {
			geometric.print();
		}

	}
}
