package core.less14.homework;

import core.less14.homework.Iterator.Collection;

public class Main {
	public static void main(String[] args) {
		Integer[] values = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15,};
		Collection collection = new Collection(values);
		Iterator iterator = collection.createClazz1();
		Iterator iterator1 = collection.createClazz22();
		Iterator iterator2 = collection.createLokal();

		while (iterator.hasNext()) {
			Integer value = (Integer) iterator.Next();
			System.out.print(value + " ");
		}
		System.out.println();

		while (iterator1.hasNext()) {
			Integer value1 = (Integer) iterator1.Next();
			System.out.print(value1 + " ");
		}
		System.out.println();

		while (iterator2.hasNext()) {
			Integer value2 = (Integer) iterator2.Next();
			System.out.print(value2 + " ");
		}
	}
}