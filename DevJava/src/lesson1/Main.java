package lesson1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Hello ");
		boolean bool = false;
		//byte by= 1;
		//short sh=1;
		//char ch='f';
		int i=123;
		//long l=1235L;
		//float f=3.4f;
		//double d=12345678.4;
		
		if(i<0){
		System.out.println("True");	
		}else if(!bool){    //неможна писати !bool== falseабо щось інше 
			System.out.println("False");
		}else{
			System.out.println("Second Else");
		}
		
		double a=2;
		double b=6;
		double c=3;
				//Math.sqrt(D);
		double D=(b*b)-4*a*c;
		if(D<0){
			System.out.println("Розвязку немає");
		}else if (D>0){
			double x1=(-b+Math.sqrt(D))/(2*a);
			double x2=(-b-Math.sqrt(D))/(2*a);
			System.out.println("x1 = "+ x1 + "\nx2 = " +x2); // \n - з нової стрічки;
		}else{
			double x=-b/(2*a);
			System.out.println("x="+(-b/(2*a)));
		}
		
		Scanner sc = new Scanner(System.in);  // cntr+shift+o щоб не світилося червоним
		System.out.println("Enter number");
		int res = sc.nextInt();
		System.out.println(res);
	}

}
