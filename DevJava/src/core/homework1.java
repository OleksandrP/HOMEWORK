package core;

public class homework1 {

	public static void main(String[] args) {
		String str1 = "Хочешь стать веб-разработчиком или прокачать свои знания и навыки в определённом направлении? Нетология дарит пользователям htmlbook.ru промокод html_prog на скидку 5000 руб. на любой онлайн-курс по направлениям: HTML и CSS, JavaScript, Node, Python, PHP и дк.";
		String str2 = "Хочешь стать веб-разработчиком или прокачать свои знания и навыки в определённом направлении? Нетология дарит пользователям htmlbook.ru промокод html_prog на скидку 5000 руб. на любой онлайн-курс по направлениям: HTML и CSS, JavaScript, Node, Python, PHP и др.";
		System.out.println(compareTo(str1, str2));
	}

	static int compareTo(String str1, String str2) {
		int min = 0;
		if (str1.length() < str2.length()) {
			min = str1.length();
		} else {
			min = str2.length();
		}
		for (int i = 0; i < min; i++) {
			if (str1.codePointAt(i) != str2.codePointAt(i)) {
				return str1.codePointAt(i) - str2.codePointAt(i);
			}
		}
	return str1.length() - str2.length();
	}
}
