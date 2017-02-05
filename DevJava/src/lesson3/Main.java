package lesson3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
//		int[] array = { 1, 2, 3, 4, 5 };
//		int[] array1 = new int[10]; // масив на 10 комірок.
//		int a = array[0];
//		array[0] = 2;
//		for (int i = 0; i < array1.length; i++) {
//			System.out.println(array1[i]);
		System.out.println(fact(5));
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array length");
		int length = sc.nextInt();
		int [] array = new int[20];
			System.out.println(array);
			for(int i = 0; i < array.length; i++){
				array[i] =i+1;
				System.out.println(array[i]);
			}
			System.out.println(array[0]);
	}
		
	

	static int fact(int i) {
		if (i == 1)
			return 1;
		return i * fact(i - 1);
	}
}


// boolean isRun=true;
//while(isRun){
//switch(0){
//case 0:
	//isRun=false;
	//breack;
	//}

