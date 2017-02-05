package homework1;

import java.util.Scanner;

public class Homework {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);  // Ctrl+shift+o щоб не світилося червоним
		System.out.println("Enter number X");
		int res = sc.nextInt();
		if((res%2)==0){
			System.out.println("Число X = "+res+" парне");
		}else{
			System.out.println("Число X = "+res+" не парне");
		}
	}
}
