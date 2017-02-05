package core.less10.homework121;

public class Find {

	public static void findCommodity() {
		while (true) {
			System.out
					.println("--------------------------------------------------------------");
			System.out
					.println("||Нажміть 1 та здійсніть видалення товару за всіма критеріями||");
			System.out
					.println("||Нажміть 2 та здійсніть видалення товару за назвою товару ||");
			System.out
					.println("||Нажміть 3 та здійсніть видалення товару за кількістю товару||");
			System.out
					.println("||Нажміть 4 та здійсніть видалення товару за вагою товару ||");
			System.out
					.println("--------------------------------------------------------------");
			switch (Main.SC.next()) {
			case "1":
				System.out.println("Ведіть назву товару");
				String nazvaTovary1 = Main.SC.next();
				System.out.println("Ведіть кількість товару");
				int kilkistTovary1 = Main.SC.nextInt();
				System.out.println("Ведіть вагу товару");
				double vagaTovary1 = Main.SC.nextDouble();
				FinderCommodityByCryteria.wholeCommodity(nazvaTovary1,
						kilkistTovary1, vagaTovary1, Main.list.iterator());
				break;

			case "2":
				System.out.println("Ведіть назву товару");
				String nazvaTovary2 = Main.SC.next();
				FinderCommodityByCryteria.nazvaCommodity(nazvaTovary2,
						Main.list.iterator());
				break;
			case "3":
				System.out.println("Ведіть кількість товару");
				int kilkistTovary2 = Main.SC.nextInt();
				FinderCommodityByCryteria.kilkistCommodity(kilkistTovary2,
						Main.list.iterator());
				break;
			case "4":
				System.out.println("Ведіть вагу товару");
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