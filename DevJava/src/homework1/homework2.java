package homework1;

/*�������� ��������, �� �������� �� ����� ��������� �� 10 � ����
�����, ��������� � ���� m � n. ���������, ����� ����� 8,5 � 11,45
��������� �� ������ 11,45.*/

import java.util.Scanner;

public class homework2 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter first number = ");
		double rec= scan.nextDouble();
		System.out.print("Enter second number = ");
		double rec1= scan.nextDouble();
		double min1=10-rec;
		double min2=rec1-10;  //Math.abs- ������� ���������� �� ������.
		if (min1<min2){
			System.out.println("̳������� ��������� �������� �� 10 � " +rec);
		}else{
			System.out.println("̳������� ��������� �������� �� 10 � " +rec1);
		}
	}
}
