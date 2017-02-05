package core.less10.homework121;

import java.util.Iterator;

public class FinderCommodityByCryteria {

	public static void wholeCommodity(String nazvaTovary1, int kilkistTovary1,
			double vagaTovary1, Iterator<Commodity> iter) {
		while (iter.hasNext()) {
			Commodity commodity = iter.next();
			if (nazvaTovary1.equals(commodity.getNazvaTovary())
					&& kilkistTovary1 == commodity.getKilkistTovary()
					&& vagaTovary1 == commodity.getVaga()) {
				System.out.println(commodity);
				System.out
						.println("Товар за всіма введеними критеріями видалений");
				iter.remove();
			}
		}
	}

	public static void nazvaCommodity(String nazvaTovary2,
			Iterator<Commodity> iter) {
		while (iter.hasNext()) {
			Commodity commodity = iter.next();
			if (nazvaTovary2.equals(commodity.getNazvaTovary())) {
				System.out.println(commodity);
				System.out.println("Товар за введеною назвою видалений ");
				iter.remove();
			}
		}
	}

	public static void kilkistCommodity(int kilkistTovary1,
			Iterator<Commodity> iter) {
		while (iter.hasNext()) {
			Commodity commodity = iter.next();
			if (kilkistTovary1 == commodity.getKilkistTovary()) {
				System.out.println(commodity);
				System.out.println("Товар за введеною кількістю видалений ");
				iter.remove();
			}
		}
	}

	public static void vagaCommodity(double vagaTovary2,
			Iterator<Commodity> iter) {
		while (iter.hasNext()) {
			Commodity commodity = iter.next();
			if (vagaTovary2 == commodity.getVaga()) {
				System.out.println(commodity);
				System.out.println("Товар за введеною вагою видалений ");
				iter.remove();
			}
		}
	}
}