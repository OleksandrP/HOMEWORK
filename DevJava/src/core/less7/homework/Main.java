package core.less7.homework;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Group[] groups = Group.values();
		for (int i = 0; i < groups.length; i++) {
			System.out.println(groups[i]);
		}
		
		Faculty[] facultys=Faculty.values();
		for (int i = 0; i < facultys.length; i++) {
			System.out.println(facultys[i]);
		}

	
	Scanner sc = new Scanner(System.in);
	while (true) {
	Menu.menu();
	switch (sc.next()) {
		case "1":
			University[] universitys = University.values();
			for (int i = 0; i < universitys.length; i++) {
				System.out.println(universitys[i]);
			}
			break;
		case "2":
			Menu.menu_2();
			String nameOfFaculty=sc.next().toUpperCase();
			if(exist(University.values(),nameOfFaculty)){
				University university=University.valueOf(nameOfFaculty);
				for(int i=0; i<facultys.length; i++){
					if(facultys[i].getUniversity()==university){
					System.out.println(facultys[i]);
						}
					}
				}else{
					System.out.println("Not correct!!!");
				}
			break;
		case "3":
			Menu.menu_2();
			String nameOfGroup=sc.next().toUpperCase();
			if(exist(University.values(),nameOfGroup)){
				University university=University.valueOf(nameOfGroup);
				for(int i=0; i<groups.length; i++){
					if(groups[i].getUniversity()==university){
					System.out.println(groups[i]);
						}
					}
				}else{
					System.out.println("Not correct!!!");
				}
			
			break;
		case "4":
			Menu.menu_4();
			int count = sc.nextInt();
				for(int i=0; i<groups.length; i++){
					if(groups[i].getValueStudent()==count){
					System.out.println(groups[i]);
						}
					}
			break;
		case "5":
			Group[] groups1 = Group.values();
			for (int i = 0; i < groups1.length; i++) {
				System.out.println(groups[i]);
			}
			break;
		default:
			sc.close();
			return;
		}
	}
}
	
	
	static boolean exist(Enum<? extends University>[] enums, String name){
		for (int i = 0; i < enums.length; i++) {
			if(enums[i].name().equals(name)){
				return true;
			}
		}
		return false;
	}

}


