package core.less3;

public class Collector extends Human{
	
	public Collector(int age, String name){
		super (age,name);
	}
	int addMoney;
	
	public void takeMoney(String meat) {
		System.out.println(getName() + ": mmm nyam-nyamv " + meat);
	}
	
	
	public void takeMoney(){
		run();
			
		for(int addMoney=1; addMoney<10; addMoney++){
			System.out.println(getName()+": бабла много не буває!! Давай ще."+addMoney);
		}
		takeMoney("Buy mammonts meat!!!");
	}
	
	@Override //перевіряє чи є в батьківському класі такий самий void run()
	public void run(){
		//super.run(); // гамнокод.
		System.out.println(getName()+": fastrer go-go-go");
	}
	public String toString(){ // метод визначає
		return "collector [age="+getAge()+", name="+getName()+", takeMoney="+addMoney+"]";
	}
}
