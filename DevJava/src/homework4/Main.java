package homework4;

public class Main {

	public static void main(String[] args) {
		int[] array = new int[10];
		add(array);
		print(array);
		println(array);
		int[] array1 = new int[50];
		add2(array1);
		print1(array1);
		add2(array1);
		print2(array1);
		int[] array2 = new int[15];
		addRandom(array2, 0, 9);
		print2(array2);
		pair(array2);
		q1();
		task();
		q1();
		task2();
		q1();
		task3();
		q1();
		task5();
		q1();
		task4();
		q1();
		q1();
		task9();
		q1();
		
		task10();
		int[] array5 = create(10, -1, 1);
		addRandom(array5, -1, 1);
		print2(array5);
		
	}

	// cтворіть масив з усіх парних чисел від 2 до 20 і виведіть елементи масиву
	// на екран спочатку в рядок, відокремлюючи один елемент
	// від іншого прогалиною, а потім в стовпчик (відокремлюючи один елемент
	// від іншого початком нового рядка). Перед створенням масиву подумайте,
	// якого він буде розміру.
	// 2 4 6 … 18 20
	// 2
	// 4
	// 6
	// …
	// 20

	static void print(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");

		}
		System.out.println();
	}

	static void println(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}

	static void add(int[] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				array[j] = i += 2;
			}
		}
	}

	// 2. Створіть масив з усіх непарних чисел від 1 до 99, виведіть його
	// на екран у рядок, а потім цей же масив виведіть на екран теж в рядок,
	// але в зворотному порядку (99 97 95 93 ... 7 5 3 1).
	//
	static int add2(int[] array1) {
		array1[0] = 1;
		for (int i = 1; i < array1.length; i++) {
			for (int j = 1; j < array1.length; j++) {
				array1[j] = i += 2;
			}
		}
		return 0;
	}

	static void print1(int[] array1) {
		for (int i = 0; i < array1.length; i++) {
			System.out.print(array1[i] + " ");
		}
	}

	static void print2(int[] array1) {
		System.out.println(" ");
		for (int i = array1.length - 1; i >= 0; i--) {
			System.out.print(array1[i] + " ");
		}
	}

	// 3. Створіть масив з 15 випадкових цілих чисел з відрізка [0; 9].
	// Виведіть масив на екран. Підрахуйте скільки в масиві парних елементів
	// і виведете цю кількість на екран на окремому рядку.
	//
	static int random(int min, int max) {
		return (int) Math.round(Math.random() * (max - min) + min);
	}
	static void addRandom(int[] array2, int min, int max) {
		for (int i = 0; i < array2.length; i++) {
			array2[i] = random(min, max);
		}
	}
	static void pair(int [] array2) { // Доробити.
		int q = 0;
		for (int i = 0; i < array2.length; i++){
		if (array2[i] == 0){
		} else if (array2[i] != 0 && array2[i] % 2 == 0){
		q++;
		}
		}
		System.out.println(" ");
		System.out.println("Pairs " + q);
		} 
	
	
	

	// Створіть масив з 4 випадкових цілих чисел з відрізка [10; 99],
	// виведіть його на екран у рядок. Визначити і вивести на екран
	// повідомлення про те, чи є масив строго зростаючої послідовністю.

	static void task() {
		int[] array = new int[4]; // С помощью первого цикла заполним значения
									// елементов массива
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 90 + 10);
			System.out.print(array[i] + " ");
		}
		// С помощью второго цикла переберем по очереди значения елементов
		// массива
		for (int i = 0; i < array.length; i++) {
			// Если следующий элемент меньше или равен предыдущему, цикл
			// прерывается и выводится сообщение о том, что прогрессия не
			// возрастающая
			if (i > 0) {
				if (array[i - 1] >= array[i]) {
					System.out.println("Прогрессия не возрастающая");
					break;
				}
			}
			// Если перебрали все значения элементов массива и цикл не прервался
			// - выводим сообщение о том, что последовательность возрастающая
			if (i == array.length - 1)
				System.out.println("Последовательность строго возрастающая");
		}
	}

	static void task2() {
		// Створіть масив з 20-ти перших чисел Фібоначчі і виведіть його
		// на екран. Нагадуємо, що перший і другий члени послідовності рівні
		// одиницям, а кожен наступний - сумою двох попередніх.

		int[] Mas = new int[20];
		Mas[0] = 1;
		Mas[1] = Mas[0];
		int new1 = Mas[0];
		int new2 = Mas[1];
		System.out.print(new1 + " " + new2 + " ");
		for (int i = 2; i < Mas.length; i++) {
			int rez = new1 + new2;
			System.out.print(rez + " ");
			new1 = new2;
			new2 = rez;
		}
	}

	static void task3() {
		// Створіть масив з 12 випадкових цілих чисел з відрізка [-15;
		// 15]. Визначте який елемент є в цьому масиві максимальним і повідомте
		// індекс його останнього входження в масив.
		int[] A = new int[12];
		int index=0;
		for (int i = 0; i < A.length; i++) {
			A[i] = (int) (Math.random() * 30 - 15);
			System.out.print(A[i] + " ");
		}
		int max = A[0];
		for (int i = 0; i < A.length; i++) {
			if (A[i] <=max){
				max = A[i];
				index=i;
			}
		}
		System.out.print("Max is " + max);
	}

	static void task5() {
		// 5. Створіть 2 масиви з 5 випадкових цілих чисел з відрізка [0; 5]
		// кожен, виведіть масиви на екран у двох окремих рядках. Порахуйте
		// середнє арифметичне елементів кожного масиву і повідомте, для якого з
		// масивів це значення виявилося більше (або повідомте, що їх середні
		// арифметичні рівні).

		int[] A = new int[5];
		for (int i = 0; i < A.length; i++) {
			A[i] = (int) (Math.random() * 5);
			System.out.print(A[i] + " ");
		}
		q1();
		int[] A1 = new int[5];
		for (int i = 0; i < A1.length; i++) {
			A1[i] = (int) (Math.random() * 5);
			System.out.print(A1[i] + " ");
		}
		System.out.println();
		int sum = (A[0] + A[1] + A[2] + A[3] + A[4]) / A.length;
		int sum1 = (A1[0] + A1[1] + A1[2] + A1[3] + A1[4]) / A1.length;
		if (sum > sum1) {
			System.out.println("Середне арифметичне в першому масиві більше i="
					+ sum);
		} else if (sum < sum1) {
			System.out.println("Середне арифметичне в другому масиві більше i="
					+ sum1);
		} else {
			System.out.println("Середне арифметичні значення рівні");
		}
	}

	static void task4() {
		// 4. Створіть масив з 8 випадкових цілих чисел з відрізка [1;
		// 10].Виведіть масив на екран у рядок. Замініть кожен елемент з
		// непарним індексом на нуль. Знову виведете масив на екран на окремому рядку.

		int[] A = new int[8];
		for (int i = 0; i < A.length; i++) {
			A[i] = (int) (Math.random() * 10 + 1);
			System.out.print(A[i] + " ");
		}
		q1();
		for (int i = 0; i < A.length; i++) {
			if (A[i] % 2 != 0) {
				A[i] = 0;
			}
			System.out.print(A[i] + " ");
		}
	}

	static void task9() {
		// 9. Створіть два масиви з 10 цілих випадкових чисел з відрізка [1;
		// 9] і третій масив з 10 дійсних чисел. Кожен елемент з i-им індексом
		// третього масиву повинен дорівнювати відношенню елементу з першого
		// масиву з i-им індексом до елементу з другого масиву з i-им індексом.
		// Вивести всі три масиву на екран (кожен на окремому рядку), потім
		// вивести кількість цілих елементів в третьому масиві.
		int[] A = new int[10];
		for (int i = 0; i < A.length; i++) {
			A[i] = (int) (Math.random() * 9 + 1);
			System.out.print(A[i] + "   ");
		}
		q1();
		int[] A1 = new int[10];
		for (int i = 0; i < A1.length; i++) {
			A1[i] = (int) (Math.random() * 9 + 1);
			System.out.print(A1[i] + "   ");
		}
		q1();
		double[] A2 = new double[10];
		for (double i = 0; i < A2.length; i++) {
			A2[(int) i] = A[(int) i] / A1[(int) i];
			System.out.print(A2[(int) i] + " ");
		}
		q1();
		for (int i = 0; i < A2.length; i++) {
			if (A2[i]%2 > 0.0) {
				A2[i] = i;
				
			//int	sum = (int)(A2[0]+A2[1]+A2[2]+A2[3]+A2[4]+A2[5]+A2[6]+A2[7]+A2[8]+A2[9])/10;
				
			}System.out.print(A2[i]+" ");

		}
	}

	static void q1() {
		System.out.println();
	}
	static void task10(){
	//	10.                       Створіть масив з 11 випадкових цілих чисел з
//	відрізка [-1; 1], виведіть масив на екран у рядок. Визначте який
//	елемент зустрічається в масиві найчастіше і виведіть про це
//	повідомлення на екран. Якщо два якихось елемента зустрічаються
//	однакову кількість разів, то не виводьте нічого.	
		q1();
	}
		static int[] create(int length, int min, int max){
			int[] array = new int[length];
			addRandom(array, min, max);
			return array;
		}
		
	

}

