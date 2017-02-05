package core;

public class less2 {
	// Обєкти
	public static void main(String[] args) {
		Person p = new Person(18, "Ivan");// Person - конструктор
//		p.age=18;
//		p.name="Ivan";
										//System.out.println(p);
		System.out.print(p.age+" ");
		System.out.println(p.name);
		Person p1 = new Person(25,"Aleks");
//		p1.age=25;
//		p1.name="Aleks";
		System.out.print(p1.age+" ");
		System.out.println(p1.name);
		p.run();
		p1.run();
	}

}
