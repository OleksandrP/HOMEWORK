package core.less12;

import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		try {
			System.out.println(0 / 0); // Exception in thread "main"
										// java.lang.ArithmeticException: / by
										// zero at
										// core.less12.Main.main(Main.java:6)
		} catch (ArithmeticException | NullPointerException e) {
			e.printStackTrace(); // щоб вивести в консоль помилку.
		} catch (RuntimeException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} catch (Throwable e) {
			e.printStackTrace();
		}
		System.out.println("Done");
		
	
		try {
			kaput();
		} catch (MyExeption e) { 
			e.printStackTrace();
		} finally { // перебирає return

		}
	}

	static void kaput() throws MyExeption { // throw прокидання помилки дальше.
		throw new MyExeption();
	}

}
