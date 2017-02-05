package core.less3;

public class Human {

	private int age; //0
	
	private String name;//null
	
	private static int count;// рахує кількість людей. 
	
	public static final int DFGH_HJF=5;
	
	public Human(int age, String name){//1 виконується код
		this(age);
		setName(name);
	}
	//2 виконується код
	public Human(int age){ // this() можна викликати тільки в конструкторі
		
		this();
		this.age=age;
	}
	//3 виконується код
	public Human(){
		count++;
		System.out.println("I was born.");
	}
	public static void countOfPeople(){    // рахує кількість людей.
		System.out.println("Count of people = "+count);
	}
	
	public void run(){
		System.out.println(name+": go-go-go");
		
	}
	public int getAge(){
		return age;
	}
	public String getName(){
		return name;
	}
	public void setAge(int age){
		if(age<0)age=0;// чи правильно ввелося рік;
		this.age=age;
	}
	
	public final void setName(String name){
		this.name=name;
	}
	
	
	
	
	
	public String toString(){ // метод визначає 
		return "Human [age="+age+", name="+name+"]";
	}
}
