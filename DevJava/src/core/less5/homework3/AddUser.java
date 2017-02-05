package core.less5.homework3;

import java.util.Scanner;

public class AddUser {
	
	private String name;
	
	public void userName (String name) {   // Add User name
		Scanner sc = new Scanner(System.in);
		this.name=name;
	}
	
	private String  surName;
	
	public void userSurName(String  surName){
		this.surName=surName;
		//System.out.println("Add User Surname"+surname);
	}
	
	
	public void print(){
		System.out.println("You add name "+name+" and add Surname"+surName);
	}

}
