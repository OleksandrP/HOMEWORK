package core.less15.homework;

import java.util.Scanner;


public class Main {

	private static final Scanner sc = new Scanner(System.in);
	private final static MyMap map = new MyMap<>();
	public static void main(String[] args) {
		
		while (true) {
					
			System.out.println("1. Додати об'єкт.");
			System.out.println("2. Видалити об’єкт мапи за ключем(тобто немає ні ключа ні значення)");
			System.out.println("3. Видалити об’єкт мапи за значенням(значенню об’єкта присвоюється нульова спилка, при цьому зберігається ключ)Додати об'єкт.");
			System.out.println("4. Вивести на екран Set ключів.");
			System.out.println("5. Вивести на екран List значень.");
			System.out.println("6. Вивести на екран цілу мапу .");
			switch (sc.next()) {
			case "1":
				System.out.println("Введіть Ключ");
				String keys =sc.next();
				System.out.println("Введіть значення");
				String value = sc.next();
				map.put(keys,value);
				break;
			case "2":
				System.out.println("Введіть Ключ"); 
				String key1 = sc.next(); 
				map.remove(key1); 
				break;
			case "3":
				System.out.println("Введіть Ключ"); 
				String key2 = sc.next(); 
				System.out.println("Ведіть значення"); 
				String value1 = sc.next(); 
				map.delete(key2, value1); 
			break;
			case "4":
				map.printSet();
				break;
			case "5":
				map.printList();
				break;
			case "6":
				map.printAll();
				break;
			case "7":
				break;
			default:
				sc.close();
				break;
			}
		}

	}

}
