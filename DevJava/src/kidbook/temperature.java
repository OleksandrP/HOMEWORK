package kidbook;

public class temperature {

	public static void main(String[] args) {
		
		convertTemp(60,'C');

	}

	static void convertTemp(double temperature, char convertTo){
		if(convertTo=='C'){
			double F=1.8*temperature+32;
			System.out.println("Temperature "+F+" F");
		}else{
			double C=(temperature-32)/1.8;
			System.out.println("Temperature "+C+" C");
		}
	}
}
	