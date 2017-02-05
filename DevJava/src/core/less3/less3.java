package core.less3;
// наслідування
public class less3 {

	
	
	public static void main(String[] args) {

		Hunter hunter = new Hunter(25,"Ivan");
		//hunter.name = "Ivan";
		hunter.eatMeat(" bird meat");
		hunter.eatMeat();
		hunter.eatMeat();
		Human human =new Human(30,"Peter");
		System.out.println(human);
		System.out.println(hunter);
		Collector collector=new Collector(25,"Vasya");
		collector.takeMoney();
		System.out.println(collector);
		
		valueObjact vo=new valueObjact(23, "Red");
		System.out.println(vo);
		int size=vo.size;
		int age=hunter.getAge();
		
		vo = vo.changeColor("Green");
		System.out.println(vo);
		human.countOfPeople(); // кількіть людей.
	}
	
	
}
