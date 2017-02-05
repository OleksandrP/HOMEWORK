package core.less16.homework;

//import java.util.Scanner;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
	//private static final Scanner sc = new Scanner(System.in);
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		//ExecutorService servise= Executors.newFixedThreadPool(10);	
		
		new MyThread();
		new Thread (new RunnableThread ()).start();
//		System.out.println("Done");
//		
//		Future<String> future =  servise.submit(new Callable<String>(){
//			@Override
//				public String call() throws Exception{
//				MyThread.sleep(1000);
//					return "s";
//				}
//
//			
//			});
//			
//				System.out.println(future.get());
//		servise.shutdown();
//		}
		
}
	}


