package homeworj2;

import java.util.Scanner;

//Loops
//1. Створіть програму, що виводить на екран всі чотиризначні числа послідовності 1000 1003 1006 1009 1012 1015.
//2. Створіть програму, що виводить на екран перші 55 елементів послідовності 1 3 5 7 9 11 13 15 17 ....
//3. Створіть програму, що виводить на екран всі невід'ємні елементи послідовності 90 85 80 75 70 65 60 ....
//4. Створіть програму, що виводить на екран перші 20 елементів послідовності 2 4 8 16 32 64 128 ....
//5. Виведіть на екран всі числа в послідовності 2a-1, де a1 = 2, які менше 10000.
//6. Виведіть на екран всі двозначні члени послідовності 2a+200, де a1 = -166.
//7. Створіть програму, яка обчислює факторіал натурального числа n, яке користувач введе з клавіатури.
//8. Виведіть на екран всі позитивні подільники натурального числа, введеного користувачем з клавіатури.
//
//Кожне завдання має бути виконане в окремому методі.
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Введіть номер прикладу ");
		int i = sc.nextInt();
		sc.close();
		while (true)
			switch (i) {
			case 1:
				tag1();
				break;
			case 2:
				tag2();
				break;
			case 3:
				tag3();
				break;
			case 4:
				tag4();
				break;
			case 5:
				tag5();
				break;
			case 6:
				tag6();
				break;
			case 7:
				tag7();
				break;
			case 8:
				tag77();
				break;
			case 9:
				tag8();
				break;
			case 10:
				fact(5);
				System.out.println(fact(5));
				return ;
			default:
				break;
			}
		
	}

	// 1. Створіть програму, що виводить на екран всі чотиризначні числа
	// послідовності 1000 1003 1006 1009 1012 1015.
	static int tag1() {
		for (int i = 1000; i < 10000; i += 3) {
			System.out.println(i + " ");
		}
		return 0;
	}

	static int tag() {
		System.out.println();
		System.out.println();
		return 0;
	}

	// 2. Створіть програму, що виводить на екран перші 55 елементів
	// послідовності 1 3 5 7 9 11 13 15 17 ....
	static int tag2() {
		for (int i = 1; i <= 55; i += 2) {
			System.out.print(i + " ");
		}
		return 0;
	}

	// 3. Створіть програму, що виводить на екран всі невід'ємні елементи
	// послідовності 90 85 80 75 70 65 60 ....
	static int tag3() {
		for (int i = 90; i >= 0; i -= 5) {
			System.out.print(i + " ");
		}
		return 0;
	}

	// 4. Створіть програму, що виводить на екран перші 20 елементів
	// послідовності 2 4 8 16 32 64 128 ....
	static int tag4() {
		for (int i = 2; i <= 0; i *= 2) {
			System.out.print(i + " ");
		}
		return 0;
	}

	// 5. Виведіть на екран всі числа в послідовності 2a-1, де a1 = 2, які менше
	// 10000.
	static short tag5() {
		int a = 2;
		int b = (2 * a) - 1;
		for (int i = 1000; i >= 0; i -= b) {
			System.out.println(i + " ");
		}
		return 0;
	}

	// 6. Виведіть на екран всі двозначні члени послідовності 2a+200, де a1 =
	// -166.
	static int tag6() {

		for (int a = -166; a <= -49; a++) {
			int b = (2 * a) + 200;
			if (b < 100 && b >= -99) {
				if (b <= -9 || b >= 9) {
					System.out.println(b + " ");
				}
			}
		}
		return 0;
	}

	// 7. Створіть програму, яка обчислює факторіал натурального числа n, яке
	// користувач введе з клавіатури.
	static int tag7() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Введіть число для вирахування число n= ");
		int n = sc.nextInt();
		switch (n) {
		case 0:
			System.out.println("0");
			break;
		case 1:
			System.out.println("1");
			break;
		case 2:
			System.out.println("2");
			break;
		case 3:
			System.out.println("6");
			break;
		case 4:
			System.out.println("24");
			break;
		case 5:
			System.out.println("120");
			break;
		case 6:
			System.out.println("720");
			break;
		case 7:
			System.out.println("5 040");
			break;
		case 8:
			System.out.println("40 320");
			break;
		case 9:
			System.out.println("362 880");
			break;
		case 10:
			System.out.println("3 628 800");
			break;
		case 11:
			System.out.println("39 916 800");
			break;
		case 12:
			System.out.println("479 001 600");
			break;
		case 13:
			System.out.println("6 227 020 800");
			break;
		case 14:
			System.out.println("87 178 291 200");
			break;
		case 15:
			System.out.println("1 307 674 368 000");
			break;
		case 16:
			System.out.println("20 922 789 888 000");
			break;
		case 17:
			System.out.println("355 687 428 096 000");
			break;
		case 18:
			System.out.println("6 402 373 705 728 000");
			break;
		case 19:
			System.out.println("121 645 100 408 832 000");
			break;
		case 20:
			System.out.println("2 432 902 008 176 640 000");
			break;
		case 21:
			System.out.println("51 090 942 171 709 440 000");
			break;
		case 22:
			System.out.println("1 124 000 727 777 607 680 000");
			break;
		case 23:
			System.out.println("25 852 016 738 884 976 640 000");
			break;
		case 24:
			System.out.println("620 448 401 733 239 439 360 000");
			break;
		case 25:
			System.out.println("15 511 210 043 330 985 984 000 000");
			break;
		case 26:
			System.out.println("403 291 461 126 605 635 584 000 000");
			break;
		case 27:
			System.out.println("10 888 869 450 418 352 160 768 000 000");
			break;
		case 28:
			System.out.println("304 888 344 611 713 860 501 504 000 000");
			break;
		case 29:
			System.out.println("8 841 761 993 739 701 954 543 616 000 000");
			break;
		case 30:
			System.out.println("265 252 859 812 191 058 636 308 480 000 000");
			break;
		default:
			System.out.println("Infinity");
			break;

		}
		sc.close();
		return 0;
	}

	static double tag77() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		double q = sc.nextInt();
		double w = 1;
		for (double i = 1; i <= q; i++) {
			w *= i;
		}
		System.out.println(w);
		sc.close();
		return 0;
	}

	// 8. Виведіть на екран всі позитивні подільники натурального числа,
	// введеного користувачем з клавіатури.
	static int tag8() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Введіть натуральне число ");
		int q = sc.nextInt();
		System.out.print("Дільники числа " + q + " є ");

		for (int i = q; i >= 1; i--) {
			int b = q % i;
			if (b == 0) {
				System.out.print(i + " ");
			}
		}
		sc.close();
		return 0;
	}
	
	static int fact(int i){
	if(i==1) return 1;
	return i*fact(i-1);
	}
}
