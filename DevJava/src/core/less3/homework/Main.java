package core.less3.homework;

public class Main {

	public static void main(String[] args) {

		Robot Robot = new Robot();
		Robot.work();

		CoffeRobot CoffeeRobot = new CoffeRobot();
		CoffeeRobot.work();

		RobotDancer RobotDancer = new RobotDancer();
		RobotDancer.work();
		
		RobotCoocker RobotCoocker =new RobotCoocker();
		RobotCoocker.work();

	}
}
// ������� ������:
//
// �������� ���� Robot �� ����� ��� ����������� CoffeRobot,
// RobotDancer, RobotCoocker. � Robot � ����� work() , � ����� ���
// ������� ������ ��� ������ ����� � ������.
//
// ��� Robot � ����� work() ��� �������� ���, ��� �� ������� ���������
// ��������� ����� �� Robot � � ������ �������.
//
// ��� CoffeRobot � ����� work() ��� �������� ���, ��� �� �������
// ��������� ��������� ����� �� CoffeRobot � � ���� ����.
//
// ��� RobotDancer � ����� work() ��� �������� ���, ��� �� �������
// ��������� ��������� ����� �� RobotDancer � � ������ �������.
//
// ��� RobotCoocker � ����� work() ��� �������� ���, ��� �� �������
// ��������� ��������� ����� �� RobotCoocker � � ������ ������.
//
// �������� � Main ���� ���������� ����� ����� � ��������� �� ������� �
// ��� ����� work().