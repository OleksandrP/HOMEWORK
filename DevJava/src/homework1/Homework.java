package homework1;

import java.util.Scanner;

public class Homework {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);  // Ctrl+shift+o ��� �� �������� ��������
		System.out.println("Enter number X");
		int res = sc.nextInt();
		if((res%2)==0){
			System.out.println("����� X = "+res+" �����");
		}else{
			System.out.println("����� X = "+res+" �� �����");
		}
	}
}
