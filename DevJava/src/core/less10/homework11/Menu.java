package core.less10.homework11;

public class Menu {
	
	public static void main(String[] args) {
		
	}
	public static final void Menu(){
		System.out.println("1. Додати товар в ліст.");
		System.out.println("2. Видалити товар з ліста (вказати або всі необіхідні параметри, або по якомусь критерію).");
		System.out.println("3. Замінити товар в лісті.");
		System.out.println("4. Посортувати по всьому (при натисканні повинне випасти меню, яке запропонує по якому полю посортувати. Після вибору поля обрати напрям сортування). Створити усі необхідні компаратори. ");
		System.out.println("0.  Вихід з програми.");
		
	} 
	public static final String Menu1(){
		System.out.println("Введіть назву товару.");
		return null;
	}
	
	public static final String Menu2(){
		System.out.println("1. Видалення товару за всіма критеріями.");
		System.out.println("2. Видалення товару за назвою товару.");
		System.out.println("3. Видалення товару за вагою товару.");
		System.out.println("4. Видалення товару за ціною товару.");
		System.out.println("5. Видалення товару за датою товару.");
		return null;
	}
	
	
	
	
	public static final void Menu4(){
		System.out.println("1. Сортування товар по назві.");
		System.out.println("2. Сортувати товар по вазі.");
		System.out.println("3. Сортувати товар по ціні");
		System.out.println("4. Сортувати товар по даті приходу.");
		System.out.println("0. Вихід.");
	}
	public static final void Menu4a(){
		System.out.println("1. Сортування відбуватиметься по спаданню.");
		System.out.println("2. Сортування відбуватиметься за зростанням.");
	}
}
