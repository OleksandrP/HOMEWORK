package core.less10.homework11;

import java.util.Comparator;

public class CommodityComparatorByAlldesc implements Comparator<Commodity>{

	@Override
	public int compare(Commodity o1, Commodity o2) {
		int res = o2.getName().compareTo(o1.getName());
		if(res!=0)return res;
		res = o2.getMasa() - o1.getMasa();
		if(res!=0)return res;
		res = (int) (o2.getPrise() - o1.getPrise());
		if(res!=0)return res;
		return o2.getDate().compareTo(o1.getDate());
	}

}