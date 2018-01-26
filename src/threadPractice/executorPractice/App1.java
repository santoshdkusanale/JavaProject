package threadPractice.executorPractice;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class App1 {
	
	public App1() {
		ExecutorService taskList = Executors.newFixedThreadPool(10);
		taskList.execute( new Counter( this , 6));
		taskList.execute( new Counter( this , 5));
		taskList.execute( new Counter( this , 4));
		System.out.println("Printing in main thread before shutdown");
		taskList.shutdown();
		
		System.out.println("Printing in main thread after shutdown");
	}

	public void pause(double seconds) {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(Math.round( 1000.0  * seconds));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
