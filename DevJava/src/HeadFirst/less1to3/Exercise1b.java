package HeadFirst.less1to3;

public class Exercise1b {

	public static void main(String[] args) {
		one();
		two();
			}
			
	
	static void one() {
	int x=1;
	while(x<10){
	x=x+1;
	if (x>3){
	System.out.println("великий X");
			}
		}
	}
	static void two(){
		int x=5;
		while(x>1){
			x=x-1;
			if (x<3){
				System.out.println("Маленький х");
			}
		}
	}
	
	
}
