package lesson2;

public class lesson2 {

	public static void main(String[] args) {
		int i=0;
		switch (i) {
		case 0:
			System.out.println("ZERO");
			break;
		case 1:
			System.out.println("ONE");	
			break;
		case 2:
			System.out.println("TWO");
			break;
		default:
			System.out.println("DEFAULT");
			break;
		}

	while(i<10){
		System.out.println(++i); 
	}	
		
	do{
		System.out.println(++i);  // тіло циклу має виконатися хоча 1 раз.
	}while(i<10);
		
	for(int j=0;j<10; j++){   //якщо немає умови то може бути вічний цикл. for(;;)
		System.out.println(j);
	}	
	hello();
	
	int increment = increment(1);
	System.out.println(increment);
	
	double add = add(35,40);
	System.out.println(add);
	System.out.println(calculate(1, 3, '*'));
}
	static void hello(){ //метод
		System.out.println("Hello");
	}
	
	static int increment (int i){
		i++;
		return i; // поверне 1 ++i поверне 2
	}
	
	static double add(double a, double b){
			return a+b;
	}
	static double sub(double a, double b){
		return a-b;
	}
	static double mult(double a, double b){
		return a*b;
	}
	static double div(double a, double b){
		return a/b;
	}
	static double calculate(double a, double b, char operator){
		switch (operator) {
		case '+': return add(a,b);
		case '-': return sub(a,b);
		case '*': return mult(a,b);
		case '/': return div(a,b);
		default: calculate(a, b, operator); return 0;
		}
	}
	
	
	
	
}
