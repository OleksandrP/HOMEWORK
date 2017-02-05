package core.less5;

public class Circle implements RoundGeometric {

	public int r;
	
	public Circle(int r){
		this.r=r;
	}
	
	@Override
	public double square(){
		return PI*r*r;
	}
	
	@Override
	public double perimeter(){
	return 2*PI*r;	
	}

	
}
