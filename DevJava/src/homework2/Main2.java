package homework2;
import  java.util.*;

public class Main2 {


		
			    public static void main(String[] args){
		        //�������� ����������, � ������� ������� �������� �����, ��������� �������������
		        int a;
		        Scanner scn=new Scanner(System.in);
		        System.out.println("������� ����������� �����");
		        //��������, �������� �� ��������� ���� ����������� ������
		        if(scn.hasNextInt()){
		            //���� �������� ��������, ���������� � ������������� �������� ���������� �����
		            a=scn.nextInt();
		            //�� ������� ������ ��� ���������� ����� ��� �������� �����, ��������� �������������. ����, ��� ���������� �������� - ��� ���� �����, � ���������� - 1, �������� ����: ���� ��� ������� �� ������ ��������� ����� �� ����� �� ������������� ��������� ��������� ����� 0, ����� ����� �������� ��������� ��������� �����, ������� � ������� �� �����
		            System.out.print("���������� ����� "+a+" �������� ");
		            for(int i=a;i>0;i--){
		                int b=a%i;
		                if(b==0)
		                    System.out.print(i+" ");
		            }
		        }else{
		        	System.out.println("������. ������� �� �����");
		        }
		    }
		    
}
	

	

