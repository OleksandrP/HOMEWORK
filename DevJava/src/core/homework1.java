package core;

public class homework1 {

	public static void main(String[] args) {
		String str1 = "������ ����� ���-������������� ��� ��������� ���� ������ � ������ � ����������� �����������? ��������� ����� ������������� htmlbook.ru �������� html_prog �� ������ 5000 ���. �� ����� ������-���� �� ������������: HTML � CSS, JavaScript, Node, Python, PHP � ��.";
		String str2 = "������ ����� ���-������������� ��� ��������� ���� ������ � ������ � ����������� �����������? ��������� ����� ������������� htmlbook.ru �������� html_prog �� ������ 5000 ���. �� ����� ������-���� �� ������������: HTML � CSS, JavaScript, Node, Python, PHP � ��.";
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
