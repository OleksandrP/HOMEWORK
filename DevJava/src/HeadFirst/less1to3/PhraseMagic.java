package HeadFirst.less1to3;

public class PhraseMagic {

	public static void main(String[] args) {
		String [] wordListOne={"�����������","�����-������", "30000-�������", "������", "������ ������", "�� ����� ���-�������㳿", "�����������", "�������", "����� ����", "����� ���������� �����", "���������"};
		String [] wordListTwo={"�������������","������","������ �������","����������","�����������","�����������","���������������","��������","�������������� ������","��������������","�������","������������","��������������� � �������","���������","��������� ��","���������","�����������"};
		String [] wordListThree={"�������","����� �������������","����� � ���������","��� ���������","������","�����","����� ���������� �����","������","����� ����","�����","������","����� ���������"};
		int oneLength = wordListOne.length;
		int twoLength = wordListTwo.length;
		int threeLength = wordListThree.length;
		
		int rand1=(int)(Math.random()*oneLength);
		int rand2=(int)(Math.random()*twoLength);
		int rand3=(int)(Math.random()*threeLength);
		
		String pharese = wordListOne[rand1]+" "+wordListTwo[rand2]+" "+wordListThree[rand3];
		System.out.println("���, �� ��� �������, - �� "+ pharese);
	}
}
