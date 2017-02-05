package core.less10.homework11;

import static java.util.Comparator.*;


import java.util.List;
import java.util.stream.Stream;

public class Changer {

	 static Stream<Commodity> sortByNameAsC(List<Commodity> list) {
	 return list.stream().sorted(comparing(Commodity::getName)
	 .thenComparing(comparingInt(Commodity::getMasa))
	 .thenComparing(comparing(Commodity::getDate)));
	 }

		static Stream<Commodity> sortByMasaAsc(List<Commodity> list){
			return list.stream().sorted(comparingInt(Commodity::getMasa));
		}
			static Stream<Commodity> sortByMasaDesc(List<Commodity> list){
				return list.stream().sorted(comparingInt(Commodity::getMasa).reversed());
			}
		static Stream<Commodity> sortByPriseAsc(List<Commodity> list){
				return list.stream().sorted(comparingDouble(Commodity::getPrise));
		}
			static Stream<Commodity> sortByNameAsc(List<Commodity> list){   
				return list.stream().sorted();
				}
			static Stream<Commodity> sortByNameDesc(List<Commodity> list){
				return list.stream().sorted((o1, o2)->o2.getName().compareTo(o1.getName()));
			}
		
			static Stream<Commodity> sortByDateAsc(List<Commodity> list){   
				return list.stream().sorted();
				}
			static Stream<Commodity> sortByDateDesc(List<Commodity> list){
				return list.stream().sorted((o1, o2)->o2.getDate().compareTo(o1.getDate()));
			}
}
