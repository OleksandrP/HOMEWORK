package core.less10.homework121;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {

	public static final List<Commodity> list = new ArrayList<>();
	public static Scanner SC = new Scanner(System.in);

	public static void main(String[] args) {
		list.add(new Commodity("���", 5, 2));
		list.add(new Commodity("������", 10, 2));
		list.add(new Commodity("�����", 5, 2.5));
		list.add(new Commodity("���", 8, 1.2));
		list.add(new Commodity("�������", 4, 3.5));
		list.add(new Commodity("���", 5, 2.5));
		list.add(new Commodity("���", 8, 1.2));
		list.add(new Commodity("����", 3, 4.5));

		while (true) {
			System.out.println();
			System.out.println("--------------------------------------------");
			System.out.println("||������ 1 ��� ������ ����� � ���. ||");
			System.out.println("||������ 2 ��� �������� ����� � ���� ||");
			System.out.println("||������ 3 ��� ������� ����� � ���. ||");
			System.out.println("||������ 4 ��� ����������� �� ������ ||");
			System.out.println("--------------------------------------------");
			System.out.println("����� ����� ������ : ");

			switch (SC.next()) {

			case "1":
				System.out.println("������� ����� �� ������� ���������");
				System.out.println("����� ����� ������");
				String nazvaTovary1 = SC.next();
				System.out.println("����� ������� ������");
				int kilkistTovary1 = SC.nextInt();
				System.out.println("����� ���� ������");
				double vagaTovary1 = SC.nextDouble();
				Functional.addTovar(nazvaTovary1, kilkistTovary1, vagaTovary1,
						list);
				
				break;

			case "2":
				Find.findCommodity();
				break;

			case "3":
				//Replace.replaceCommodity();
				break;

			case "4":
				sortByNameAsc().forEach(System.out::println);
				break;

			default:
				break;
			}

		}
	}
	static Stream<Commodity> sortByNameAsc(){   // implanment  � personi/ 6���� 
		List<Commodity> commoditys=new ArrayList<>(list);
		commoditys.sort(null);
		return list.stream().sorted();
		}
	
	
	
}