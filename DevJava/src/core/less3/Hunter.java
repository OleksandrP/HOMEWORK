package core.less3;

public class Hunter extends Human { // �����������

	private int killedMammonts;
	public Hunter(int age, String name){
		super(age, name); // ������ �� ����������� �����.
	}
	public void eatMeat(String meat) {
		System.out.println(getName() + ": mmm nyam-nyam" + meat);
	}

	public void eatMeat(){
		
		run();
		killedMammonts++;
		System.out.println(getName()+" :I kill " +killedMammonts+" mammonts");
		eatMeat("mamonts meat");
		
	}
	@Override //�������� �� � � ������������ ���� ����� ����� void run()
	public void run(){
		//super.run(); // ��������.
		System.out.println(getName()+": fastrer go-go-go");
	}
	
	
	
	
	
	public String toString(){ // ����� �������
		return "Hunter [age="+getAge()+", name="+getName()+", killedMammonts="+killedMammonts+"]";
	}
	
}
