package core.homework2;

public class Rectangle {
	int a;
	int b;

	Rectangle(int a, int b) {
		this.a = a;
		this.b = b;
	}

	void perimeter() {
		System.out.println("�������� ������������ = " + 2 * (a + b));
	}
	void area() {
		System.out.println("����� ������������ = " + (a * b));
	}
}
