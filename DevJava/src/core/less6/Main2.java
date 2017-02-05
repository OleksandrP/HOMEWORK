package core.less6;

public class Main2 {

	public static void main(String[] args) {
//		Header header=new IndexHeader();
//		Body body=new IndexBody();
//		Footer footer=new IndexFooter();
//		Enginee enginee=new Enginee(header, body, footer);
//		enginee. printPage();
//		System.out.println();
//		System.out.println();
//		System.out.println();
//		Body leftSide= new LeftSidebarBody();
//		Enginee left =new Enginee(header, leftSide, footer);
//		left.printPage();
//		System.out.println();
//		System.out.println();
//		System.out.println();
//		Body rigthSide= new RigthSideBarBody();
//		Enginee rigth =new Enginee(header, rigthSide, footer);
//		rigth.printPage();
//		System.out.println();
//		System.out.println();
//		System.out.println();
//		
//		Enginee rigthWithoutFooter = new Enginee(header, rigthSide, null);
//		rigthWithoutFooter.printPage();
		
		
		Enginee enginee=new Enginee(new IndexHeader(),new IndexBody(),new IndexFooter());
		enginee. printPage();
		System.out.println();
		System.out.println();
		System.out.println();
		Body leftSide= new LeftSidebarBody();
		Enginee left =new Enginee(enginee ,new LeftSidebarBody(), new IndexFooter());
		left.printPage();
		System.out.println();
		System.out.println();
		System.out.println();
		Body rigthSide= new RigthSideBarBody();
		Enginee rigth =new Enginee(enginee,new RigthSideBarBody(), new IndexFooter());
		rigth.printPage();
		System.out.println();
		System.out.println();
		System.out.println();
		
		Enginee rigthWithoutFooter = new Enginee(enginee, rigthSide, null);
		rigthWithoutFooter.printPage();
		
	}

}
