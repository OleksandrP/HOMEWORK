package core.less8;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class Main {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();// <> � ��� ���� ��������� list
		list.add("Ivan");
		list.add("Petro");
		list.add(1, "Mykola");// ������������� �� ����� ������������� �� �����
								// ���������
		System.out.println(list);
		System.out.println(list.contains("Ivan"));// �� ����� ������� � ��������
		System.out.println(list.containsAll(list));
		list.equals(list);// ����� ����� ��� � �������� �����������.
		list.forEach((String elem) -> System.out.println(elem)); // �������
		list.forEach(System.out::println); // �������
		for (String string : list) {             // ������� 
			System.out.println(string);
		}
		for (int i=0; i<list.size();i++){     //size ����� ��������   get ������� ������ �� ��������. ����� ��������������� ��� ��������.
			System.out.println(list.get(i));
		}
		
		System.out.println(list.remove(0));
		System.out.println(list);
		System.out.println(list.set(0, "Ivan")); // ����� ��������
		LinkedList<String> list2 = new LinkedList<>(); // ������ ����������������� � ���� ������. �� �������.?? list and arraylist

	}
}
