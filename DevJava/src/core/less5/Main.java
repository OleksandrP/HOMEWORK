package core.less5;

public class Main {

	public static void main(String[] args) {
		Robot robot =new RobotDancer();
		robot.work();

		
		Bard bard=new Bard("Lutik");
		Ballada ballada=new SimpleBallada();
		bard.sing(ballada);
		bard.sing(new HeroBallada());// ��������� �������� ��������� �����. ����������� �����.
		
	}

}
