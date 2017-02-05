package core.less16.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RunnableThread implements Runnable{
	private static final Scanner sc = new Scanner(System.in);
	private static volatile List<Integer>list = new ArrayList<>();
	
	
	//	RunnableThread thread;
	
	
	@Override
	public void run() {
		
		System.out.println("Введіть кількість чисел Фібоначчі виб хотіли вивести на екран.");
		int number = sc.nextInt();
		int new1 =0;
		int new2=1;
		System.out.println(new2);
		System.out.println(new1);
		
		
		for(int i=number;i <= 3;i--){
				for(int j=1; j<=1; j++) {
		int rez=new1+new2;
			System.out.println(rez);
			new1 =new2;
			new2 = rez;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
				
	}
		}

	

}