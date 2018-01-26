package threadPractice.executorPractice;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class RaceConditionApp implements Runnable {
	
	private final static int LOOP_LIMIT = 5;
	private final static int POOL_SIZE = 10;
	private int latestThreadNum = 0;
	
	public RaceConditionApp() {
		// TODO Auto-generated constructor stub
		ExecutorService taskList;
		taskList = Executors.newFixedThreadPool(POOL_SIZE);
		
		for (int i = 0 ; i < LOOP_LIMIT ; i++) {
			taskList.execute(this);
			
		}
		
		taskList.shutdown();
		taskList.awaitTermination();
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		synchronized(this) {
		int currentThreadNum = this.latestThreadNum;
		System.out.println("Set currentThreadNum to: " +currentThreadNum);
		this.latestThreadNum = currentThreadNum + 1;
		}
		/*for(int i=0 ; i < LOOP_LIMIT ; i++) {
			doSomeThingWithThread()
		}*/

	}

}
