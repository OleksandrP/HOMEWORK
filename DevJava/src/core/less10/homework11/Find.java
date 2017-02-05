package core.less10.homework11;

import static core.less10.homework11.Menu.*;
import static core.less10.homework11.Changer.*;


import java.util.List;

public class Find {

	public static void findCommodity() {
		while (true) {
			Menu2();
			switch (Main.SC.next()) {
			case "1":
				Finder.DeleteAll();
			break;
			case "2":
				Finder.DeleteName();
				break;
			case "3":
				Finder.DeleteMasa();
				break;
			case "4":
				Finder.DeletePrise();
				break;
			case "5":
				Finder.DeleteDate();
				break;
			default:
				break;
			}
		}
	}
	
	public static void ChangeCommodity(List<Commodity> list) {
		while (true) {
			Menu4();
			switch (Main.SC.next()) {
			case "1":
				Menu4a();
				switch (Main.SC.next()) {
				case "1":
					Changer.sortByNameAsc(list);
					sortByNameAsc(list).forEach(System.out::println);
					break;
				case "2":
					Changer.sortByNameDesc(list);
					sortByNameDesc(list).forEach(System.out::println);
					break;
				default:
					break;
				}
			break;
			case "2":
				Menu4a();
				switch (Main.SC.next()) {
				case "1":
					Changer.sortByMasaAsc(list);
					sortByMasaAsc(list).forEach(System.out::println);
					break;
				case "2":
					Changer.sortByMasaDesc(list);
					sortByMasaDesc(list).forEach(System.out::println);
					break;
				default:
					break;
					}
				break;
				case "3":
				Menu4a();
				switch (Main.SC.next()) {
				case "1":
					//Changer.;
					break;
				case "2":
					//Changer.;
					break;
				default:
					break;
					}
				break;
			case "4":
				Menu4a();
				switch (Main.SC.next()) {
				case "1":
					Changer.sortByDateAsc(list);
					sortByDateAsc(list).forEach(System.out::println);
					break;
				case "2":
					Changer.sortByDateDesc(list);
					sortByDateDesc(list).forEach(System.out::println);
					break;
				default:
					break;
				}
			break;
			default:
				break;
			}
		}
	}

}
			