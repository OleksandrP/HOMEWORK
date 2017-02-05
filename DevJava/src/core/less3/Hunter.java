package core.less3;

public class Hunter extends Human { // наслідування

	private int killedMammonts;
	public Hunter(int age, String name){
		super(age, name); // ссилка на батьківський метод.
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
	@Override //перевіряє чи є в батьківському класі такий самий void run()
	public void run(){
		//super.run(); // гамнокод.
		System.out.println(getName()+": fastrer go-go-go");
	}
	
	
	
	
	
	public String toString(){ // метод визначає
		return "Hunter [age="+getAge()+", name="+getName()+", killedMammonts="+killedMammonts+"]";
	}
	
}
