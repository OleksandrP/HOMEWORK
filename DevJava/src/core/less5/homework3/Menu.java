package core.less5.homework3;

public class Menu {

	static int FirstMenu(){
		System.out.println("1.User menu.");
		System.out.println("2.Book menu.");
		System.out.println("3.Rents menu.");
		return 0;
	}
	
	static int SecondMenu(){
		System.out.println("1.Create user.");
		System.out.println("2.Delete user");
		System.out.println("3.Show list of all user");
		return 1;
	}
	
	static int User(){
		System.out.println("Create new user, add username.");
		return 0;
	}
	
}
