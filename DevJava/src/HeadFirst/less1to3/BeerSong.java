package HeadFirst.less1to3;

public class BeerSong {

	public static void main(String[] args) {
		int beerNum=99;
		String word="пл€шок (пл€шка) ";
		while(beerNum>0){
			if (beerNum==1){
				word="пл€шка";
			}
			System.out.println(beerNum+ " "+word+" пива на ст≥н≥");
			System.out.println(beerNum+ " "+word+" пива");
			System.out.println("¬≥зьми одну.");
			System.out.println("ѕередай мен≥.");
			beerNum=beerNum-1;
			if(beerNum>0){
				System.out.println(beerNum+" "+word+" пива на ст≥н≥");
			}else{
				System.out.println("ЌемаЇ пива");
			}
		}

	}

}
