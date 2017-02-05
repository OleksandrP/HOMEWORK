package core.less3;

public class Human {

	private int age; //0
	
	private String name;//null
	
	private static int count;// ���� ������� �����. 
	
	public static final int DFGH_HJF=5;
	
	public Human(int age, String name){//1 ���������� ���
		this(age);
		setName(name);
	}
	//2 ���������� ���
	public Human(int age){ // this() ����� ��������� ����� � �����������
		
		this();
		this.age=age;
	}
	//3 ���������� ���
	public Human(){
		count++;
		System.out.println("I was born.");
	}
	public static void countOfPeople(){    // ���� ������� �����.
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
		if(age<0)age=0;// �� ��������� ������� ��;
		this.age=age;
	}
	
	public final void setName(String name){
		this.name=name;
	}
	
	
	
	
	
	public String toString(){ // ����� ������� 
		return "Human [age="+age+", name="+name+"]";
	}
}
