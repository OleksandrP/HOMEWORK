package core.less3;

public final class valueObjact {

	public final int size;
	
	public final String color;

	public valueObjact(final int size,final String color) {
		this.size = size;
		this.color = color;
	}
public valueObjact changeSize(final int size){
	return new valueObjact(size, color);

}
public valueObjact changeColor(final String color){
	return new valueObjact(size, color);

}

	@Override
	public String toString() {
		return "valueObjact [size=" + size + ", color=" + color + "]";
	}
	
	
	
}
