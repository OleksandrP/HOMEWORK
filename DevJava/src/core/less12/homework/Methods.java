package core.less12.homework;

public class Methods {

	static double add(double a, double b) throws IllegalAccessException, MyException{
		if(a<0 && b<0){
			throw new IllegalArgumentException();
		}if(a==0 && b!=0){
			throw new ArithmeticException();
		}if(a!=0 && b==0){
			throw new ArithmeticException();
		}if(a==0 && b==0){
			throw new IllegalAccessException();
		}if(a>0 && b>0){
			throw new MyException();
		}
		return a + b;
	}
	static double sub(double a, double b) throws IllegalAccessException, MyException{
		if(a<0 && b<0){
			throw new IllegalArgumentException();
		}if(a==0 && b!=0){
			throw new ArithmeticException();
		}if(a!=0 && b==0){
			throw new ArithmeticException();
		}if(a==0 && b==0){
			throw new IllegalAccessException();
		}if(a>0 && b>0){
			throw new MyException();
		}
		return a - b;
	}
	static double mult(double a, double b)throws IllegalAccessException, MyException{
		if(a<0 && b<0){
			throw new IllegalArgumentException();
		}if(a==0 && b!=0){
			throw new ArithmeticException();
		}if(a!=0 && b==0){
			throw new ArithmeticException();
		}if(a==0 && b==0){
			throw new IllegalAccessException();
		}if(a>0 && b>0){
			throw new MyException();
		}
		return a * b;
	}
	static double div(double a, double b) throws IllegalAccessException, MyException{
		if(a<0 && b<0){
			throw new IllegalArgumentException();
		}if(a==0 && b!=0){
			throw new ArithmeticException();
		}if(a!=0 && b==0){
			throw new ArithmeticException();
		}if(a==0 && b==0){
			throw new IllegalAccessException();
		}if(a>0 && b>0){
			throw new MyException();
		}
		return a / b;
	}

}