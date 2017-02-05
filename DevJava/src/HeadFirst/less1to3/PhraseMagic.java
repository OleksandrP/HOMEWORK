package HeadFirst.less1to3;

public class PhraseMagic {

	public static void main(String[] args) {
		String [] wordListOne={"цілодобовий","трьох-звінний", "30000-футовий", "взаємно", "добрий виграш", "на основі веб-технології", "проникаючий", "розумно", "шість сигм", "метод критичного шляху", "динамічний"};
		String [] wordListTwo={"вповномочений","важкий","чистий продукт","орієнтований","центральний","розподілений","кластеризований","фірмовий","нестандартного розуму","позиціонований","сітковий","сфокусований","використовувати з вигодою","вирівняний","націлений на","загальний","прискорений"};
		String [] wordListThree={"прогрес","пункт розвантаження","вихід з положення","тип структури","талант","підхід","рівень завоювання уваги","портал","період часу","огляд","взірець","пункт слідування"};
		int oneLength = wordListOne.length;
		int twoLength = wordListTwo.length;
		int threeLength = wordListThree.length;
		
		int rand1=(int)(Math.random()*oneLength);
		int rand2=(int)(Math.random()*twoLength);
		int rand3=(int)(Math.random()*threeLength);
		
		String pharese = wordListOne[rand1]+" "+wordListTwo[rand2]+" "+wordListThree[rand3];
		System.out.println("Все, що вам потрібно, - це "+ pharese);
	}
}
