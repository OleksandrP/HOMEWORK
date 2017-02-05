package core.less8;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class Main {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();// <> з чим буде працювати list
		list.add("Ivan");
		list.add("Petro");
		list.add(1, "Mykola");// переадресація не можна користуватися бо довго
								// правювати
		System.out.println(list);
		System.out.println(list.contains("Ivan"));// чиє такий елемент в колекції
		System.out.println(list.containsAll(list));
		list.equals(list);// мають буити рівні і однаково впорядковані.
		list.forEach((String elem) -> System.out.println(elem)); // однакові
		list.forEach(System.out::println); // однакові
		for (String string : list) {             // однакові 
			System.out.println(string);
		}
		for (int i=0; i<list.size();i++){     //size розмір колекції   get повертає ссилку до елементу. можна використовувати при видаленні.
			System.out.println(list.get(i));
		}
		
		System.out.println(list.remove(0));
		System.out.println(list);
		System.out.println(list.set(0, "Ivan")); // Заміна елемента
		LinkedList<String> list2 = new LinkedList<>(); // чергаб невикористовується в чому різниця. на співбесіді.?? list and arraylist

	}
}
