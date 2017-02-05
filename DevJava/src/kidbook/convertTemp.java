package kidbook;

public class convertTemp {
 
	int temperature;
	
	char convertTo;
		
	convertTemp(int temperature, char convertTo){
		this.temperature=temperature;
		this.convertTo=convertTo;
		if(convertTo=='F'){
			int C=(temperature-32)*(5/9);
			System.out.println("Temperature"+C+"C");
		}else{
			int F=temperature*((9/5)+32);
			System.out.println("Temperature"+F+"C");
		}
	}
}
