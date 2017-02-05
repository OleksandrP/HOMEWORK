package core.less5.homework2;

public class Main {

	
	
	public static void main(String[] args) {

		Worker worker=new Worker("Ivan");
		worker.salary(new SalaryDay());
		Worker worker1=new Worker("Dima");
		worker1.salary(new MonthSalary());
	}

}