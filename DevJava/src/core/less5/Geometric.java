package core.less5;

public interface Geometric {

	double square();
	
	double perimeter();
	
	public static void print(Geometric geometric){ //1.7 java
		System.out.println("Square = "+geometric.square());
		System.out.println("Perimeter = "+geometric.perimeter());
	}
	
	public default void print(){ //1.8 java коли вже є абтрактні методи.
		System.out.println("Square = "+square());
		System.out.println("Perimeter = "+perimeter());
	}
}
