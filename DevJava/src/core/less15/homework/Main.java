package core.less15.homework;

import java.util.Scanner;


public class Main {

	private static final Scanner sc = new Scanner(System.in);
	private final static MyMap map = new MyMap<>();
	public static void main(String[] args) {
		
		while (true) {
					
			System.out.println("1. ������ ��'���.");
			System.out.println("2. �������� �ᒺ�� ���� �� ������(����� ���� � ����� � ��������)");
			System.out.println("3. �������� �ᒺ�� ���� �� ���������(�������� �ᒺ��� ������������ ������� ������, ��� ����� ���������� ����)������ ��'���.");
			System.out.println("4. ������� �� ����� Set ������.");
			System.out.println("5. ������� �� ����� List �������.");
			System.out.println("6. ������� �� ����� ���� ���� .");
			switch (sc.next()) {
			case "1":
				System.out.println("������ ����");
				String keys =sc.next();
				System.out.println("������ ��������");
				String value = sc.next();
				map.put(keys,value);
				break;
			case "2":
				System.out.println("������ ����"); 
				String key1 = sc.next(); 
				map.remove(key1); 
				break;
			case "3":
				System.out.println("������ ����"); 
				String key2 = sc.next(); 
				System.out.println("����� ��������"); 
				String value1 = sc.next(); 
				map.delete(key2, value1); 
			break;
			case "4":
				map.printSet();
				break;
			case "5":
				map.printList();
				break;
			case "6":
				map.printAll();
				break;
			case "7":
				break;
			default:
				sc.close();
				break;
			}
		}

	}

}
