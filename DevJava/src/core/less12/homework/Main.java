package core.less12.homework;

import java.util.Scanner;

public class Main {

	private static final Scanner sc =new Scanner(System.in);
	public static void main(String[] args) throws IllegalAccessException, MyException {
		
		//Methods.add(sc.nextDouble(),sc.nextDouble());
		try{
			Methods.add(sc.nextDouble(),sc.nextDouble());
		}catch (ArithmeticException | IllegalArgumentException e) {
			e.printStackTrace(); // щоб вивести в консоль помилку.
		}
		try{
			Methods.sub(sc.nextDouble(),sc.nextDouble());
		}catch (ArithmeticException | IllegalArgumentException e) {
			e.printStackTrace(); // щоб вивести в консоль помилку.
		}
		try{
			Methods.mult(sc.nextDouble(),sc.nextDouble());
		}catch (ArithmeticException | IllegalArgumentException e) {
			e.printStackTrace(); // щоб вивести в консоль помилку.
		}
		try{
			Methods.div(sc.nextDouble(),sc.nextDouble());
		}catch (ArithmeticException | IllegalArgumentException e) {
			e.printStackTrace(); // щоб вивести в консоль помилку.
		}
		
	}
}