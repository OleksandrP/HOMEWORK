package core.less5.homework3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter you choise");
		Menu.FirstMenu();
		int i = sc.nextInt();
		boolean isRun = true;
		while(isRun)
		switch (i) {
			case 1:
				
				Menu.SecondMenu();
				int q = sc.nextInt();
				
				switch (q) {
					case 1:
						Menu.User();
						int we = sc.nextInt();
						AddUser user = new AddUser();
						user.userName("Ivan");
						user.userSurName("Ivanov");
						user.print();
						
						break;
					case 2:
						
						
						break;
					case 3:
						
						
						break;
					default:
					
						break;
					}
					break;
			case 2:
	
				break;
			case 3:
	
				break;
			default:
				break;
			}
		}

}
