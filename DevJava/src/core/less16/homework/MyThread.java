package core.less16.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MyThread extends Thread {
private static final Scanner sc = new Scanner(System.in);
	
private static volatile List<Integer>list = new ArrayList<>();
	
public MyThread(){
		start();
	}

@Override
	public void run() {
	
		System.out.println("Введіть кількість чисел Фібоначчі виб хотіли вивести на екран.");
		int number = sc.nextInt();
		int new1 =0;
		int new2=1;
		System.out.println(new1);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(new2);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		for(int i=3;i <= number;i++){
				for(int j=1; j<=1; j++) {
		int rez=new1+new2;
			System.out.println(rez);
			new1 =new2;
			new2 = rez;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
				super.run();
	}
	
}}
