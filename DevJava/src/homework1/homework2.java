package homework1;

/*Створити програму, що виводить на екран найближче до 10 з двох
чисел, записаних в змінні m і n. Наприклад, серед чисел 8,5 і 11,45
найближче до десяти 11,45.*/

import java.util.Scanner;

public class homework2 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter first number = ");
		double rec= scan.nextDouble();
		System.out.print("Enter second number = ");
		double rec1= scan.nextDouble();
		double min1=10-rec;
		double min2=rec1-10;  //Math.abs- функція найбільшого по модулю.
		if (min1<min2){
			System.out.println("Мінімальне найближче значення до 10 є " +rec);
		}else{
			System.out.println("Мінімальне найближче значення до 10 є " +rec1);
		}
	}
}
