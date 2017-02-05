package core.less5.homework2;

public class Worker {
	
	private String name;
	
	public Worker(String name){
		this.name=name;
	}
	
	public void salary(Salary money){
		System.out.print(name+": ");
		money.money();
	}
}