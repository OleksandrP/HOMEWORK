package core.less5;

public class Rectangle implements Geometric {

	private int a;
	
	private int b;
	
	public Rectangle(int a, int b){
		this.a=a;
		this.b=b;
	}
	
	@Override
	public double square(){
		return a*b;
	}
	@Override
	public double perimeter(){
		return(a+b)*2;
	}
}
