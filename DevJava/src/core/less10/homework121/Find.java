package core.less10.homework121;

public class Find {

	public static void findCommodity() {
		while (true) {
			System.out
					.println("--------------------------------------------------------------");
			System.out
					.println("||������ 1 �� ������� ��������� ������ �� ���� ���������||");
			System.out
					.println("||������ 2 �� ������� ��������� ������ �� ������ ������ ||");
			System.out
					.println("||������ 3 �� ������� ��������� ������ �� ������� ������||");
			System.out
					.println("||������ 4 �� ������� ��������� ������ �� ����� ������ ||");
			System.out
					.println("--------------------------------------------------------------");
			switch (Main.SC.next()) {
			case "1":
				System.out.println("����� ����� ������");
				String nazvaTovary1 = Main.SC.next();
				System.out.println("����� ������� ������");
				int kilkistTovary1 = Main.SC.nextInt();
				System.out.println("����� ���� ������");
				double vagaTovary1 = Main.SC.nextDouble();
				FinderCommodityByCryteria.wholeCommodity(nazvaTovary1,
						kilkistTovary1, vagaTovary1, Main.list.iterator());
				break;

			case "2":
				System.out.println("����� ����� ������");
				String nazvaTovary2 = Main.SC.next();
				FinderCommodityByCryteria.nazvaCommodity(nazvaTovary2,
						Main.list.iterator());
				break;
			case "3":
				System.out.println("����� ������� ������");
				int kilkistTovary2 = Main.SC.nextInt();
				FinderCommodityByCryteria.kilkistCommodity(kilkistTovary2,
						Main.list.iterator());
				break;
			case "4":
				System.out.println("����� ���� ������");
				double vagaTovary2 = Main.SC.nextDouble();
				FinderCommodityByCryteria.vagaCommodity(vagaTovary2,
						Main.list.iterator());
				break;

			default:
				break;
			}
		}
	}

}