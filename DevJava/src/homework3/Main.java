package homework3;

import java.util.Scanner;

// �������� 20 ������ ����� ������������
public class Main {
	public static void main(String[] args) {
		boolean isRun = true;
		task1();
		Scanner sc = new Scanner(System.in);
		task0();
		int i = sc.nextInt();
		while (true)
			switch (i) {
			case 1:
				task2();
				task0();
				int q = sc.nextInt();
				while (isRun)
					switch (q) {
					case 1:
						task3();
						// �������� ����������
						break;
					case 2:
						task4();// ����� ����������
						break;
					case 3:
						isRun = false;// ����� �����
						break;
					default:
						break;
					}
			case 2:
				task5();
				task0();
				int a = sc.nextInt();
				while (isRun)
					switch (i) {
					case 1:
						task6(); // �������� ��������
						break;
					case 2:
						task7();// ����� ��������
						break;
					case 3:
						isRun = false;// ����� �����
						break;
					default:
						break;
					}
				
			case 3:
				task8();
				task0();
				int b = sc.nextInt();
				while (isRun)
					switch (b) {
					case 1:
						task9(); // �������� ��������
						break;
					case 2:
						task10();// ����� ��������
						break;
					case 3:
						isRun = false;// ����� �����
						break;
					default:
						break;
					}
			case 4:
				task11();
				task0();
				int w = sc.nextInt();
				while (isRun)
					switch (w) {
					case 1:
						task12(); // �������� ��������
						break;
					case 2:
						task13();// ����� ��������
						break;
					case 3:
						isRun = false;// ����� �����
						break;
					default:
						break;
					}
			case 5:
				task14();
				task0();
				int � = sc.nextInt();
				while (isRun)
					switch (�) {
					case 1:
						task15(); // �������� ��������
						break;
					case 2:
						task16();// ����� ��������
						break;
					case 3:
						isRun = false;// ����� �����
						break;
					default:
						break;
					}
			case 6:
				task17();
				task0();
				int e1 = sc.nextInt();
				while (isRun)
					switch (e1) {
					case 1:
						task18(); // �������� ��������
						break;
					case 2:
						task19();// ����� ��������
						break;
					case 3:
						task20();
					case 4:
						isRun = false;// ����� �����
						break;
					default:
						break;
					}
			default:
				break;
			}
		
	}

	static int task0() {
		System.out.println("Enter number what are you need?");
		return 0;
	}

	static int task1() {// ����
		System.out.println("1. Triangle");
		System.out.println("2. Square/Diamond");
		System.out.println("3. Rectangle");
		System.out.println("4. Parallelogram");
		System.out.println("5. Trapeze");
		System.out.println("6. Cube + Prism");
		return 0;
	}

	static int task2() {
		System.out.println("You need Triangle"); // ���� ������ 1.
		System.out.println("1 Triangle Perimetr");
		System.out.println("2 Triangle Area");
		System.out.println("3 Exit level up ");
		return 0;
	}

	static int task3() {
		System.out.println("You need Triangle Perimetr"); // �������� ����������
		System.out.println("Enter incoming data");
		System.out.print("Enter side a = "); // ��� ������� 1
		Scanner sc = new Scanner(System.in);
		int q = sc.nextInt();
		if (q > 0) {
			System.out.print("Enter side b  = ");// ��� ������� 2
			int q1 = sc.nextInt();
			if (q1 > 0) {
				System.out.print("Enter side c = ");// ��� ������� 3
				int q2 = sc.nextInt();
				if (q2 > 0) {
					int P = q + q1 + q2;
					System.out.println("Trialgle Perimetr P = " + P);
				}
			}
		}
		return 0;
	}

	static int task4() {
		System.out.println("You need Triangle Area");
		System.out.println("Enter incoming data");
		System.out.print("Enter height h = "); // ��� ������� 1
		Scanner sc = new Scanner(System.in);
		int q = sc.nextInt();
		if (q > 0) {
			System.out.print("Enter bottom v = ");// ��� ������� 2
			int q1 = sc.nextInt();
			if (q1 > 0) {
				int A = q * q1 / 2;
				System.out.println("Trialgle Area P = " + A);
			}
		}
		return 0;
	}

	static int task5() {
		System.out.println("You need Square/Diamond"); // ���� 2
		System.out.println("1 Square/Diamond Perimetr");
		System.out.println("2 Square Area");
		System.out.println("3 Exit level up ");
		return 0;
	}

	static int task6() {
		System.out.println("You need Square/Diamond Perimetr"); // ��������
																// ��������
		System.out.println("Enter incoming data");
		System.out.print("Enter side a = "); // ��� ������� 1
		Scanner sc = new Scanner(System.in);
		int q = sc.nextInt();
		if (q > 0) {
			int P = 4 * q;
			System.out.println("Square/Diamond Perimetr P = " + P);
		}
		return 0;
	}

	static int task7() {
		System.out.println("You need Square/Diamond Area"); // ����� ��������
		System.out.println("Enter incoming data");
		System.out.print("Enter side a = "); //
		Scanner sc = new Scanner(System.in);
		int q = sc.nextInt();
		if (q > 0) {
			int P = q * q;
			System.out.println("Square Area P = " + P);
		}
		return 0;
	}

	static int task8() {
		System.out.println("You need Rectangle"); // ���� 2
		System.out.println("1 Rectangle Perimetr");
		System.out.println("2 Rectangle Area");
		System.out.println("3 Exit level up ");
		return 0;
	}

	static int task9() {
		System.out.println("You need Rectangle Perimetr"); // �����������
		System.out.println("Enter incoming data");
		System.out.print("Enter  side a = "); // ��� ������� 1
		Scanner sc = new Scanner(System.in);
		int q = sc.nextInt();
		if (q > 0) {
			System.out.print("Enter  side b =  ");// ��� ������� 2
			int q1 = sc.nextInt();
			if (q1 > 0) {
				int A = 2 * (q + q1);
				System.out.println("Rectangle Perimetr P = " + A);
			}
		}
		return 0;
	}

	static int task10() {
		System.out.println("You need Rectangle Area"); // �����������
		System.out.println("Enter incoming data");
		System.out.print("Enter  side a = "); // ��� ������� 1
		Scanner sc = new Scanner(System.in);
		int q = sc.nextInt();
		if (q > 0) {
			System.out.print("Enter  side b =  ");// ��� ������� 2
			int q1 = sc.nextInt();
			if (q1 > 0) {
				int A = q * q1;
				System.out.println("Rectangle Area P = " + A);
			}
		}
		return 0;
	}

	static int task11() {
		System.out.println("You need Parallelogram"); // ���� 4
		System.out.println("1 Parallelogram Perimetr");
		System.out.println("2 Parallelogram Area");
		System.out.println("3 Exit level up ");
		return 0;
	}

	static int task12() {
		System.out.println("You need Parallelogram Perimetr"); // �����������
		System.out.println("Enter incoming data");
		System.out.print("Enter  side a = "); // ��� ������� 1
		Scanner sc = new Scanner(System.in);
		int q = sc.nextInt();
		if (q > 0) {
			System.out.print("Enter  side b =  ");// ��� ������� 2
			int q1 = sc.nextInt();
			if (q1 > 0) {
				int A = 2 * (q + q1);
				System.out.println("Parallelogram Perimetr P = " + A);
			}
		}
		return 0;
	}

	static int task13() {
		System.out.println("You need Parallelogram Area"); // ������������
		System.out.println("Enter incoming data");
		System.out.print("Enter  side a = "); // ��� ������� 1
		Scanner sc = new Scanner(System.in);
		int q = sc.nextInt();
		if (q > 0) {
			System.out.print("Enter  diagonal a =  ");// ��� ������� 1
			int q1 = sc.nextInt();
			if (q1 > 0) {
				int A = q * q1;
				System.out.println("Parallelogram Area P = " + A);
			}
		}
		return 0;
	}

	static int task14() {
		System.out.println("You need Trapeze"); // ���� 5
		System.out.println("1 Trapeze Perimetr");
		System.out.println("2 Trapeze Area");
		System.out.println("3 Exit level up ");
		return 0;
	}

	static int task15() {
		System.out.println("You need Trapeze Perimetr"); // ��������
		System.out.println("Enter incoming data");
		System.out.print("Enter  side a = "); // ��� ������� 1
		Scanner sc = new Scanner(System.in);
		int q = sc.nextInt();
		if (q > 0) {
			System.out.print("Enter  side b =  ");// ��� ������� 2
			int q1 = sc.nextInt();
			if (q1 > 0) {
				System.out.print("Enter  side c =  ");// ��� ������� 3
				int q2 = sc.nextInt();
				if (q2 > 0) {
					System.out.print("Enter  side c =  ");// ��� ������� 4
					int q3 = sc.nextInt();
					if (q3 > 0) {
						int A = q + q1 + q2 + q3;
						System.out.println("Trapeze Perimetr P = " + A);
					}
				}
			}
		}
		return 0;
	}

	static int task16() {
		System.out.println("You need Trapeze Area"); // ��������
		System.out.println("Enter incoming data");
		System.out.print("Enter  bottom z1 = "); // ��� ������� 1
		Scanner sc = new Scanner(System.in);
		int q = sc.nextInt();
		if (q > 0) {
			System.out.print("Enter  bottom z2 =  ");// ��� ������� 2
			int q1 = sc.nextInt();
			if (q1 > 0) {
				System.out.print("Enter  height h =  ");// ��� ������� 3
				int q2 = sc.nextInt();
				if (q2 > 0) {
					int A = ((q + q1) / 2) * q2;
					System.out.println("Trapeze Area P = " + A);
				}
			}
		}
		return 0;
	}

	static int task17() {
		System.out.println("You need Cube"); // ���� 6
		System.out.println("1 Cube Square");
		System.out.println("2 Cube Volume");
		System.out.println("3 Prism Square");
		System.out.println("4 Exit level up ");
		return 0;
	}

	static int task18() {
		System.out.println("You need Cube Square");
		System.out.print("Enter side a = "); //
		Scanner sc = new Scanner(System.in);
		int q = sc.nextInt();
		if (q > 0) {
			int P = 6 * (q * q);
			System.out.println("Cube Square P = " + P);
		}
		return 0;
	}

	static int task19() {
		System.out.println("You need Cube Volume");
		System.out.print("Enter side a = "); //
		Scanner sc = new Scanner(System.in);
		int q = sc.nextInt();
		if (q > 0) {
			int P = q * q * q;
			System.out.println("Cube Volume V = " + P);
		}
		return 0;
	}

	static int task20() {
		System.out.println("You need Prism Square");
		System.out.print("Enter Square Bottom A = "); //
		Scanner sc = new Scanner(System.in);
		int q = sc.nextInt();
		if (q > 0) {
			System.out.print("Enter  lateral surface Q=  ");// ��� ������� 3
			int q1 = sc.nextInt();
			if (q1 > 0){
				int P = q+q1;
				System.out.println("Cube Volume V = " + P);
				}
			}
		return 0;
	}
	
}
