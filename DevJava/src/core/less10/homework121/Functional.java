package core.less10.homework121;

import java.util.List;


public class Functional {

	public static void addTovar(String nazvaTovary1, int kilkistTovary1,
			double vagaTovary1, List<Commodity> com1) {
		Commodity commodity = new Commodity(nazvaTovary1, kilkistTovary1,
				vagaTovary1);
		com1.add(commodity);
		for (Commodity commodity2 : com1) {
			System.out.println(commodity2);
		}
	}

	public static void deleteWholeTovar() {

	}
}